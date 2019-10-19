package com.test.algorithem;

public class BSTImpl {

	int size;
	Node root;

	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	public Node addRecursive(Node current, int value) {

		if (current == null)
			return new Node(value);

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		}
		return current;
	}

	public boolean contains(int value) {

		return searchRecursive(root, value);
	}

	public boolean searchRecursive(Node current, int value) {

		if (current == null)
			return false;
		if (value == current.value)
			return true;
		
		if (value < current.value) {
			return searchRecursive(current.left, value);
		} else if (value > current.value) {
			return searchRecursive(current.right, value);
		}
		return false;
	}

	public void delete(int value) {
		root = deleteRecursive(root, value);
		
	}
	
	public int findSmallestFromRight(Node current) {
		
		return current.left == null ? current.value : findSmallestFromRight(current.left);
		
	}
	
	public Node deleteRecursive(Node current, int value) {
		
		if(current == null)
			return null;
		
		if(value == current.value) {
			
			if(current.left == null && current.right == null) {
				return null;
			}else if(current.left == null) {
				return current.right;
			}else if(current.right == null) {
				return current.left;
			}else {
				
				int smallestFromRight = findSmallestFromRight(current.right);
				current.value = smallestFromRight;
				current.right= deleteRecursive(current.right , smallestFromRight);
				return current;
			}
		}
		if(value < current.value) {
			current.left =  deleteRecursive(current.left, value);
		}
		if(value > current.value) {
			current.right = deleteRecursive(current.right, value);
		}
		
		return current;
	}
	
	public static void main(String[] args) {
		
		BSTImpl bst = new BSTImpl();
		bst.add(10);
		bst.add(5);
		bst.add(2);
		bst.add(1);
		
		System.out.println(bst.contains(2));
		System.out.println(bst.contains(9));
		

	}

}
