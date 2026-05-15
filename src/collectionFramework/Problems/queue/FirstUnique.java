package collectionFramework.Problems.queue;

import java.util.*;
public class FirstUnique {
    public void f(String s){ int[] c=new int[26]; Queue<Character> q=new LinkedList<>(); for(char x:s.toCharArray()){ c[x-'a']++; q.add(x); while(!q.isEmpty()&&c[q.peek()-'a']>1)q.poll(); System.out.print(q.isEmpty()?"# ":q.peek()+" "); } }
}