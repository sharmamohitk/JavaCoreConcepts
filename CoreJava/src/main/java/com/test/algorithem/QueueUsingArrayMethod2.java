package com.test.algorithem;

public class QueueUsingArrayMethod2 {

	int arr[];
	int front;
	int rear;
	int capacity;
	int length;
	
	public QueueUsingArrayMethod2() {
		super();
	}
	
	public QueueUsingArrayMethod2(int capacity) {
		this.rear = -1;
		this.front = this.length = 0;
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	
	public void enQueue(int item) {
		this.rear = this.rear +1;
		this.length = this.length +1;
		this.arr[this.rear] = item;
	}
	
	public void deQueue() {
		this.front = this.front +1;
		this.length = this.length -1;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}
