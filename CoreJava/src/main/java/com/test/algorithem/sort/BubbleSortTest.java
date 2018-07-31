package com.test.algorithem.sort;

/**
 * 
 * @author SHARMAMOHI
 *average complexity both О(n2)
 *
 */
public class BubbleSortTest {

	public BubbleSortTest() {
	}

	public static void bubble_sort(int[] arr) {
		
		int length = arr.length;
		int temp;
		
		for (int m= length;  m >0; m--) {
			for (int j = 0; j < length-1; j++) {
				temp = j+1;
				if(arr[j] > arr[temp]) {
					int tempNum = arr[j];
					arr[j] = arr[temp];
					arr[temp] = tempNum;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] inputArr = { 4, 9, 98, 6, 77, -12, 34, 0, 78 };
		bubble_sort(inputArr);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}
	}

}
