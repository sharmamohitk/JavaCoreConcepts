package com.test.algorithem;

import java.util.HashMap;
import java.util.Map;

public class GenericStack<T> {

	
	private T[] stackArr;
	private int stackSize = 0;
	private int top;
	
	@SuppressWarnings("unchecked")
	public GenericStack(int size) {
		stackArr =(T[]) new Object[10];
		this.stackSize = size;
		this.top= -1;
	}
	
	public void push(T data) {
		if(top == stackSize-1) {
			System.out.println("Stack is full !!");
			increaseStackCapacity();
		}
		stackArr[++top] = data;
	}
	
	public T pop() {
		T data = stackArr[top];
		top--;
		return data;
	}
	
	public int numberOfElements() {
		int numElement = top;
		return ++numElement;
	}
	
	 private void increaseStackCapacity(){
         
	        @SuppressWarnings("unchecked")
	        T[] newStack = (T[]) new Object[this.stackSize*2];
	        for(int i=0;i<stackSize;i++){
	            newStack[i] = this.stackArr[i];
	        }
	        this.stackArr = newStack;
	        this.stackSize = this.stackSize*2;
	        System.out.println("size of stack afer increase capacity "+ this.stackSize);
	    }
	
	public static void main(String[] args) {
		
		// works on LIFO
		GenericStack<Integer> stack = new GenericStack<>(2);
		stack.push(80);
		System.out.println("pop a element "+stack.pop());
		stack.push(99);
		stack.push(88);
		stack.push(77);
		System.out.println("pop a element "+stack.pop());
		System.out.println("pop a element "+stack.pop());
		
		Map<String,String> str = new HashMap<>();
		
	}
}
