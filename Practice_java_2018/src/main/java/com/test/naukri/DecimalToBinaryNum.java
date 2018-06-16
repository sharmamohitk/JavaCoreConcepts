package com.test.naukri;

public class DecimalToBinaryNum {

	public DecimalToBinaryNum() {
	}
	
	public int[] getBinaryArr(int number) {
		int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
		int [] arrToReturn = new int[index];
		for(int i=0; i <= index-1; i++) {
			arrToReturn[i] = binary[i];
		}
		
			for (int i = 0; i < arrToReturn.length/2; i++) {
			int temp = arrToReturn[i];
			int length = arrToReturn.length-1;
			arrToReturn[i] = arrToReturn[length-i];
			arrToReturn[length-i] = temp;
		}
		
		return arrToReturn;
		
	}
	
	public static void main(String[] args) {
		
		DecimalToBinaryNum decimalToBinarNum = new DecimalToBinaryNum();
		int[] binaryArr = decimalToBinarNum.getBinaryArr(4);
		for (int i = 0; i < binaryArr.length; i++) {
			System.out.print(binaryArr[i]);
		}
	}

}
