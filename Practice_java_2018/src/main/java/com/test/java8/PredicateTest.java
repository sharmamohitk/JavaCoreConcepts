package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<Integer> equal99Predicate = Predicate.isEqual(99);
		Predicate<Integer> positivePredicate = i -> i >= 0;
		Predicate<Integer> greaterThanPredicate = i -> i > 50;
		List<Integer> integers = new ArrayList<>();
		integers.add(-99);
		integers.add(0);
		integers.add(99);
		integers.add(9);
		integers.add(19);
		integers.add(89);
		integers.add(79);
		integers.add(-89);
		List<Integer> filteredPositiveNumberList = integers.stream().filter(val -> positivePredicate.test(val)).collect(Collectors.toList());
		filteredPositiveNumberList.forEach(System.out::println);
		System.out.println("###################################");
		List<Integer> addingPositiveAndGreaterFiftyPredicateList = integers.stream().filter(val -> positivePredicate.and(greaterThanPredicate). test(val)).collect(Collectors.toList());
		addingPositiveAndGreaterFiftyPredicateList.forEach(System.out::println);
		System.out.println("###################################");
		List<Integer> negatePredicateList = integers.stream().filter(val -> positivePredicate.negate(). test(val)).collect(Collectors.toList());
		negatePredicateList.forEach(System.out::println);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		List<Integer> collect99 = integers.stream().filter(t -> equal99Predicate.test(t)).collect(Collectors.toList());
		collect99.forEach(System.out::println);
		
	}

}
