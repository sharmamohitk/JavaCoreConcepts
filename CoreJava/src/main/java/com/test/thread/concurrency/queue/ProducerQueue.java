package com.test.thread.concurrency.queue;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable{

    protected BlockingQueue<String> queue = null;

    public ProducerQueue(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
        	System.out.println("producing "+Thread.currentThread().getName());
            queue.put("1");
            Thread.sleep(1000);
            System.out.println("producing "+Thread.currentThread().getName());
            queue.put("2");
            Thread.sleep(1000);
            System.out.println("producing "+Thread.currentThread().getName());
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
