package com.scaledatum.binaryTree;

public class Node {
    Node leftChild;
    Node rightChild;
    int data;

    Node(int  input) {
        this.data = input;
        this.leftChild = null;
        this.rightChild = null;
    }

    public String toString() {

        return String.valueOf(this.data);


    }
}
