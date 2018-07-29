package com.test.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericAssignmentProblem {

	public GenericAssignmentProblem() {
	}
	
	public static void main(String[] args) {
		
		List<A> listA = new ArrayList<A>();
		List<B> listB = new ArrayList<B>();
		
		//Type mismatch: cannot convert from ArrayList<B> to List<A>
		//List<A> listTest = new ArrayList<B>();
		
		// compile time error
		// Type mismatch: cannot convert from List<B> to List<A>
		// listA = listB;
		
		// compile time error
		//Type mismatch: cannot convert from List<A> to List<B>
		//listB = listA;
		
		// what is the need for such assignment
		//when creating reusable methods that operate on collections of a specific type.
		
		// generic wildcard is the solution of this problem
				
	}

}
