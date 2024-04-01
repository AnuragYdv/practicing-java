package com.scaledatum.arrayproblems;

public class MaximumSubarraySum {
    public int maximumSum(int[] arr){
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
                }
            }
        return maxSum;
        }
        public int maximumSumOptz(int[] arr){
        int sum=0;
        int mxSum=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>mxSum){
                mxSum=sum;
            }
        }
        return mxSum;
        }

    }
