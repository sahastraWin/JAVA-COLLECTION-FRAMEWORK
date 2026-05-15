package collectionFramework.Problems.treeSet;

import java.util.*;
class Job { int s, e; Job(int s, int e){this.s=s;this.e=e;} }
public class IntervalScheduling {
    public static void main(String[] args) {
        TreeSet<Job> jobs = new TreeSet<>(Comparator.comparingInt(j -> j.e));
        jobs.add(new Job(1, 3)); jobs.add(new Job(2, 4)); jobs.add(new Job(3, 5));
        int count = 0, lastEnd = -1;
        for(Job j : jobs) if(j.s >= lastEnd) { count++; lastEnd = j.e; }
        System.out.println("Max Jobs: " + count);
    }
}