package com.test.naukri;

public class ArmstrongNumberTest {

	public ArmstrongNumberTest() {
	}
	public static void main(String[] args) {
		
		int number = 371;
		int numOfDigitsInNum = 0;
		int testArmNum = 0;
		int remainder;
		
		int temp = number;
		while(temp > 0) {
			numOfDigitsInNum++;
			temp = temp/10;
		}
		temp = number;
		
		while(temp > 0) {
			
			remainder = temp%10;
			int temp2 = 1;
			for(int i =0;i<numOfDigitsInNum ; i++) {
				temp2 = temp2*remainder;
			}
			testArmNum +=temp2;
			temp = temp/10;
			
		}
		if(testArmNum == number)
			System.out.println("Number is Armstrong !!");
		
	}

}
