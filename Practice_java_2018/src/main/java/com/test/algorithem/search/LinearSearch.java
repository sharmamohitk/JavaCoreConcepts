package com.test.algorithem.search;

import java.util.Scanner;


/**
 * 
 * @author SHARMAMOHI
 * Worst case performance: O(n)
 * Best case performance: O(1)
 *
 */
public class LinearSearch {

	public LinearSearch() {
	}

	public static boolean linearSearch(int[] arr, int element) {

		boolean isElementExists = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				isElementExists = true;
				break;
			}

		}
		return isElementExists;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 99, 0, 88, 78, 77, 23, 45, 21, 55, 234, 1, 34, 90 };
		Scanner scanner = new Scanner(System.in);
		int numSearch = scanner.nextInt();
		boolean linearSearch = linearSearch(arr, numSearch);
		System.out.println(linearSearch);
		scanner.close();

	}

}
