package com.scaledatum.arrayproblems;
/*Problem Statement Link : https://leetcode.com/problems/max-consecutive-ones/description/

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
*/

public class MaximumConsecutiveOnes {
    public int maxConsecOnes(int[] arr){
        int maxConsec=0;
        int cnt=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt++;
                maxConsec=Integer.max(cnt,maxConsec);
            }else {
                cnt=0;
            }

        }
        return maxConsec;
    }

}
