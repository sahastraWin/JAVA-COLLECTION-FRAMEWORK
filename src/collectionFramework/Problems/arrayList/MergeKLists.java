package collectionFramework.Problems.arrayList;

import java.util.*;
public class MergeKLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(Arrays.asList(1, 4))); lists.add(new ArrayList<>(Arrays.asList(1, 3)));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(List<Integer> l : lists) pq.addAll(l);
        ArrayList<Integer> res = new ArrayList<>();
        while(!pq.isEmpty()) res.add(pq.poll());
        System.out.println(res);
    }
}