package com.test.generics;

import java.util.ArrayList;
import java.util.List;

public class ExtendsWildCardTest {

	public ExtendsWildCardTest() {
	}
	
	public static void processElements(List<? extends A> elements){
		   for(A a : elements){
		      System.out.println(a.getValue());
		   }
		}
	
	public static void main(String[] args) {
		
		
		//List<? extends A> means a List of objects that are instances of the class A, or subclasses of A (e.g. B and C).
		List<A> listA = new ArrayList<A>();
		processElements(listA);

		List<B> listB = new ArrayList<B>();
		processElements(listB);

		List<C> listC = new ArrayList<C>();
		processElements(listC);
		
		//he processElements() method still cannot insert elements into the list, 
		//because you don't know if the list passed as parameter is typed to the class A, B or C.
		
	}

}
