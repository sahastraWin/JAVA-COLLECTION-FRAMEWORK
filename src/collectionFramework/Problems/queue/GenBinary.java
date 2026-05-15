package collectionFramework.Problems.queue;

import java.util.*;
public class GenBinary {
    public void g(int n){ Queue<String> q=new LinkedList<>(); q.add("1"); while(n-->0){ String s=q.poll(); System.out.println(s); q.add(s+"0"); q.add(s+"1"); } }
}