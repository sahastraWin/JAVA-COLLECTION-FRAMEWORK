package collectionFramework.Problems.priorityQueue;

import java.util.*;
class T implements Comparable<T>{ int p; T(int p){this.p=p;} public int compareTo(T t){return t.p-p;} }
public class Scheduler {
    public static void main(String[] args) {
        PriorityQueue<T> pq=new PriorityQueue<>(); pq.add(new T(10)); System.out.println(pq.peek().p);
    }
}