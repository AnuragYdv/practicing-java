package com.interviews.visa;

public class Solution {
    public static void main(String[] args) {

        /*********************** Problem 2 ***************************************/
        //testing Consecutive sum
//        SpecialBinaryString spl=new SpecialBinaryString();
//        String spl_bnr=spl.makeLargestSpecial("11011000");
//        System.out.println(spl_bnr);
/*********************** Problem 2 ***************************************/
        //Testing Rain Water Trapping
        //TrappingRainWater trw=new TrappingRainWater();
       // int [] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        //System.out.println(trw.trapRainWaterBF(arr));
        //System.out.println(trw.trapRainWaterOP2(arr));

/*********************** Problem 3 ***************************************/
// N-Meeting and One Room
        int[][] arr={{1,2},{3,4},{0,5},{5,7},{8,9},{5,9}};
        NMeetingOneRoom mxMeet=new NMeetingOneRoom();
        mxMeet.maxMeetings(arr);
    }
}
