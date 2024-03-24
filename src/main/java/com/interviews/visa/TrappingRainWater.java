package com.interviews.visa;


public class TrappingRainWater {
    public int trapRainWaterBF(int[] input ){
        int n = input.length;
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
            while (j >= 0) {
                leftMax = Math.max(leftMax, input[j]);
                j--;
            }
            j = i;
            while (j < n) {
                rightMax = Math.max(rightMax, input[j]);
                j++;
            }
            waterTrapped += Math.min(leftMax, rightMax) - input[i];
        }
        return waterTrapped;
    }

    public  int  trapRainWaterOP1(int[] input ) {
        int n=input.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=input[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],input[i]);
        }
        suffix[n-1]=input[n-1];
        for(int j=n-2;j>=0;j--){
            suffix[j]=Math.max(suffix[j+1],input[j]);
        }
        int waterTrapped=0;
        for(int i=0;i<n;i++){
            waterTrapped+=Math.min(prefix[i],suffix[i])-input[i];
        }
        return waterTrapped;
    }

    public int trapRainWaterOP2(int[] input){
        int n=input.length;
        int left=0;
        int right=n-1;
        int res=0;
        int maxLeft=0,maxRight=0;
        while (left<right){
            if(input[left]<input[right]){
                if(input[left]>=maxLeft){
                    maxLeft=input[left];
                }else {
                    res+=maxLeft-input[left];

                }

                left++;
            }else {
                if(input[right]>=maxRight){
                 maxRight=input[right];
                }else {
                    res+=maxRight-input[right];
                }
                right--;
            }
        }

        return res;
    }
}
