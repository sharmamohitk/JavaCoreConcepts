package com.test.generics;

import java.util.ArrayList;
import java.util.List;

public class SuperWildcardTest {

	public SuperWildcardTest() {
	}
	
	public static void insertElements(List<? super A> list){
	    list.add(new A());
	    list.add(new B());
	    list.add(new C());
	}
	
	public static void main(String[] args) {
		
		//List<? super A> means that the list is typed to either the A class, or a superclass of A.
		
		List<A>      listA      = new ArrayList<A>();
		insertElements(listA);
		System.out.println("listA size "+listA.size());

		List<Object> listObject = new ArrayList<Object>();
		insertElements(listObject);
	}

}
