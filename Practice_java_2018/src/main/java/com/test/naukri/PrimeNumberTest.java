package com.test.naukri;

public class PrimeNumberTest {

	public PrimeNumberTest() {
	}

	public static void main(String[] args) {

		int num = 37;
		boolean isPrime = true;
		for(int i=2;i<num/2;i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime)
			System.out.println("Number is Prime !!");
		
	}

}
