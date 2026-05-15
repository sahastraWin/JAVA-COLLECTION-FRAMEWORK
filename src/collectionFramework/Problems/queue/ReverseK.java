package collectionFramework.Problems.queue;

import java.util.*;
public class ReverseK {
    public void r(Queue<Integer> q, int k){ Stack<Integer> s=new Stack<>(); for(int i=0;i<k;i++)s.push(q.poll()); while(!s.isEmpty())q.add(s.pop()); for(int i=0;i<q.size()-k;i++)q.add(q.poll()); }
}