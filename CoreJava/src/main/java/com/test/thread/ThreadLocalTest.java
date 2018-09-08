package com.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalTest extends Thread {

	static AtomicInteger atomicInteger = new AtomicInteger(0);
	ThreadLocal<Integer> thLocal = new ThreadLocal<>();

	@Override
	public void run() {
		try {
			
			thLocal.set(atomicInteger.addAndGet(2));
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " value from thread local " + thLocal.get());
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) throws InterruptedException {

		ThreadLocalTest th1 = new ThreadLocalTest();
		ThreadLocalTest th2 = new ThreadLocalTest();
		ThreadLocalTest th3 = new ThreadLocalTest();

		th1.start();
		th2.start();
		th3.start();

	}
}
