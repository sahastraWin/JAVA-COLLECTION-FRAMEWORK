package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
class N implements Comparable<N>{ int c; public int compareTo(N n){return c-n.c;} }
public class AStar {
    public void find() { new PriorityQueue<N>().add(new N()); }
}