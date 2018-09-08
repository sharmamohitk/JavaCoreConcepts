package com.test.thread.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreThread extends Thread {
	Semaphore semaphore = null;

	public SemaphoreThread(Semaphore semaphore, String name) {
		super(name);
		this.semaphore = semaphore;
	}

	public void run() {
		try {
				System.out.println("RecevingThread running before accquire lock !! "+ Thread.currentThread().getName());
				this.semaphore.acquire();
				Thread.sleep(6000);
				System.out.println("RecevingThread running before release lock !! "+Thread.currentThread().getName());
				this.semaphore.release();
				return;
		} catch (Exception ex) {

		}
	}
}