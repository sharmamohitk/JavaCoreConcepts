package com.test.thread.concurrency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {
	@Override
	public Long call() throws Exception {
		long sum = 0;

		for (long i = 1; i <= 5; i++) {

			Thread.sleep(2000);

			sum += i;
		}

		return sum;
	}

	public static void test(String num) {
		System.out.println("Num");
	}

	public static void test(Object num) {
		System.out.println("Object");
	}

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "1");
		test("1");
		String sp = " ";
		String test = "test" + sp + sp;
		test.concat("123");
		System.out.println(test);

		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.remove(0);

		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);

		}

	}
}
