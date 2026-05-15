package collectionFramework.Problems.queue;

import java.util.*; public class SortQ { void s(Queue<Integer> q){ List<Integer> l=new ArrayList<>(q); Collections.sort(l); q.clear(); q.addAll(l); } }