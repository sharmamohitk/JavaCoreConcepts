package com.test.naukri;

public class FactorialTest {

	public FactorialTest() {
	}
	
	public static int getfactorial(int num) {
		
		if(num ==1)
			return num;
		return num*getfactorial(num-1);
		
	}

	public static void main(String[] args) {

		int num = 5;
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		// factorial of number using loop
		System.out.println(num +" factorial is "+fact);
		
		// recursively factorial of number
		System.out.println(10 +"'s factorial using recursive algorithem "+ getfactorial(10));
		
	}

}
