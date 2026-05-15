package collectionFramework.Problems.priorityQueue;

import java.util.*;
class E implements Comparable<E>{ int s; E(int s){this.s=s;} public int compareTo(E e){return e.s-s;} }
public class EmpPriority {
    public static void main(String[] args) {
        PriorityQueue<E> pq=new PriorityQueue<>(); pq.add(new E(10)); System.out.println(pq.peek().s);
    }
}