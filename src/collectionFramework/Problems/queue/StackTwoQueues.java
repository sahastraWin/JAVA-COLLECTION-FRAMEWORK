package collectionFramework.Problems.queue;

import java.util.*;
class StackTwoQueues {
    Queue<Integer> q1=new LinkedList<>(), q2=new LinkedList<>();
    void push(int x){q2.add(x); while(!q1.isEmpty())q2.add(q1.poll()); Queue<Integer> t=q1; q1=q2; q2=t;}
    int pop(){return q1.isEmpty()?-1:q1.poll();}
}