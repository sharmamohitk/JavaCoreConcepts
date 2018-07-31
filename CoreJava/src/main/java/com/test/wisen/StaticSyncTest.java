package com.test.wisen;

public class StaticSyncTest {

	private String name;

	public StaticSyncTest(String name) {
		this.name = name;
	}

	public static synchronized void staticSyncMethod() {

		System.out.println("SM1 ");
		System.out.println("SM2 ");

	}

	public synchronized void syncMethod() {

		System.out.println(name + "M1 ");
		System.out.println(name + "M2 ");

	}

	public static void main(String[] args) throws InterruptedException {

		StaticSyncTest test = new StaticSyncTest("o1");

		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				test.syncMethod();
			}
		});

		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				staticSyncMethod();
			}
		});

		Thread th3 = new Thread(new Runnable() {

			@Override
			public void run() {
				staticSyncMethod();
			}
		});
		th1.start();
		th2.start();
		th3.start();

		th1.join();
		th2.join();
		th3.join();

	}

}
