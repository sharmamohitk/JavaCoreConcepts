package com.test.clone;

public class ChildTest extends ParentClass implements Cloneable{

	public String address;
	public int salary;
	
	public ChildTest() {
	}
	
	public ChildTest(String name, String country,String address, int salary) {
		super(name,country);
		this.address = address;
		this.salary = salary;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ChildTest child = new ChildTest("Tom","India","49 Noida",99000);
		ChildTest child2 =(ChildTest) child.clone();
		System.out.println(child2.name);
		
	}
}
