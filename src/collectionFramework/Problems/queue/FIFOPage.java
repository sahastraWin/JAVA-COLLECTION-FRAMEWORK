package collectionFramework.Problems.queue;

import java.util.*;
public class FIFOPage {
    int f(int[] p, int c){ Queue<Integer> q=new LinkedList<>(); Set<Integer> s=new HashSet<>(); int f=0; for(int x:p){ if(!s.contains(x)){ if(q.size()==c)s.remove(q.poll()); q.add(x); s.add(x); f++; } } return f; }
}