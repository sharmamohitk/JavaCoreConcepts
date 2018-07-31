package com.test.algorithem.sort;

/**
 * 
 * @author SHARMAMOHI
 * guaranteed O(n*log(n))
 *
 */
public class MergeSortTest {

	private int[] arr;
	private int[] tempArr;
	private int length;

	public MergeSortTest() {
	}

	public static void main(String[] args) {
		int[] inputArr = { 4, 9, 98, 6, 77, -12, 34, 0, 78 };
		MergeSortTest mergeSort = new MergeSortTest();
		mergeSort.sort(inputArr);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}
		
	}

	private void sort(int[] inputArr) {

		this.arr = inputArr;
		length = inputArr.length;
		this.tempArr = new int[length];
		domergeSort(0, length - 1);
		

	}

	private void domergeSort(int start, int end) {

		if (start < end) {
			int middleIndex = start + (end - start) / 2;
			domergeSort(start, middleIndex);
			domergeSort(middleIndex+1, end);
			doMergepart(start, middleIndex, end);
		}

	}

	private void doMergepart(int start, int middleIndex, int end) {

		for (int i = start; i <= end; i++) {
			tempArr[i] = arr[i];
		}
		int i = start;
		int j = middleIndex + 1;
		int k = start;

		while (i <= middleIndex && j <= end) {
			if (tempArr[i] <= tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			} else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		while (i <= middleIndex) {
			arr[k] = tempArr[i];
			k++;
			i++;
		}

	}

}
