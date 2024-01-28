package com.scaledatum.binaryTree;

public class BinarySearchTreeImpl {
    public static void main(String[] args) {
        Node rootNode=new Node(100);
        rootNode.insert(95);
        rootNode.insert(90);
        rootNode.insert(99);
        rootNode.insert(105);
        rootNode.insert(101);
        rootNode.insert(110);

        System.out.print(rootNode.toString());
    }
}

