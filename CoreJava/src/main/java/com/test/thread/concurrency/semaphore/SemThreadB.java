package com.test.thread.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class SemThreadB extends Thread {
	Semaphore semaphore = null;

	public SemThreadB(Semaphore semaphore, String name) {
		super(name);
		this.semaphore = semaphore;
	}

	public void run() {
		try {
				System.out.println("ThreadB running before release lock !! "+ Thread.currentThread().getName());
				this.semaphore.acquire();
				Thread.sleep(6000);
				System.out.println("ThreadB running before done !! "+Thread.currentThread().getName());
				return;
		} catch (Exception ex) {

		}
	}
}