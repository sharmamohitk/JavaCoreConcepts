package com.test.immutable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestImmutable {
	
	public static void main(String[] args)
    {
		Map<String,Integer> mapTest = new HashMap<>();
		mapTest.put("Test1", 98);
		mapTest.put("test2", 99);
        ImmutableClass im = ImmutableClass.getInstance("Tommy","India",99000, new Date(),mapTest);
        System.out.println(im);
        tryModification(im.getName(),im.getCountry(), im.getSalary(), im.getMutableField(),im.getIntegersMap());
        System.out.println(im);
    }
 
    @SuppressWarnings("deprecation")
	private static void tryModification(String name, String country,Integer salary, Date mutableField , Map<String,Integer> map)
    {
        mutableField.setDate(10);
        map.put("test3", 78);
    }

}
