package com.test.thread;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
	private List<Integer> sharedList = new ArrayList<>();
	private Integer capacity;

	public Producer(List<Integer> sharedList, Integer capacity) {
		this.sharedList = sharedList;
		this.capacity = capacity;
	}

	@Override
	public void run() {

		for (int i = 0; i < 15; i++) {
			try {
				produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {

		while (capacity == sharedList.size()) {
			synchronized (sharedList) {
				System.out.println(
						Thread.currentThread().getName() + " had Produce the max product so cann't produce more..");
				sharedList.wait();
			}
		}

		synchronized (sharedList) {
			System.out.println("Producing " + i);
			sharedList.add(i);
			sharedList.notify();

		}

	}

}
