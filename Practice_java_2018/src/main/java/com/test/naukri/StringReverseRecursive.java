package com.test.naukri;

public class StringReverseRecursive {

	public static String getReverseString(String str) {

		if (str.length() == 1) {
			return str;
		}
		return str.substring(str.length() - 1) + 
								getReverseString(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {

		String test = "madam";
		String reverseString = getReverseString(test);
		if (test.equals(reverseString))
			System.out.println("String is Palindrome !!");
	}

}
