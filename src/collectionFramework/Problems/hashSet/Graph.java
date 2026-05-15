package collectionFramework.Problems.hashSet;

import java.util.*;
class Graph {
    Map<Integer, HashSet<Integer>> adj = new HashMap<>();
    void add(int u, int v) { adj.computeIfAbsent(u, k->new HashSet<>()).add(v); }
}