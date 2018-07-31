package com.test.exception;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

	public Customer findByName(String name) throws NameNotFoundException {

		if ("".equals(name)) {
			throw new NameNotFoundException("Name is empty!");
		}

		return new Customer(name);

	}

	public Customer getError(String name) throws NameNotFoundException {

		if ("".equals(name)) {
			throw new ErrorNotFoundException("Error is empty!");
		}

		return new Customer(name);

	}

	public static void main(String[] args) {

		CustomerService obj = new CustomerService();

		try {
			Customer cus = obj.findByName("12");
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Customer error = obj.getError("34");
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}

		try {
			List<String> list = new ArrayList<>();
			list.add("test1");
			list.add(2, "test");
			int[] m = new int[] { 1, 2 };
		} catch (IndexOutOfBoundsException ex) {

		}

		Customer obj2 = new Customer("test name", "test address");
		try {
			obj2.changeCutomerDetails(obj2);
		} catch (Exception ex) {
			System.out.println("caught ex");
		}

		System.out.println(obj2.getName());
		System.out.println(obj2.getAddress());

	}
}
