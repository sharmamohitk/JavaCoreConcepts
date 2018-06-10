package com.test.designPattern.strategy;

import com.test.designPattern.strategy.display.IDisplay;
import com.test.designPattern.strategy.display.JetDisplay;
import com.test.designPattern.strategy.display.SimpleDisplay;
import com.test.designPattern.strategy.quack.IQuack;
import com.test.designPattern.strategy.quack.JetQuack;
import com.test.designPattern.strategy.quack.SimpleQuack;
import com.test.designPattern.strategy.strategy.fly.IFly;
import com.test.designPattern.strategy.strategy.fly.JetFly;
import com.test.designPattern.strategy.strategy.fly.SimpleFly;

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
