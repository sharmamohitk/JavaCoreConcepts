package com.test.thread.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class DecrementerFirst implements Runnable {

    CountDownLatch latch = null;

    public DecrementerFirst(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {

        try {
        	
            Thread.sleep(2000);
            System.out.println("Thread "+Thread.currentThread().getName() + " decreasing the count by one");
            this.latch.countDown();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
