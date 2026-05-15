package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
public class ConnectSticks {
    public int connectSticks(int[] s) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(); for(int x:s) pq.add(x); int c=0;
        while(pq.size()>1){ int sum=pq.poll()+pq.poll(); c+=sum; pq.add(sum); } return c;
    }
}