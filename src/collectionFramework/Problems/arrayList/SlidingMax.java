package collectionFramework.Problems.arrayList;

import java.util.*;
public class SlidingMax {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,-1,-3,5,3,6,7));
        int k=3; Deque<Integer> q = new LinkedList<>();
        for(int i=0; i<nums.size(); i++) {
            while(!q.isEmpty() && q.peek() < i-k+1) q.poll();
            while(!q.isEmpty() && nums.get(q.peekLast()) < nums.get(i)) q.pollLast();
            q.offer(i);
            if(i>=k-1) System.out.print(nums.get(q.peek()) + " ");
        }
    }
}