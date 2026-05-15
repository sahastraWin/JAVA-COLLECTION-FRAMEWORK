package collectionFramework.Problems.queue;

import java.util.*;
class BoundedQ { Queue<Integer> q=new LinkedList<>(); int c; BoundedQ(int k){c=k;} synchronized void e(int x)throws Exception{while(q.size()==c)wait(); q.add(x); notifyAll();} synchronized int d()throws Exception{while(q.isEmpty())wait(); int x=q.poll(); notifyAll(); return x;} }