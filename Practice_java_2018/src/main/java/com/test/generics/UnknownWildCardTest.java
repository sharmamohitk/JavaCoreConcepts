package com.test.generics;

import java.util.ArrayList;
import java.util.List;

public class UnknownWildCardTest {

	public UnknownWildCardTest() {
	}
	
	public static void processElements(List<?> elements){
		   for(Object o : elements){
		      System.out.println(o);
		   }
	}
	
	public static void main(String[] args) {
		
		// List<?> means a list typed to an unknown type. This could be a List<A>, a List<B>, a List<String> etc
		// in this case you only read the element from list
		
		List<A> listA = new ArrayList<A>();
		processElements(listA);
		List<B> listB = new ArrayList<B>();
		processElements(listB);
		
		
	}

}
