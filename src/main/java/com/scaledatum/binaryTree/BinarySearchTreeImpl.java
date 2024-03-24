package com.scaledatum.binaryTree;

public class BinarySearchTreeImpl {
    public static void main(String[] args) {
        Node rootNode=new Node(100);
        /*This is Binary Search Tree Implementation of Tree*/
        rootNode.append(95);
        rootNode.append(90);
        rootNode.append(99);
        rootNode.append(105);
        rootNode.append(101);
        rootNode.append(110);

        System.out.print(rootNode.toString());
    }
}

