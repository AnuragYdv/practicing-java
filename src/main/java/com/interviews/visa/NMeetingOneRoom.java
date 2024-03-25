package com.interviews.visa;
//https://takeuforward.org/data-structure/n-meetings-in-one-room/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Meeting Class */
class  Meeting{
    int start;
    int end;
    int pos;
    Meeting(int start,int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}

class MeetingComparator implements Comparator<Meeting>
{

    @Override
    public int compare(Meeting o1, Meeting o2) {
        if(o1.end<o2.end){
            return -1;
        }else if(o1.end> o2.end){
            return 1;
        }
        return 0;
    }
}
public class NMeetingOneRoom {
void maxMeetings(int[][] arr){
    ArrayList<Meeting> meet=new ArrayList<>();
    for (int i=0;i< arr.length;i++){
        meet.add(new Meeting(arr[i][0],arr[i][1],i));
    }
    MeetingComparator mc = new MeetingComparator();
    Collections.sort(meet,mc);
    ArrayList<Integer> answer=new ArrayList<>();
    answer.add(meet.get(0).pos);
    int limit=meet.get(0).end;
    for(int i=1;i< arr.length;i++) {
        if(meet.get(i).start>limit){
            limit=meet.get(i).end;
            answer.add(meet.get(i).pos);
        }
    }
    System.out.println("The order in which the meetings will be performed is ");
    for (Integer integer : answer) {
        System.out.print(integer + " ");
    }

    }
}

