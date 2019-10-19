package com.test.algorithem.search;

import com.test.algorithem.AccessSpecifierVariableCls;

public class AccessSpecifierTest {

	public AccessSpecifierTest() {
	}
	
	public static void main(String[] args) {
		
		AccessSpecifierVariableCls accessSpecifierVariableClsObj = new AccessSpecifierVariableCls("priStr", "defStr", "protectedStr", "publicStr");
		//System.out.println(accessSpecifierVariableClsObj.priStr); can't access private mbr outside pkg using same clas
		//System.out.println(accessSpecifierVariableClsObj.defStr); can't access defStr mbr outside pkg using same clas
		//System.out.println(accessSpecifierVariableClsObj.protectedStr); can't access protectedStr mbr outside pkg using same clas
		System.out.println(accessSpecifierVariableClsObj.publicStr);
		
	}

}
