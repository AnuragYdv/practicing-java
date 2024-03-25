package com.scaledatum.datastructures;

public class CustomQueue {
   private int length;
   private Node front,rear;

  public void enqueue(int data){
    Node node=new Node(data);
    if(isEmpty()){
        front=node;
    }else {
        rear.setNextNode(node);
    }
    rear=node;
    length++;
   }
  public int dequeue(int n) throws Exception {
    if(isEmpty()){
        throw new Exception(" Queue Underflow");
    }
    int result=front.getData();
    front=front.getNextNode();
    length--;
    if(isEmpty()){
        rear=null;
    }
    return result;
  }
  public int size(){
     return  length;
  }
  boolean isEmpty(){
      return length==0;
  }
}
