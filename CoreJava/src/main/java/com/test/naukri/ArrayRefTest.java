package com.test.naukri;

public class ArrayRefTest {
	public static void main(String args[]) {
		int i[] = { 1 };
		change_i2(i);
		System.out.println(i[0]);
		int k = 8;
		int l = 6;
		System.out.println(k++);
		System.out.println(k);
		// System.out.println(++l);
		// change_i1(i);
		// System.out.println(i[0]);
	}

	public static void change_i2(int i[]) {
		i[0] = 2;
		i[0] *= 2;
	}

	public static void change_i1(int i[]) {
		int j[] = { 2 };
		i = j;
		System.out.println("change_i " + i[0]);
	}
}
