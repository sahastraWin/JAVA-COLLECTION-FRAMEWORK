package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class TaskScheduler {
    public int leastInterval(char[] t, int n) {
        int[] c=new int[26]; for(char x:t) c[x-'A']++;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:c) if(i>0) pq.add(i);
        int time=0;
        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            for(int i=0; i<=n; i++) if(!pq.isEmpty()) temp.add(pq.poll()-1);
            for(int i:temp) if(i>0) pq.add(i);
            time+=pq.isEmpty()?temp.size():n+1;
        }
        return time;
    }
}