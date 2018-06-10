package com.test.designPattern.strategy.quack;

public class NoQuack implements IQuack {

	public NoQuack() {
	}

	@Override
	public void quack() {
		System.out.println("No Quack !!");

	}

}
