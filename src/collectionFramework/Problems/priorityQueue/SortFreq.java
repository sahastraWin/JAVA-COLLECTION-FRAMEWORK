package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class SortFreq {
    public String frequencySort(String s) {
        Map<Character, Integer> m=new HashMap<>(); for(char c:s.toCharArray()) m.put(c, m.getOrDefault(c,0)+1);
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->m.get(b)-m.get(a)); pq.addAll(m.keySet());
        StringBuilder sb=new StringBuilder(); while(!pq.isEmpty()){ char c=pq.poll(); for(int i=0;i<m.get(c);i++) sb.append(c); } return sb.toString();
    }
}