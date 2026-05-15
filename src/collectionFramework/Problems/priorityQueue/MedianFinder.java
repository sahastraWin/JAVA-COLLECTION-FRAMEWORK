package collectionFramework.Problems.priorityQueue;

import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> lo=new PriorityQueue<>(Collections.reverseOrder()), hi=new PriorityQueue<>();
    void add(int n){ lo.add(n); hi.add(lo.poll()); if(lo.size()<hi.size()) lo.add(hi.poll()); }
    double find(){ return lo.size()>hi.size()?lo.peek():(lo.peek()+hi.peek())/2.0; }
}