package com.test.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializableSingleton implements Serializable {

	private static final long serialVersionUID = 1L;
	private static SerializableSingleton instance;

	private SerializableSingleton() {

	}
	public static SerializableSingleton getInstance() {
		if (instance == null) {
			synchronized (SerializableSingleton.class) {
				if (instance == null) {
					instance = new SerializableSingleton();
				}
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return getInstance();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializableSingleton obj = SerializableSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("test.cer"));
		out.writeObject(obj);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("test.cer"));
		SerializableSingleton obj2 = (SerializableSingleton) in.readObject();
		in.close();

		System.out.println("obj hashcode " + obj.hashCode());
		System.out.println("obj2 hashcode " + obj2.hashCode());

		List<String> list = new ArrayList<>();
		// List<String> list = new CopyOnWriteArrayList<>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");

		List<String> synchronizedCollection = Collections.synchronizedList(list);
		synchronized (list) {
			for (String string : synchronizedCollection) {
				if (string.equals("test3"))
					list.add("test5");
			}

		}
	}
}
