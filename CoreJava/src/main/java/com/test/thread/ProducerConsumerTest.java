package com.test.thread;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerTest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		Thread producerThread = new Thread(new Producer(list, 10), "Producer");
		Thread consumerThread = new Thread(new Consumer(list, 10), "Consumer");

		producerThread.start();
		consumerThread.start();

	}

}
