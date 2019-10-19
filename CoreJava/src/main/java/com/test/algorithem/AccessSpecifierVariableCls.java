package com.test.algorithem;

public class AccessSpecifierVariableCls {

	private String priStr;
	String defStr;
	protected String protectedStr;
	public String publicStr;
	
	
	public AccessSpecifierVariableCls(String priStr, String defStr, String protectedStr, String publicStr) {
		super();
		this.priStr = priStr;
		this.defStr = defStr;
		this.protectedStr = protectedStr;
		this.publicStr = publicStr;
	}

	public AccessSpecifierVariableCls() {
	}

	public String getPriStr() {
		return priStr;
	}

	public void setPriStr(String priStr) {
		this.priStr = priStr;
	}

	public String getDefStr() {
		return defStr;
	}

	public void setDefStr(String defStr) {
		this.defStr = defStr;
	}

	public String getProtectedStr() {
		return protectedStr;
	}

	public void setProtectedStr(String protectedStr) {
		this.protectedStr = protectedStr;
	}

	public String getPublicStr() {
		return publicStr;
	}

	public void setPublicStr(String publicStr) {
		this.publicStr = publicStr;
	}

}
