package com.test.thread.concurrency.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerTest {

    public static void main(String[] args) throws Exception {

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);

        ProducerQueue producer = new ProducerQueue(queue);
        ConsumerQueue consumer = new ConsumerQueue(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
        
        Integer[] arr = new Integer[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr.length);
        
        
    }
}
