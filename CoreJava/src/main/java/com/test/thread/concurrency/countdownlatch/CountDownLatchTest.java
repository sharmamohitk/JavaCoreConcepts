package com.test.thread.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(3);

		Waiter      waiter      = new Waiter(latch);
		DecrementerFirst decrementerFirst = new DecrementerFirst(latch);
		DecrementerSecond decrementerSecond = new DecrementerSecond(latch);
		DecrementerThird decrementerThird = new DecrementerThird(latch);

		new Thread(waiter).start();
		new Thread(decrementerFirst).start();
		new Thread(decrementerSecond).start();
		new Thread(decrementerThird).start();
		
	}

}
