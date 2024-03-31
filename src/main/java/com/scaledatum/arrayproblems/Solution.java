package com.scaledatum.arrayproblems;

import com.interviews.visa.MaxEventAttended;

public class Solution {
    public static void main(String[] args) {
        /**MAXIMUM SUBARRAY **/
        MaximumSubarraySum mxSum=new MaximumSubarraySum();
        int [] arr={-2,-3,4,-1,-2,1,5,-3};
        int sum=mxSum.maximumSum(arr);
        System.out.println(sum);

    }
}
