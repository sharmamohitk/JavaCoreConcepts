package com.test.clone;

public class ParentClass {

	public String name;
	public String country;
	
	public ParentClass() {
	}
	
	public ParentClass(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
