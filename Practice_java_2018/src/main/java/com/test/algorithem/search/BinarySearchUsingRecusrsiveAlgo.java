package com.test.algorithem.search;

/**
 * 
 * @author SHARMAMOHI
 * Worst case performance: O(log n)
 * Best case performance: O(1)
 *
 */
public class BinarySearchUsingRecusrsiveAlgo {

	public BinarySearchUsingRecusrsiveAlgo() {
	}
	
	public static int binaryRecursiveSearchMethod(int[] arr, int start,int end, int element) {
		
		if(start < end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == element) {
				return mid;
			}
			if(arr[mid] > element) {
				return binaryRecursiveSearchMethod(arr,start,end-1,element);
			}
			if(arr[mid] < element) {
				return binaryRecursiveSearchMethod(arr, mid+1, end, element);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] sortedArr = { 2, 4, 6, 8, 10, 12, 14, 16 };
		System.out.println(binaryRecursiveSearchMethod(sortedArr,  0,  sortedArr.length-1, 160));

		
	}

}
