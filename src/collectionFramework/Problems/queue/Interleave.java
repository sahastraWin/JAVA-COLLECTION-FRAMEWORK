package collectionFramework.Problems.queue;

import java.util.*;
public class Interleave {
    public void i(Queue<Integer> q){ Stack<Integer> s=new Stack<>(); int h=q.size()/2; for(int i=0;i<h;i++)s.push(q.poll()); while(!s.isEmpty())q.add(s.pop()); for(int i=0;i<h;i++)q.add(q.poll()); for(int i=0;i<h;i++)s.push(q.poll()); while(!s.isEmpty()){q.add(s.pop()); q.add(q.poll());} }
}