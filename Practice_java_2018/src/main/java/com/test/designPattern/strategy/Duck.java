package com.test.designPattern.strategy;

import com.test.designPattern.strategy.display.IDisplay;
import com.test.designPattern.strategy.quack.IQuack;
import com.test.designPattern.strategy.strategy.fly.IFly;

public class Duck {

	private IDisplay display;
	private IQuack quack;
	private IFly flay;
	
	public Duck(IDisplay display, IQuack quack, IFly flay) {
		super();
		this.display = display;
		this.quack = quack;
		this.flay = flay;
	}

	public Duck() {
	}
	
	public IDisplay getDisplay() {
		return display;
	}

	public void setDisplay(IDisplay display) {
		this.display = display;
	}

	public IQuack getQuack() {
		return quack;
	}

	public void setQuack(IQuack quack) {
		this.quack = quack;
	}

	public IFly getFlay() {
		return flay;
	}

	public void setFlay(IFly flay) {
		this.flay = flay;
	}

}
