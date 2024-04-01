package com.scaledatum.arrayproblems;
/*
https://leetcode.com/problems/missing-number/
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */

public class MissingNumber {
    public int missingNumBF(int[] nums){
        int missingNum=-1;
        for(int i=1;i<=nums.length;i++){
            int flag=0;
            for(int j=0;j< nums.length;j++){
                if(nums[j]==i){
                    flag=1;
                }
                if (flag==0) {
                    missingNum=i;
                    break;
                }
            }
        }
        return  missingNum;
    }
    public int missingNumOP1(int[] nums){
        int missingNum=0;
        int sumNConsec=((nums.length)*(nums.length +1))/2;

        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        missingNum=sumNConsec-sum;
        return missingNum;
    }

    public int missingNumOP2(int[] nums){
        int xor1=0;
        int xor2=0;

        for (int i=0;i<nums.length;i++){
            xor1=xor1^(i+1);
            xor2=xor2^nums[i];
        }
        int missingNum=xor1^xor2;
        return missingNum;
    }
}
