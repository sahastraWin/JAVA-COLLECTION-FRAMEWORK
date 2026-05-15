package collectionFramework.Problems.queue;

import java.util.*;
public class HotPotato {
    String p(String[] n, int k){ Queue<String> q=new LinkedList<>(Arrays.asList(n)); while(q.size()>1){ for(int i=0;i<k;i++)q.add(q.poll()); q.poll(); } return q.poll(); }
}