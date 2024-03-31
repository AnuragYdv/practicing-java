package com.scaledatum.arrayproblems;

public class MaximumSubarraySum {
    public int maximumSum(int[] arr){
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                System.out.println("Sum : "+sum);
                System.out.println("Max Sum: "+ maxSum);
                System.out.println("i : "+i+" ,j : "+j);
                if(sum>maxSum){
                    maxSum=sum;
                }
                }
            }
        return maxSum;
        }

    }
