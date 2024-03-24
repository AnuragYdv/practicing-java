package com.interviews.visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*https://leetcode.com/problems/special-binary-string/description/
* */
public class SpecialBinaryString {

    public String makeLargestSpecial(String S){

    return dfs(S,0,S.length()-1);
    }
    private final Comparator<String> COMP=(a,b) -> (b+a).compareTo(a+b);
    private String dfs(String S,int from, int to){
        if(from > to)
            return "";
        int sum=0;
        int groupStart=from;
        ArrayList<String> subgroups= new ArrayList<>();
        for( int i=from;i<=to;i++){
            if (S.charAt(i)=='1')
                    sum++;
            else
                sum--;
            if (sum==0) {
                subgroups.add("1"+dfs(S,groupStart+1,i-1)+"0");
                groupStart=i+1;
            }
        }
        Collections.sort(subgroups,COMP);
        StringBuilder sb=new StringBuilder();
            for (String each:subgroups){
                sb.append(each);
            }
        return sb.toString();
    }

}

