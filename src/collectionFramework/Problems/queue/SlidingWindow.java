package collectionFramework.Problems.queue;

import java.util.*;
public class SlidingWindow {
    public int[] max(int[] n, int k) {
        if(n.length==0)return new int[0]; int[] r=new int[n.length-k+1]; Deque<Integer> d=new LinkedList<>();
        for(int i=0;i<n.length;i++){ while(!d.isEmpty()&&d.peekFirst()<i-k+1)d.pollFirst(); while(!d.isEmpty()&&n[d.peekLast()]<n[i])d.pollLast(); d.offerLast(i); if(i>=k-1)r[i-k+1]=n[d.peekFirst()]; } return r;
    }
}