package com.scaledatum.arrayproblems;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Aimed to solve array programs
 */
public class ArrayProblems {
    public static void main(String[] args) {
        ArrayProblems arrProbObj = new ArrayProblems();
        ArrayList<Integer> inputArray = Stream.of(1, 2, 3, 4, 5, 6, 50, 8, 9)
                .collect(Collectors.toCollection(
                        ArrayList<Integer>::new));
        int largestNum = arrProbObj.largesElement(inputArray, 9);
        System.out.print(largestNum);
    }

    /*
    Learning 1: You can only use final variable in lambda function (foreach)
    * */
    /*
     * Problem statement1:
     * Given an array ‘arr’ of size ‘n’ find the largest element in the array.
     *   Example:
     *   Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
     *   Output: 5
     *   Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
     * */
    public int largesElement(ArrayList inputArray, int n) {
        int lowestElem = (int) inputArray.get(0);
        /*for (int i = 0; i < inputArray.size(); i++) {
            if (lowestElem < (int) inputArray.get(i)) {
                lowestElem = (int) inputArray.get(i);
            }
        }*/

        /*old for each loop*/
        for (Object elem : inputArray) {
            if ((int) elem > lowestElem) {
                lowestElem = (int) elem;
            }
        }
        return lowestElem;
    }
}