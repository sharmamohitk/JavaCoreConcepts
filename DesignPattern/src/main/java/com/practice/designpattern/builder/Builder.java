package com.practice.designpattern.builder;

public class Builder {

	    public static void main(String[] args)
	    {
	        HouseBuilder urbanHouseBuilder = new UrbanHouseBuilder();
	        CivilEngineer engineer = new CivilEngineer(urbanHouseBuilder);
	 
	        engineer.constructHouse();
	        House house = engineer.getHouse();
	 
	        System.out.println("Builder constructed: "+ house);
	    }
	}
