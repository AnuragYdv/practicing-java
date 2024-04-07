package com.scaledatum.recursionProblem;

public class CommonRecursionUnderstanding {
   static void PrintN(int i,int n){
       if(i>n) {
           return;
       }
       System.out.println(i);

       PrintN(i + 1, n);
    }
    public static void main(String[] args){
        PrintN(0,4);
    }

}
