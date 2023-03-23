package dslabft;

import java.io.*;
import java.util.*;

//main class
public class main { 
	static {
		System.out.print("\tData Structure Lab Final Term Assignemnt. \n\nName: Asmaul Hossain Akash. \nID: 20-44209-3\n\n"); }
	
        
        //head of linked list
        static Node head;
        //root of bst
        static BST root;
        
        //node structure
        static class Node {
                int data;
                Node next;
                Node(int d) {
                        data = d;
                        next = null;
                }
        }
        
        //node structure for bst
        static class BST {
        int data;
        BST left, right;
        BST(int d) {
            data = d;
            left = right = null;
        }
    }
        
        //insert method for linked list
        //inserts a new node with data in the linked list
        public static Node insertNodeLinkedList(int data) {
                //creating a new node
                Node newNode = new Node(data);
                //if linked list is empty, make new node as null
                if(head == null)
                        head = newNode;
                //else add new node to the front and make it head
                else {
                        newNode.next = head;
                        head = newNode;
                }
                return head;
        }
        
        //delete node from linked list
        public static void deleteNodeLinkedList(int data) {
        //store head node
        Node currNode = head, prev = null;
        // If head node itself holds the data to be deleted, then change head
        if(currNode != null && currNode.data == data) {
            head = currNode.next; 
            return;
        }
        //search for the node to be deleted
        while(currNode != null && currNode.data != data) {
                        prev = currNode;
                     // Go to next node
            currNode = currNode.next;
        }
        //if no node was found with data in linked list
        if (currNode == null)
            return;
        //if found, remove the node from linked list
        prev.next = currNode.next;
    }
        
        //search method for linked list
        public static boolean searchLinkedlist(int data) {
        Node currNode = head;
        while (currNode != null)
        {
                        //if data found, return true
            if (currNode.data == data)
                return true; 
         // Go to next node
            currNode = currNode.next;
        }
                //if data not found
        return false;    
    }
        
        //display method for linked list
        public static void displayLinkedList() {
                System.out.print("\nLinked List: ");
                Node currNode = head;
                while(currNode != null) {
                        System.out.print(currNode.data + " ");
                     // Go to next node
                        currNode = currNode.next;
                }
                System.out.println();
        }
        
        //getCount() method for linked list
        public static int getCount() {
                //variable to keep count of nodes
                int count = 0;
                Node currNode = head;
                while(currNode != null) {
                        count++;
                     // Go to next node
                        currNode = currNode.next;
                }
                //returning count
                return count;
        }
        
        //swap method for linked list
        public static void swap(int value, int position) {
                Node currNode = head; 
        Node nodeToSwap = head;
                //find node to be swapped
                while(currNode.next != null)
        {
            if(currNode.data == value)
                nodeToSwap = currNode;    //data found
            currNode = currNode.next;
        }
                //if position 1, then swap with last node
                if(position == 1) {
                        nodeToSwap.data = currNode.data;
                        currNode.data = value;
                }
                //else swap with first node (head)
                else {
                        nodeToSwap.data = head.data;
                        head.data = value;
                }
        }
        
        //insert method for Binary Search Tree
        public static BST insertBST(BST root, int data) {
        //if the tree is empty, return a new node
        if(root == null) {
            root = new BST(data);
            return root;
        }
        // if data is less than root.data then add to left subtree
        if (data < root.data)
            root.left = insertBST(root.left, data);
        // if data is greater than root.data then add to right subtree
                else if (data > root.data)
            root.right = insertBST(root.right, data);
        return root;
    }
        
        //method to convert linked list to binary search tree
        public static void convertLinkedListToBST() {
                Node currNode = head;
                while(currNode != null) {
                        //add each node of linked list to bst
                        root = insertBST(root, currNode.data);
                     // Go to next node
                        currNode = currNode.next;
                }
        }
        
        //search method for bst
        public static boolean searchBST(BST root, int data) {
                //base Cases: root is null or data is present at root
                if(root == null || root.data == data)
                        return true;
                //data is greater than root's data, then search in right
                if(root.data < data)
                        return searchBST(root.right, data);
                return searchBST(root.left, data);
        }
        
        //delete method for bst
    public static void deleteBST(int data) { 
                root = deleteBSTUtil(root, data); 
        }
 
    //a helper method to delete a node in bst
        public static BST deleteBSTUtil(BST root, int data)
    {
        //base Case: If the tree is empty
        if (root == null)
            return root;
 
        //if data is less than root.data, go to left subtree
        if (data < root.data)
            root.left = deleteBSTUtil(root.left, data);
        //else, go to right subtree
                else if (data > root.data)
            root.right = deleteBSTUtil(root.right, data);
 
        //if data is same as root's data, then delete this node
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // node with two children: get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);
            //delete it
            root.right = deleteBSTUtil(root.right, root.data);
        }
        return root;
    }
        
        static int minValue(BST root)
    {
        int min = root.data;
        while(root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
        
        //display method for bst
        public static void displayBST(BST root) {
        if (root != null) {
            displayBST(root.left);
            System.out.print(root.data + " ");
            displayBST(root.right);
        }
    }
        
        
        public static void main(String args[]) {
                int n, inputNumber;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter how many inputs you want to enter: ");
                n = sc.nextInt();
                while(n-->0) {
                        System.out.print("Enter Element: ");
                        inputNumber = sc.nextInt();
                        head = insertNodeLinkedList(inputNumber);
                }
                displayLinkedList();
                System.out.print("\nEnter any element to delete from Linked List: ");
                inputNumber = sc.nextInt();
                deleteNodeLinkedList(inputNumber);
                displayLinkedList();
                System.out.print("\nEnter any element to search in Linked List: ");
                inputNumber = sc.nextInt();
                System.out.println(searchLinkedlist(inputNumber) ? "\tFound" : "\tNot Found");
                System.out.println("\nCount of Nodes : " + getCount());
                System.out.print("Enter Swap Value for First Position: ");
                inputNumber = sc.nextInt();
                swap(inputNumber, 0);
                displayLinkedList();
                System.out.print("Enter Swap Value for Last Position: ");
                inputNumber = sc.nextInt();
                swap(inputNumber, 1);
                displayLinkedList();
                System.out.println("\n\tConverting Linked List To BST...");
                convertLinkedListToBST();
                System.out.println("\nBST in Inorder Traversal : ");
                displayBST(root);
                System.out.println();
                System.out.print("\nEnter any element to delete from BST: ");
                inputNumber = sc.nextInt();
                deleteBST(inputNumber);
                System.out.println("\nBST in Inorder Traversal: ");
                displayBST(root);
                System.out.println();
                System.out.print("\nEnter any element to search in BST: ");
                inputNumber = sc.nextInt();
                System.out.println(searchBST(root, inputNumber) ? "\tFound" : "\tNot Found"); 
                System.out.print("\n\n\t\tThank you");
               
        } 
}