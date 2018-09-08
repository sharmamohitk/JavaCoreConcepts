package com.test.thread.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutures {
	
	private static final int NTHREDS = 10;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		List<Future<Long>> list = new ArrayList<Future<Long>>();
		for (int i = 0; i <= 5; i++) {
			Callable<Long> worker = new MyCallable();
			Future<Long> submit = executor.submit(worker);
			list.add(submit);
		}
		
		// now retrieve the result
		for (Future<Long> future : list) {
			System.out.println(future.isDone());
			System.out.println(future.get());
		}
		System.out.println("called after loop");
		executor.shutdown();
	}
}
