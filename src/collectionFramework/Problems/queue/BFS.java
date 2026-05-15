package collectionFramework.Problems.queue;

import java.util.*;
public class BFS {
    void b(int s, List<List<Integer>> a, int n){ boolean[] v=new boolean[n]; Queue<Integer> q=new LinkedList<>(); q.add(s); v[s]=true; while(!q.isEmpty()){ int u=q.poll(); for(int x:a.get(u)) if(!v[x]){ v[x]=true; q.add(x); } } }
}