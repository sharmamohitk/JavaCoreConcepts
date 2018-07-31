package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestFilterMapJava8ForPerson {

	public static void main(String[] args) {
		
		 List<Person> persons = Arrays.asList(
	                new Person("mkyong", 30),
	                new Person("jack", 20),
	                new Person("lawrence", 40)
	        );
		 List<Person> personByName = getPersonByName(persons,"jack");
		 personByName.forEach(System.out::println);
		 
		 Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8,1, 2, 3, 4, 5, 6, 7, 8,1, 2, 3, 4, 5, 6, 7, 8,1, 2, 3, 4, 5, 6, 7, 8,1, 2, 3, 4, 5, 6, 7, 8,1, 2, 3, 4, 5, 6, 7, 8,1, 2, 3, 4, 5, 6, 7, 8,1, 2, 3, 4, 5, 6, 7, 8,1, 2, 3, 4, 5, 6, 7, 8 };
		 List<Integer> listOfIntegers =
		     new ArrayList<>(Arrays.asList(intArray));

		 System.out.println("listOfIntegers:");
		 listOfIntegers
		     .parallelStream()
		     .forEach(e -> System.out.print(e + " "));
		 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		 
		 
	}
	
	private static List<String> getPersonByNameList(List<Person> persons, String name) {
		List<String> collect = persons.stream().map( p-> p.getName()).collect(Collectors.toList());
		return collect;
	}

	private static List<Person> getPersonByName(List<Person> persons, String name) {
		
		persons = persons.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
		return persons;
		
	}
	
	
}
