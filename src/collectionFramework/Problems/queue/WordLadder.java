package collectionFramework.Problems.queue;

import java.util.*;
public class WordLadder {
    public int l(String b, String e, List<String> w){ Set<String> d=new HashSet<>(w); if(!d.contains(e))return 0; Queue<String> q=new LinkedList<>(); q.add(b); int s=1; while(!q.isEmpty()){ int z=q.size(); while(z-->0){ char[] c=q.poll().toCharArray(); for(int i=0;i<c.length;i++){ char t=c[i]; for(char x='a';x<='z';x++){ c[i]=x; String n=new String(c); if(n.equals(e))return s+1; if(d.contains(n)){d.remove(n); q.add(n);} } c[i]=t; } } s++; } return 0; }
}