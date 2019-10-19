package com.test.algorithem;

import java.util.Stack;

public class QueueUsingStackMethod1 {

	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	private int size;
	
	public QueueUsingStackMethod1() {
		super();
	}
	
	public void enQueue(Integer item) {
		
		while(!stack1.empty()) {
			stack2.push(stack1.pop());
		}
		
		stack1.push(item);
		
		while(!stack2.empty()) {
			stack1.push(stack2.pop());
		}
		
		size++;
		
	}
	
	public Integer getSize() {
		return size;
	}
	
	public Integer deQueue() {
		
		if(stack1.empty()) {
			return null;
		}
		int item = stack1.peek();
		stack1.pop();
		size --;
		return item;
	}
	
	public static void main(String[] args) {
		
		QueueUsingStackMethod1 queue = new QueueUsingStackMethod1();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println("removing item from queue");
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

		System.out.println("Size ::: "+ queue.size);
	}
	
	
}
