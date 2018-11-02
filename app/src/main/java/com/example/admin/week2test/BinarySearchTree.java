package com.example.admin.week2test;

public class BinarySearchTree {
    private static int number;
    private static BinarySearchTree leftTree;
    private static BinarySearchTree rightTree;

    public BinarySearchTree(int number) {
        this.number = number;
        this.leftTree = null;
        this.rightTree = null;
    }

    public void addNode(int number) {
        //if a number is less than the first node it goes in the left tree
        if (number < this.number) {
            //check if leftTree is empty, if not add node to leftTree
            if (this.leftTree != null) this.leftTree.addNode(number);
                //if leftTree is empty create a new tree with the new node as the 1st value
            else this.leftTree = new BinarySearchTree(number);
        }
        //If number is greater than the first node, it goes in the right tree
        else {
            //same process as above except in right tree
            if (this.rightTree != null) this.rightTree.addNode(number);
            else this.rightTree = new BinarySearchTree(number);
        }
    }
    public void printPreOrder(){
        System.out.println(this.number);
        if(this.leftTree != null)this.leftTree.printPreOrder();
        if(this.rightTree != null)this.rightTree.printPreOrder();
    }
    public void addArray(){
        int[] array = {50,32,13,65,34,22,3,76,90};
        for (int anArray : array) {
            addNode(anArray);
        }
    }
}

