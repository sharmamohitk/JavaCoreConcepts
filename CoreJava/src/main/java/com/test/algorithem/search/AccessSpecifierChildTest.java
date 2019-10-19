package com.test.algorithem.search;

import com.test.algorithem.AccessSpecifierVariableCls;

public class AccessSpecifierChildTest extends AccessSpecifierVariableCls {

	public String publicStr;
	
	public AccessSpecifierChildTest() {
	}
	
	public AccessSpecifierChildTest(String priStr, String defStr, String protectedStr, String publicStr) {
		super(priStr, defStr, protectedStr, publicStr);
		//this.publicStr = "child";
	}
	
	public static void main(String[] args) {
		
		AccessSpecifierChildTest accessSpecifierVariableClsObj = new AccessSpecifierChildTest("priStr", "defStr", "protectedStr", "publicStr");
		//System.out.println(accessSpecifierVariableClsObj.priStr);  can't access private mbr outside pkg using same clas
		//System.out.println(accessSpecifierVariableClsObj.defStr);  can't access default mbr outside pkg using same clas
		System.out.println(accessSpecifierVariableClsObj.protectedStr);
		System.out.println(accessSpecifierVariableClsObj.getPublicStr());
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is :" + s1 == s2);
		System.out.println(s2 == "abc");
		
		String s = "Some string";
		if (s == "Some string") {
		    System.out.println("Equal");
		}
		
	}

	public String getPublicStr() {
		return publicStr;
	}

	public void setPublicStr(String publicStr) {
		this.publicStr = publicStr;
	}

}
