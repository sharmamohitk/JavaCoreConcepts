package com.test.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalMapFlapMapExample {
	
	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

	        if (gender.isPresent()) {
	            System.out.println("Value available.");
	        } else {
	            System.out.println("Value not available.");
	        }

	        gender.ifPresent(g -> System.out.println("In gender Option, value available."));
	        //condition failed, no output print
	        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));	
	        System.out.println(gender.orElse("<N/A>")); //MALE
	        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>
	        
	        List<String> myList = Stream.of("a", "b")
	        		  .map(String::toUpperCase)
	        		  .collect(Collectors.toList());
	        
	        myList.forEach(test -> System.out.println(test));
	        		
	        List<List<String>> list = Arrays.asList(
	        		  Arrays.asList("a"),
	        		  Arrays.asList("b"));
	        list
	        .stream()
	        .flatMap(Collection::stream)
	        .collect(Collectors.toList());
	}

}
