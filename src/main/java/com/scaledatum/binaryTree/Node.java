package com.scaledatum.binaryTree;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;


public class Node {
    Node leftChild;
    Node rightChild;
    private int data;
    private static StringBuilder str=new StringBuilder();
    //StringBuilder str=new StringBuilder();
    Node(int input) {
        this.data = input;
        leftChild = null;
        rightChild = null;
    }

    public void insert(int input) {
        if (input < this.data) {
            if (!(this.leftChild == null)) {
                this.leftChild.insert(input);
            } else {
                this.leftChild = new Node(input);
            }
        } else {
            if (!(this.rightChild == null)) {
                this.rightChild.insert(input);
            } else {
                this.rightChild = new Node(input);
            }
        }
    }

    @Override
    public String toString() {
        if (this.leftChild != null) {
            this.leftChild.toString();
        }

        str.append(this.data).append("\n");

        //System.out.println(this.data);
        if (this.rightChild != null) {
            this.rightChild.toString();
        }

        return str.toString();
    }
}
