package com.test.naukri;

public class PalindromeTestNumber {

	public static void main(String[] args) {
		
		
		int number = 121;
		int reverseNum = 0;
		int temp = number;
		int remainder;
		
		while(temp > 0) {
			
			remainder = temp%10;
			reverseNum = reverseNum*10 +remainder;
			temp = temp/10;
		}
		
		
		
		System.out.println(reverseNum);
		if(reverseNum == number) {
			System.out.println("Palindrome !!");
		}
		
		
	}
}
