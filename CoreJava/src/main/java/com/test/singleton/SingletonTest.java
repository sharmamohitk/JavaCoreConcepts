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

public class SingletonTest implements Cloneable , Serializable{
	
	private static final long serialVersionUID = -7604766932017737115L;

	private static SingletonTest instance;
	
	private SingletonTest() {
		
	}
	public Object  clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public static SingletonTest getSingleTonInstance() {
		if(null == instance) {
			synchronized (SingletonTest.class) {
				instance = new SingletonTest();
			}
		}
		return instance;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException {
		
		SingletonTest instance1 = SingletonTest.getSingleTonInstance();
		SingletonTest instance2 = SingletonTest.getSingleTonInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		SingletonTest instanceOne = SingletonTest.getSingleTonInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SingletonTest instanceTwo = (SingletonTest) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
		
	}
	
}
