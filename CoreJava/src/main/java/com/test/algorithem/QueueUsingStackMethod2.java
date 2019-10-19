package com.test.algorithem;

import java.util.Stack;

public class QueueUsingStackMethod2 {

	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	private int size;

	public QueueUsingStackMethod2() {
	}

	public void enQueue(Integer item) {
		stack1.push(item);
		size++;
	}

	public Integer deQueue() {

		Integer item = null;
		if (stack1.empty() && stack2.empty()) {
			return null;
		}

		if (!stack2.empty()) {
			item = stack2.peek();
			stack2.pop();
			size--;
		}

		else if (stack2.empty() && !stack1.empty()) {

			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
			item = stack2.peek();
			stack2.pop();
			size--;

		}
		return item;

	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {

		QueueUsingStackMethod2 queue = new QueueUsingStackMethod2();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println("removing item from queue");
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println("Size ::::: " + queue.size);
		queue.enQueue(4);
		queue.enQueue(5);
		System.out.println("Size ::::: " + queue.size);
		System.out.println(queue.deQueue());
		System.out.println("Size ::::: " + queue.size);
	}

}
