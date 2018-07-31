package com.test.exception;

public class Customer {

	private String name;
	private String address;
	
	public Customer() {
	}
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(String name,String address) {
		this.name = name;
		this.address = address;
	}
	
	
	public void changeCutomerDetails(Customer customer) {
		
		customer.name = "updated test";
		customer.address = "updateAddress";
		throw new TestRuntimeException();
		
	}
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
