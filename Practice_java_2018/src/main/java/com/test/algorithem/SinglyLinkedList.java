package com.test.algorithem;

public class SinglyLinkedList {

	Node head;

	public SinglyLinkedList() {
	}

	public void add(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void print() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	/* Inserts a new node after the given prev_node. */
	public void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	/*
	 * Appends a new node at the end. This method is defined inside LinkedList class
	 * shown above
	 */

	public void append(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		return;
	}

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.add(77);
		linkedList.add(78);
		linkedList.add(87);
		linkedList.add(89);
		linkedList.add(97);
		linkedList.push(98);
		linkedList.print();

	}

}
