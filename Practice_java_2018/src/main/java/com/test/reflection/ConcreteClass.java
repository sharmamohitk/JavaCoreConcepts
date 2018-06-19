package com.test.reflection;

public class ConcreteClass extends BaseClass implements BaseInterface {

	public int publicInt;
	public int publicInt2;
	private String privateString="private string";
	protected boolean protectedBoolean;
	Object defaultObject;
	
	
	public ConcreteClass(){
	}
	public ConcreteClass(int num){
		this.publicInt=num;
	}
	public ConcreteClass(int num,int num2){
		this.publicInt=num;
		this.publicInt2=num2;
	}
	

	@Override
	public void method1() {
		System.out.println("Method1 impl.");
	}

	@Override
	public int method2(int num) {
		System.out.println("Method2 impl.");
		return num;
	}
	
	@Override
	public int method4(){
		System.out.println("Method4 overriden.");
		return 0;
	}
	
	public int method5(int i){
		System.out.println("Method4 overriden.");
		return 0;
	}
	
	private int method3(String testStr) {
		System.out.println("Method3 impl.");
		return 0;
	}
	
	// inner classes
	public class ConcreteClassPublicClass{}
	private class ConcreteClassPrivateClass{}
	protected class ConcreteClassProtectedClass{}
	class ConcreteClassDefaultClass{}
	
	//member enum
	public enum ConcreteClassPublicEnum{}
	enum ConcreteClassDefaultEnum{}
	
	//member interface
	public interface ConcreteClassPublicInterface{}

}