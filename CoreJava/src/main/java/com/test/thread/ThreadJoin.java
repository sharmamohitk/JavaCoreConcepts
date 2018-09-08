package com.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadJoin extends Thread {

	static AtomicInteger atomicInteger = new AtomicInteger(0);
	public ThreadJoin() {

	}

	@Override
	public void run() {
		try {

			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " count is " + atomicInteger.addAndGet(1));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) throws InterruptedException {

		ThreadJoin th1 = new ThreadJoin();
		ThreadJoin th2 = new ThreadJoin();
		ThreadJoin th3 = new ThreadJoin();

		th1.start();
		th1.join();
       
		
		th2.start();
		th2.join();

		th3.start();
		th3.join();

	}
}
