package com.interviews.visa;

public class Solution {
    public static void main(String[] args) {
    //testing Consecutive sum
//        SpecialBinaryString spl=new SpecialBinaryString();
//        String spl_bnr=spl.makeLargestSpecial("11011000");
//        System.out.println(spl_bnr);

        //Testing Rain Water Trapping
        TrappingRainWater trw=new TrappingRainWater();
        int [] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trw.trapRainWater(arr));
    }
}
