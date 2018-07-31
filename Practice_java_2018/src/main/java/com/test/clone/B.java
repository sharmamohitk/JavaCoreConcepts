package com.test.clone;

public class B extends A implements Cloneable{

	public B() {
		super("test");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		B b = new B();
		B clone = (B)b.clone();
		System.out.println(clone.name);
		
	}

}
