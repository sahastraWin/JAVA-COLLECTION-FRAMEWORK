package collectionFramework.Problems.queue;

import java.util.*; class N{int v;N l,r;N(int x){v=x;}}
public class LevelOrder {
    void t(N r){ Queue<N> q=new LinkedList<>(); q.add(r); while(!q.isEmpty()){ N c=q.poll(); System.out.print(c.v); if(c.l!=null)q.add(c.l); if(c.r!=null)q.add(c.r); } }
}