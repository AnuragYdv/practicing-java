package com.scaledatum.arrayproblems;

import com.interviews.visa.MaxEventAttended;

public class Solution {
    public static void main(String[] args) {
        /*************MAXIMUM SUBARRAY SUM**************/
//        MaximumSubarraySum mxSum=new MaximumSubarraySum();
//        int [] arr={-2,-3,4,-1,-2,1,5,-3};
//        int sum1=mxSum.maximumSum(arr);
//        int sum2= mxSum.maximumSum(arr);
//
//        System.out.println(sum1);
//        System.out.println(sum2);

        /********Maximum Consecutive Ones************/
//        MaximumConsecutiveOnes maxCO=new MaximumConsecutiveOnes();
//        int[] arr={1,1,1,1,0,1,1,0,1,0,11,1,1,1,1,1,};
//        System.out.println(maxCO.maxConsecOnes(arr));

        /*************Missing Numbers*******************/
//        int[] nums = {9,6,4,2,3,5,7,0,1};
//        int[] nums2={3,0,1};
//        int[] nums3={0,1};
//        MissingNumber missingNum= new MissingNumber();
//        System.out.println(missingNum.missingNumBF(nums));
//        System.out.println(missingNum.missingNumOP1(nums));
//        System.out.println(missingNum.missingNumOP2(nums));

        /*************Single Appearence *******************/
//        int[] nums={2,2,1};
//        int[] nums2= {4,1,2,1,2};
//        int[] nums3= {1};
//        SingleAppearence sapr=new SingleAppearence();
//        System.out.println(sapr.numAppearOnceOP2(nums2));


        /*************Longest SubArray *******************/
        LongestSumSubArray lngSubArr=new LongestSumSubArray();
        int[] nums= {1, 2, 3, 1, 1, 1, 1};
        int k=3;
        int[] nums2= {8,15,17,0,11};
        int k2=17;

        System.out.println(lngSubArr.longestSubarrayWithSumK(nums2,k2));
    }
}
