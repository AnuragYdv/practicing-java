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
}
