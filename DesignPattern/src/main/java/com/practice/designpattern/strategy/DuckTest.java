package com.practice.designpattern.strategy;

import com.practice.designpattern.strategy.display.IDisplay;
import com.practice.designpattern.strategy.display.JetDisplay;
import com.practice.designpattern.strategy.display.SimpleDisplay;
import com.practice.designpattern.strategy.quack.IQuack;
import com.practice.designpattern.strategy.quack.JetQuack;
import com.practice.designpattern.strategy.quack.SimpleQuack;
import com.practice.designpattern.strategy.strategy.fly.IFly;
import com.practice.designpattern.strategy.strategy.fly.JetFly;
import com.practice.designpattern.strategy.strategy.fly.SimpleFly;

public class DuckTest {

	public DuckTest() {
	}
	
	public static void main(String[] args) {
		
		// we can create instance of any type i.e. it can be either
		// Wild duck ( Duck lives in forest)
		// wild duck having it's own behavior like fly , display quack
		
		IQuack wildQuack = new SimpleQuack();
		IDisplay wildDisplay = new SimpleDisplay();
		IFly wildFly = new SimpleFly();
		
		Duck wildDuck = new Duck(wildDisplay, wildQuack, wildFly);
		wildDuck.getFlay().fly();
		wildDuck.getQuack().quack();
		wildDuck.getDisplay().display();
		
		// we can create instance of any type i.e. it can be either
		// Mountain duck ( Duck lives in mountain)
		// Mountain duck having it's own behavior like fly , display quack
		
		IQuack mountainQuack = new JetQuack();
		IDisplay mountainDisplay = new JetDisplay();
		IFly mountainFly = new JetFly();
		
		Duck mountainDuck = new Duck(mountainDisplay, mountainQuack, mountainFly);
		mountainDuck.getFlay().fly();
		mountainDuck.getQuack().quack();
		mountainDuck.getDisplay().display();
		
		// try to implement the same behavior using the inheritance then you 
		// will understood the difference
		
		
	}

}
