package com.test.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class ReflectionUtilMethodTest {

	public ReflectionUtilMethodTest() {
	}

	public static void main(String[] args) throws ClassNotFoundException {

		// java.lang.Class is the entry point for all the reflection operations. For
		// every type of object,
		// JVM instantiates an immutable instance of java.lang.Class that provides
		// methods to examine the
		// runtime properties of the object and create new objects, invoke its method
		// and get/set object fields
		// The required classes for reflection are provided under java.lang.reflect
		// package.
		// Reflection gives us information about the class to which an object belongs
		// and also the methods of that class which can be executed by using the object.
		// Through reflection we can invoke methods at runtime irrespective of the
		// access specifier used with them.

		// We can get Class of an object using three methods – through static variable
		// class, using getClass() method of object
		// and java.lang.Class.forName(String fullyClassifiedClassName). For primitive
		// types and arrays, we can use static variable class.
		// Wrapper classes provide another static variable TYPE to get the class.

		Class<?> concreteClz1 = ConcreteClass.class;
		Class<?> concreteClz2 = new ConcreteClass(88).getClass();
		Class<?> concreteClz3 = Class.forName("com.test.reflection.ConcreteClass");
		Class<?> superClz = Class.forName("com.test.reflection.ConcreteClass").getSuperclass();

		// This includes public class and interface members inherited from superclasses
		// and public class and interface members declared by the class
		Class<?>[] declaredPublicClasses = Class.forName("com.test.reflection.ConcreteClass").getClasses();

		System.out.println(concreteClz3.getName());
		System.out.println(superClz.getName());
		for (int i = 0; i < declaredPublicClasses.length; i++) {
			System.out.println(declaredPublicClasses[i]);
		}
		System.out.println("#####################@@@@@@@@@@@@@@@@@@@@@@@@");
		// The returned array doesn’t include classes declared in inherited classes and
		// interfaces.
		Class<?>[] declaredClasses = Class.forName("com.test.reflection.ConcreteClass").getDeclaredClasses();
		for (int i = 0; i < declaredClasses.length; i++) {
			System.out.println(declaredClasses[i]);
		}
		// get package
		Package package1 = concreteClz3.getPackage();
		System.out.println(package1);

		// get modifiers
		int modifiers = concreteClz3.getModifiers();
		System.out.println(Modifier.toString(modifiers));

		// get type parameter associated with class
		TypeVariable<?>[] typeParameters = concreteClz3.getTypeParameters();
		System.out.println(typeParameters);

		// get all implemented interfaces
		Type[] genericInterfaces = concreteClz3.getGenericInterfaces();
		for (int i = 0; i < genericInterfaces.length; i++) {
			System.out.println(genericInterfaces[i].getTypeName());
		}

		// get all public methods
		Method[] methods = concreteClz3.getMethods();
		System.out.println(Arrays.toString(methods));

		// get all public constructor
		Constructor<?>[] constructors = concreteClz3.getConstructors();
		System.out.println(Arrays.toString(constructors));

		// get all public fields
		Field[] fields = concreteClz3.getFields();
		System.out.println(Arrays.toString(fields));

		// get all annotations
		Annotation[] annotations = concreteClz3.getAnnotations();
		System.out.println(Arrays.toString(annotations));

		Class<?> concreteClz4 = Class.forName("com.test.reflection.BaseInterface");
		Method[] methods2 = concreteClz4.getMethods();
		System.out.println(Arrays.toString(methods2));
	}

}
