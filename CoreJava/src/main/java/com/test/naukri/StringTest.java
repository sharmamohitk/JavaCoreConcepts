package com.test.naukri;

public class StringTest {

	public static void main(String[] args) {
		
			String hello1 = "Hello";
	        String hello2 = "Hello";
	        String hello3 = "H";
	        hello3 = hello3 + "ello";
	        System.out.println("hello1 == hello2 "+hello1 == hello2);
	        System.out.println(" hello1 == hello3 "+hello1 == hello3);
	        System.out.println("hello1.equals(hello3) "+hello1.equals(hello3));
	        

	        String s1 = "abc";
	        StringBuffer s2 = new StringBuffer(s1);
	        System.out.println(s1.equals(s2));
	        
	        String s3 = "abc";
	        String s4 = new String("abc");

	        s3.intern();
	        System.out.println(s3 == s4);
	        

	        String s5 = null;
	        System.out.println(s5); //line 2
	        // System.out.println(s5.toString()); //line 3 null pointer exception
	        
	        String s6 = "abc";
	        String s7 = "def";
	        
	        System.out.println(s6.compareTo(s7));
	        

	        String s8 = "Java"+1+2+"Quiz"+""+(3+4); 
	        System.out.println(s8);
	        

	        String s9 = "Java String Quiz";
	        // System.out.println(s9.charAt(s9.toUpperCase().length())); // runtime exception0
	        

	        String a1 = new String("pankaj");
	        String a2 = new String("PANKAJ");
	        System.out.println(a1 = a2);

	        
	        
	}

}
