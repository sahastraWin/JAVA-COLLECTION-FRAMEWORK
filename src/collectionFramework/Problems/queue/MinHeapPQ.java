package collectionFramework.Problems.queue;

import java.util.*;
class MinHeapPQ { List<Integer> h=new ArrayList<>(); void add(int v){h.add(v); Collections.sort(h);} int poll(){return h.remove(0);} }