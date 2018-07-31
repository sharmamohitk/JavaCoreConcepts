package com.practice.designpattern.strategy.quack;

public class NoQuack implements IQuack {

	public NoQuack() {
	}

	public void quack() {
		System.out.println("No Quack !!");

	}

}
