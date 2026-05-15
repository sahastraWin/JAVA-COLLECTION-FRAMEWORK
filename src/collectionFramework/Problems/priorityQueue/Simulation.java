package collectionFramework.Problems.priorityQueue;

import java.util.*;
class Ev implements Comparable<Ev>{ int t; String y; Ev(int t, String y){this.t=t;this.y=y;} public int compareTo(Ev e){return t-e.t;} }
public class Simulation {
    public static void main(String[] args) {
        PriorityQueue<Ev> pq=new PriorityQueue<>(); pq.add(new Ev(1, "A")); System.out.println(pq.poll().y);
    }
}