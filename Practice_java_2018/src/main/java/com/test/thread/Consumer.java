package com.test.thread;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable{
	
	private List<Integer> sharedList = new ArrayList<>();
	private Integer capacity;
	
	public Consumer(List<Integer> sharedList , Integer capacity) {
		this.sharedList = sharedList;
		this.capacity = capacity;
	}
	

	@Override
	public void run() {
		
		for(int i=0;i<15;i++) {
			try {
				consume(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	private void consume(int i) throws InterruptedException {

		while (sharedList.size() == 0) {
			synchronized (sharedList) {
				System.out.println(
						Thread.currentThread().getName() + " had Consume all the product so cann't Consume more..");
				sharedList.wait();
			}
		}

		synchronized (sharedList) {
			System.out.println("Consumimg "+i);

			sharedList.remove(0);
			sharedList.notify();

		}

	}

}
