package com.scaledatum.arrayproblems;

import java.util.HashMap;

/*
* https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399
*
* You are given an array 'a' of size 'n' and an integer 'k'.

Find the length of the longest subarray of 'a' whose sum is equal to 'k'.

Example :
Input: ‘n’ = 7 ‘k’ = 3
‘a’ = [1, 2, 3, 1, 1, 1, 1]

Output: 3
* */
public class LongestSumSubArray {
public int longestSubarrayWithSumK(int[] a, long k) {
   int longestSubarray=0;
   // {8,15,17,0,11}
   for(int i=0;i<a.length;i++){
       int sum=0;
       for(int j=i;j<a.length;j++){
           sum=sum+a[j];
           if(sum==(int)k){
              int arr_len=j-i+1;
               longestSubarray=Integer.max(longestSubarray,arr_len);
               continue;
           }
       }
   }
    return longestSubarray;
}
}

