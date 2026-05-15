package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
public class IPO {
    public int findMaximizedCapital(int k, int w, int[] p, int[] c) {
        PriorityQueue<int[]> min=new PriorityQueue<>((a,b)->a[0]-b[0]); PriorityQueue<Integer> max=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<p.length;i++) min.add(new int[]{c[i], p[i]});
        for(int i=0;i<k;i++){ while(!min.isEmpty() && min.peek()[0]<=w) max.add(min.poll()[1]); if(max.isEmpty()) break; w+=max.poll(); }
        return w;
    }
}