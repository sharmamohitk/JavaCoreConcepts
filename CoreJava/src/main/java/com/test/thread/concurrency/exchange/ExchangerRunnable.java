package com.test.thread.concurrency.exchange;

import java.util.concurrent.Exchanger;

public class ExchangerRunnable implements Runnable {

	Exchanger<Object> exchanger = null;
	Object test = null;

	public ExchangerRunnable(Exchanger<Object> exchanger, Object object) {
		this.exchanger = exchanger;
		this.test = object;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " before exchange object value is :: " + this.test);
			this.test = this.exchanger.exchange(this.test);
			System.out.println(Thread.currentThread().getName() + " after exchange object value is :: " + this.test);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
