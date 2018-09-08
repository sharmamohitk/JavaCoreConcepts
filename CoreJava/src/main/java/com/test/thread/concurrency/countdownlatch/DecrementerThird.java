package com.test.thread.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class DecrementerThird implements Runnable {

    CountDownLatch latch = null;

    public DecrementerThird(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {

        try {
        	
        	Thread.sleep(8000);
        	System.out.println("Thread "+Thread.currentThread().getName() + " decreasing the count by one");
            this.latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
