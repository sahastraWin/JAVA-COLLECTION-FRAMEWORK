package collectionFramework.Problems.queue;

import java.util.*;
public class QueueReversal {
    public void reverse(Queue<Integer> q){ Stack<Integer> s=new Stack<>(); while(!q.isEmpty())s.push(q.poll()); while(!s.isEmpty())q.add(s.pop()); }
}