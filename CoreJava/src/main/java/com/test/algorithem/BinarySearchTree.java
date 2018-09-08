package com.test.algorithem;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	class Node {
        int key;
        Node left, right;
 
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
 
    Node root;
 
    BinarySearchTree() { 
        root = null; 
    }
 
    void insert(int key) {
       root = insertRec(root, key);
    }
     
    Node insertRec(Node root, int key) {
 
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        return root;
    }
 
    void inorder()  {
       inorderRec(root);
    }
 
   // Depth-first search is a type of traversal that goes deep as much as possible in every child before exploring the next sibling. 
  //Depth-first search The in-order traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    
  //Depth-first search The Pre-order traversal
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
  //Depth-first search The Post-order traversal
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }
    
    //Breadth-First Search
    //This is another common type of traversal that visits all the nodes of a level before going to the next level.
    //This kind of traversal is also called level-order and visits all the levels of the tree starting from the root, and from left to right.
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }
     
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
     
        while (!nodes.isEmpty()) {
     
            Node node = nodes.remove();
     
            System.out.print(" " + node.key);
     
            if (node.left != null) {
                nodes.add(node.left);
            }
     
            if (node.right!= null) {
                nodes.add(node.right);
            }
        }
    }
 
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        tree.inorder();
    }
}
