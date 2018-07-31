package com.test.immutable;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class ImmutableClass {
	
	private final String name;
	private final String country;
	private final Integer salary;
	private final  Date mutableField;
	private final Map<String,Integer> integersMap;
	
	private ImmutableClass(String name,String country,Integer salary,Date date , Map<String,Integer> integersMap) {
		
		this.name = name;
		this.country = country;
		this.salary = salary;
		this.mutableField = new Date(date.getTime());
		this.integersMap = integersMap;
	}
	
	
	public static ImmutableClass getInstance(String name,String country,Integer salary,Date date,Map<String,Integer> integersMap) {
		return new ImmutableClass(name,country,salary,date,integersMap);
	}
	
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public Map<String, Integer> getIntegersMap() {
		Map<String,Integer> tempMap = new HashMap<>();
		Iterator<Entry<String, Integer>> iterator = integersMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			tempMap.put(next.getKey(), next.getValue());
		}
		return tempMap;
	}

	public Integer getSalary() {
		return salary;
	}
	public Date getMutableField() {
		return new Date(mutableField.getTime());
	}
	
	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", country=" + country + ", salary=" + salary + ", mutableField="
				+ mutableField + ", integersMap=" + integersMap + "]";
	}

}
