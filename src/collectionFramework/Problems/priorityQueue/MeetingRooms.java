package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class MeetingRooms {
    public int minMeetingRooms(int[][] t) {
        Arrays.sort(t, (a,b)->a[0]-b[0]); PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int[] i:t){ if(!pq.isEmpty() && pq.peek()<=i[0]) pq.poll(); pq.add(i[1]); } return pq.size();
    }
}