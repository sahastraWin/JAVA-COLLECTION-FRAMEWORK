package collectionFramework.Problems.priorityQueue;

import java.util.*;
class HNode implements Comparable<HNode>{ char c; int f; HNode l,r; HNode(char c,int f){this.c=c;this.f=f;} public int compareTo(HNode n){return f-n.f;} }
public class Huffman {
    public void build(char[] c, int[] f) {
        PriorityQueue<HNode> pq=new PriorityQueue<>(); for(int i=0; i<c.length; i++) pq.add(new HNode(c[i], f[i]));
        while(pq.size()>1){ HNode l=pq.poll(), r=pq.poll(), p=new HNode('-', l.f+r.f); p.l=l; p.r=r; pq.add(p); }
    }
}