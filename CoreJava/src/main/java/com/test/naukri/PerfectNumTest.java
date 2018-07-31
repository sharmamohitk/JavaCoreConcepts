package com.test.naukri;

public class PerfectNumTest {

	public PerfectNumTest() {
	}
	
	public static void main(String[] args) {
		
		int num = 6;
		int sum = 0;
		for(int i=1;i<=num/2;i++) {
			
			if(num%i ==0) {
				sum+=i;
			}
			
		}
		System.out.println(num == sum);
		
		
	}

}
