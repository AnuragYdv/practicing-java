package com.scaledatum.arrayproblems;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/single-number/description/

*/
public class SingleAppearence {
    public int numAppearOnce(int[] nums){
        int singleAppearence=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==num){
                    cnt++;
                }
            }
            if(cnt==1){
                singleAppearence= num;
                break;
            }
        }
        return singleAppearence;
    }


    public int numAppearOnceOP1(int[] nums){
        int singleAppearence=0;
        for(int i=0; i< nums.length;i++){
            singleAppearence=singleAppearence^nums[i];
        }
        return singleAppearence;
    }
    public int numAppearOnceOP2(int[] nums){
        int singleAppearence=0;
        HashMap<Integer,Integer> hMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer count=hMap.get(nums[i]);
            if(count==null){
                count=0;
            }
            hMap.put(nums[i],++count);

        }
        for(Map.Entry<Integer,Integer> elem:hMap.entrySet()){

            if(elem.getValue()==1){
                singleAppearence= elem.getKey();
                break;
            }
        }

        return singleAppearence;
    }
}

