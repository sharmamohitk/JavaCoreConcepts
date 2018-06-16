package com.test.diamond;

// if we try to extends classB too then compiler will not compile the error
// so java does not allow multiple inheritance in class because here we do have
// ambiguity i.e. compiler will confuse which method need to invoke as both 
// classA and classB having same method signature
// this is diamond problem in java
public class MultipleInheritanceTest extends ClassA {

	public void test(){
		doSomething();
	}

}
