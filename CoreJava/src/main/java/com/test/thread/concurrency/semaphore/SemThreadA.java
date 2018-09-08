package com.test.thread.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class SemThreadA extends Thread {
	Semaphore semaphore = null;

	public SemThreadA(Semaphore semaphore, String name) {
		super(name);
		this.semaphore = semaphore;
	}

	public void run() {
		try {
				System.out.println("ThreadA running before accquire lock !! "+ Thread.currentThread().getName());
				this.semaphore.acquire();
				Thread.sleep(6000);
				System.out.println("ThreadA running before done !! "+Thread.currentThread().getName());
				return;
		} catch (Exception ex) {

		}
	}
}