package com.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionOperations {

	public ReflectionOperations() {
	}

	public static void main(String[] args) {

		try {

			Class<?> clz = Class.forName("com.test.reflection.ConcreteClass");
			// accessing public field
			Field field = clz.getField("publicInt");
			Class<?> fieldType = field.getType();
			System.out.println(fieldType.getName());
			ConcreteClass obj = new ConcreteClass(5, 88);
			// setting the new value to field
			field.setInt(obj, 10);
			System.out.println(field.get(obj));
			// If the field is static, we can pass Object as null in get() method.

			// accessing the private field
			Field declaredPrivateField = clz.getDeclaredField("privateString");
			declaredPrivateField.setAccessible(true);
			ConcreteClass objTest = new ConcreteClass(1);
			System.out.println(declaredPrivateField.get(objTest)); // prints "private string"
			declaredPrivateField.set(objTest, "private string updated");
			System.out.println(declaredPrivateField.get(objTest)); // prints "private string updated"

			// get public method
			Method method = clz.getMethod("method2", new Class[] { Integer.TYPE });
			System.out.println(method.invoke(clz.newInstance(), 78));
			// if method is static then we can null instead if clz.newInstance()

			// get private method
			Method declaredPrivateMethod = clz.getDeclaredMethod("method3", new Class[] { String.class });
			declaredPrivateMethod.setAccessible(true);
			declaredPrivateMethod.invoke(clz.newInstance(), "test");

			// Reflection get instance from constructor
			Constructor<?> constructor = Class.forName("com.test.reflection.ConcreteClass").getConstructor();
			ConcreteClass newInstance = (ConcreteClass) constructor.newInstance();
			Method myObjMethod = newInstance.getClass().getMethod("method1", null);
			myObjMethod.invoke(newInstance, null);

		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException | IllegalArgumentException
				| IllegalAccessException | NoSuchMethodException | InvocationTargetException
				| InstantiationException e) {

		}

	}

}
