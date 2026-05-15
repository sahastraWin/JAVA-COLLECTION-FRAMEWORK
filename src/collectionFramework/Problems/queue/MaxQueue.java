package collectionFramework.Problems.queue;

import java.util.*;
class MaxQueue { Queue<Integer> q=new LinkedList<>(); Deque<Integer> d=new ArrayDeque<>(); void enq(int x){q.offer(x); while(!d.isEmpty()&&d.peekLast()<x)d.pollLast(); d.offerLast(x);} void deq(){if(q.poll().equals(d.peekFirst()))d.pollFirst();} int max(){return d.peekFirst();} }