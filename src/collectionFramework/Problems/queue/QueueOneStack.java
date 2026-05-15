package collectionFramework.Problems.queue;

import java.util.Stack;
class QueueOneStack {
    Stack<Integer> s=new Stack<>();
    void enq(int x){s.push(x);}
    int deq(){if(s.isEmpty())return -1; if(s.size()==1)return s.pop(); int x=s.pop(), r=deq(); s.push(x); return r;}
}