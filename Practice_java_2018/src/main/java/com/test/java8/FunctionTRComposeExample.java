package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTRComposeExample {

	public static void main(String args[]){
	    Function<Person, String> funcEmpToString= (Person e)-> {return e.getName();};
	    Function<Person, Person> funcEmpFirstName= 
	     (Person e)-> {int index= e.getName().indexOf(" ");
	                 String firstName=e.getName().substring(0,index);
	                 e.setName(firstName);
	                 return e;};
	    List<Person> personList=   Arrays.asList(new Person("Tom Jones", 45), 
	       new Person("Harry Major", 25),
	       new Person("Ethan Hardy", 65),
	       new Person("Nancy Smith", 15),
	       new Person("Deborah Sprightly", 29));
	    List<String> empFirstNameList= convertEmpListToNamesList(personList,funcEmpToString.compose(funcEmpFirstName));
	    empFirstNameList.forEach(str->{System.out.print(" "+str);});
	  }
	 public static List<String> convertEmpListToNamesList(List<Person> PersonList, Function<Person, String> funcEmpToString){
	   List<String> empNameList=new ArrayList<String>(); 
	   for(Person emp:PersonList){
	     empNameList.add(funcEmpToString.apply(emp));
	   }
	   return empNameList;
	  }
}
