package com.test.java8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierFunctionExample {

	public static void main(String args[]) {
		
		SupplierFunctionExample instance = new SupplierFunctionExample();
		  //Supplier instance using method reference to a static method
		  Supplier<Date> dateSupplier= SupplierFunctionExample::getSystemDate;
		  Date systemDate = dateSupplier.get();
		  System.out.println("systemDate->" + systemDate);
		  List<String> strings = new ArrayList<>();
		  strings.add("test");
		  strings.add("jerry");
		  strings.forEach(SupplierFunctionExample::printStr);
		  
		  List<Integer> integers = new ArrayList<>();
		  integers.add(0);
		  integers.add(9);
		  List<String> stringFromInteger = integers.stream().map(instance::getRequiredString).collect(Collectors.toList());
		  stringFromInteger.forEach(SupplierFunctionExample::printStr);
		  
		 }
			
		public String getRequiredString(Integer intVal) {
			return  "test_"+ intVal;
		}
	
		 public static Date getSystemDate() {
		  return new Date();
		 }
		 
		 public static void printStr(String name) {
			 System.out.println("test ::: "+name);
		 }
		 
	}
