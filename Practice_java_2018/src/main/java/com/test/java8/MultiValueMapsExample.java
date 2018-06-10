package com.test.java8;

import java.util.*;
public class MultiValueMapsExample {
  static Map<Integer, List<Person>> PersonDOJMap = new HashMap<>();
   
  public static void main(String args[]) {
 
    List<Person> list2014 = Arrays.asList(
        new Person("Deborah Sprightly", 29, 9000));
    PersonDOJMap.put(2014, list2014);
    List<Person> list2015 = Arrays.asList(
        new Person("Tom Jones", 45, 7000),
        new Person("Harry Major", 25, 10000));
    PersonDOJMap.put(2015, list2015);
    List<Person> list2016 = Arrays.asList(
        new Person("Ethan Hardy", 65, 8000),
        new Person("Nancy Smith", 22, 12000));
    PersonDOJMap.put(2016, list2016);
    
    System.out.println("Using Map.forEach to print the Employee in employeeDOJMap multi-value map\n");
    PersonDOJMap.forEach((year,empList)->System.out.println(year+"-->" +empList));
     
    System.out.println("\nCAPITALIZED Employee Names using Map.replaceAll()");
    PersonDOJMap.replaceAll((year, empList) -> {
    empList.replaceAll(emp -> {
        emp.setName(emp.getName().toUpperCase());
        return emp;
      });
      return empList;
    });
    PersonDOJMap.forEach((year, empList)-> System.out.println(year+"-->"+empList));
    
  }
}