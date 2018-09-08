package com.test.thread.concurrency.queue;

import java.util.concurrent.BlockingQueue;

public class ConsumerQueue implements Runnable{

    protected BlockingQueue<String> queue = null;

    public ConsumerQueue(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
        	System.out.println("consuming "+Thread.currentThread().getName());
            System.out.println(queue.take());
            System.out.println("consuming "+Thread.currentThread().getName());
            System.out.println(queue.take());
            System.out.println("consuming "+Thread.currentThread().getName());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}