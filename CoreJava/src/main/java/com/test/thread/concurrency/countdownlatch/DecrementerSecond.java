package com.test.thread.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class DecrementerSecond implements Runnable {

    CountDownLatch latch = null;

    public DecrementerSecond(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {

        try {
        	
        	Thread.sleep(5000);
        	System.out.println("Thread "+Thread.currentThread().getName() + " decreasing the count by one");
            this.latch.countDown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
