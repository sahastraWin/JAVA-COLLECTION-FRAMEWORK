package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class ReorganizeString {
    public String reorganizeString(String s) {
        Map<Character, Integer> c=new HashMap<>(); for(char x:s.toCharArray()) c.put(x, c.getOrDefault(x,0)+1);
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->c.get(b)-c.get(a)); pq.addAll(c.keySet());
        StringBuilder sb=new StringBuilder();
        while(pq.size()>=2){ char a=pq.poll(), b=pq.poll(); sb.append(a).append(b); if(c.put(a, c.get(a)-1)>1) pq.add(a); if(c.put(b, c.get(b)-1)>1) pq.add(b); }
        if(!pq.isEmpty()) { char l=pq.poll(); if(c.get(l)>1) return ""; sb.append(l); } return sb.toString();
    }
}