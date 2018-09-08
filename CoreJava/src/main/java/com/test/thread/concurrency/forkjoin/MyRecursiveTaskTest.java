package com.test.thread.concurrency.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class MyRecursiveTaskTest {

	public static void main(String[] args) {

		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		MyRecursiveTask myRecursiveTask = new MyRecursiveTask(128);
		long mergedResult = forkJoinPool.invoke(myRecursiveTask);
		System.out.println("mergedResult = " + mergedResult);
	}

}
