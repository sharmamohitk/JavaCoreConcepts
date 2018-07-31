package com.test.naukri;

public class PyramidTest {

	/** print pyramid and triangle in both order i.e. reverse too **/
	public static void main(String[] args) {

		System.out.println("print star pyramid ################");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("print number pyramid ################");
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		System.out.println("print star pyramid in reverse ################");

		for (int i = 7; i >= 0; i--) {
			for (int k = 1; k <= 7 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println(" print star triangle ################");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("print star triangle in reverse ################");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
