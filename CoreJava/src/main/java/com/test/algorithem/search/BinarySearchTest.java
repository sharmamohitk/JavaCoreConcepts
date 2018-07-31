package com.test.algorithem.search;


/**
 * 
 * @author SHARMAMOHI
 * Worst case performance: O(log n)
 * Best case performance: O(1)
 *
 */
public class BinarySearchTest {

	public BinarySearchTest() {
	}

	public static int binarySearch(int[] arr, int element) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == element) {
				return mid;
			}
			if (arr[mid] > element) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] sortedArr = { 2, 4, 6, 8, 10, 12, 14, 16 };
		System.out.println(binarySearch(sortedArr, 1));

	}

}
