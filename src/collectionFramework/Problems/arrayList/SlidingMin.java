package collectionFramework.Problems.arrayList;

import java.util.*;
public class SlidingMin {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(4, 3, 8, 1));
        int k=3; Deque<Integer> q = new LinkedList<>();
        for(int i=0; i<n.size(); i++) {
            while(!q.isEmpty() && q.peek() < i-k+1) q.poll();
            while(!q.isEmpty() && n.get(q.peekLast()) > n.get(i)) q.pollLast();
            q.offer(i);
            if(i>=k-1) System.out.print(n.get(q.peek()) + " ");
        }
    }
}