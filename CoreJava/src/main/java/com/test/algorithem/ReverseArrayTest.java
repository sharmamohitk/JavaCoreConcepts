package com.test.algorithem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

public class ReverseArrayTest {

	public ReverseArrayTest() {
	}
	
	// another method to reverse array
	static void rvereseArray(int arr[], int start, int end) {
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	// optimize approach
	public static void reverseArr(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			
			int temp = arr[i];
			int length = arr.length-1;
			arr[i] = arr[length-i];
			arr[length-i] = temp;
			
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {0,0,1};
		reverseArr(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] typesOfInsurance = {"Life Insurance", "Car Insurance", "Health Insurance"};
		List<String> asList = Arrays.asList(typesOfInsurance);
		Collections.reverse(asList);
		asList.forEach(System.out::println);
		
		// using apache arrayutils method 
		ArrayUtils.reverse(typesOfInsurance);
		
		String test = "Str reverse";
		String reverse = StringUtils.reverse(test);
		System.out.println(reverse);
		
	}

	
}
