package com.test.algorithem.sort;

/**
 * 
 * @author SHARMAMOHI
 * average case is Θ(n log(n))
 * worst case is Θ(n2)
 *
 */
public class QuickSortTest {

	static int[] arr;

	public QuickSortTest() {
	}

	public static void quickSort(int start, int end) {

		int midElement = arr[start + (end - start) / 2];
		int i = start;
		int j = end;

		while (i <= j) {
			while (arr[i] < midElement) {
				i++;
			}
			while (arr[j] > midElement) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if (start < j)
			quickSort(start, j);
		if (i < end)
			quickSort(i, end);
	}

	public static void main(String[] args) {

		int[] inputArr = { 4, 9, 98, 6, 77, -12, 34, 0, 78 };
		arr = inputArr;
		quickSort(0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
