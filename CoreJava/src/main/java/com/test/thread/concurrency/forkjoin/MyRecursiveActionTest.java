package com.test.thread.concurrency.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class MyRecursiveActionTest {

	public MyRecursiveActionTest() {
	}
	
	public static void main(String[] args) {
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		MyRecursiveAction myRecursiveAction = new MyRecursiveAction(64);
		forkJoinPool.invoke(myRecursiveAction);
		
	}

}
