package com.test.thread.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public SemaphoreTest() {
	}

	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(2);
		/*SemaphoreThread thread1 = new SemaphoreThread(semaphore, "Thread1");
		SemaphoreThread thread2 = new SemaphoreThread(semaphore, "Thread2");
		SemaphoreThread thread3 = new SemaphoreThread(semaphore, "Thread3");
		thread1.start();
		thread2.start();
		thread3.start();*/
		
		SemThreadA threadA = new SemThreadA(semaphore, "ThreadA");
		SemThreadB threadB = new SemThreadB(semaphore, "ThreadB");
		threadA.start();
		threadB.start();

	}
}
