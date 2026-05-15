package collectionFramework.Problems.queue;

import java.util.Stack;
class QueueTwoStacks {
    Stack<Integer> s1=new Stack<>(), s2=new Stack<>();
    void enq(int x){s1.push(x);}
    int deq(){if(s1.isEmpty()&&s2.isEmpty())return -1; if(s2.isEmpty())while(!s1.isEmpty())s2.push(s1.pop()); return s2.pop();}
}