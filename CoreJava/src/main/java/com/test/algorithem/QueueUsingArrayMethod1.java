package com.test.algorithem;

public class QueueUsingArrayMethod1<T> {

	int front, rear, length;
	int capacity;
	T arr[];
	
	public QueueUsingArrayMethod1() {
		super();
	}
	
	public QueueUsingArrayMethod1(int capacity) {
		this.capacity = capacity;
		this.front = this.length = 0;
		this.rear = -1;
		arr = (T[]) new Object[capacity];
	}
	
	public int getSize() {
		return length;
	}
	
	public boolean isQueueFull() {
		return (length == capacity) ? true : false;
	}
	
	public boolean isQueueEmpty() {
		return rear == -1 ? true : false;
	}
	
	public void enQueue(T item) {
		
		if(isQueueFull()) {
			System.out.println("Queue is full");
			return;
		}
		this.rear = (this.rear+ 1) % this.capacity;
		arr[this.rear] = item;
		this.length = this.length +1;
	}
	
	public void deQueue() {
		
		if(isQueueEmpty()) {
			System.out.println("Queue is empty !");
			return;
		}
		
		this.length = this.length -1;
		this.rear = this.rear -1;
		for (int i = 0; i < arr.length; i++) {
			if((i+1) == capacity) {
				arr[i] = null;
			}else {
				arr[i] = arr[i+1];
			}
		}
	}
	
	public void display() {
		for (int i = this.front; i <= this.rear; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		QueueUsingArrayMethod1<Integer> queue = new QueueUsingArrayMethod1<>(2);
		queue.enQueue(10); 
		queue.enQueue(100);
		queue.display();
		System.out.println("Dequeue element");
		queue.deQueue();
		queue.display();
		
		System.out.println("Added element to Queue");
		queue.enQueue(99);
		queue.display();
		
		System.out.println("trying to add element but queue is full");
		queue.enQueue(88);
		queue.enQueue(77);
		
		System.out.println("Total elements !");
		queue.display();
		
		queue.deQueue();
		queue.deQueue();
		System.out.println("trying to remove element but queue is empty");
		queue.deQueue();
		
		System.out.println("as there is no element so nothing will be diplayed on display()");
		queue.display();
		
	}		
}
