package collectionFramework.Problems.priorityQueue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
    int i, d;

    Node(int i, int d) {
        this.i = i;
        this.d = d;
    }

    public int compareTo(Node n) {
        return d - n.d;
    }
}

public class Dijkstra {
    public void shortestPath(int s, List<List<int[]>> g, int n) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] d = new int[n];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[s] = 0;
        pq.add(new Node(s, 0));
        while (!pq.isEmpty()) {
            Node u = pq.poll();
            if (u.d > d[u.i]) continue;
            for (int[] e : g.get(u.i))
                if (d[u.i] + e[1] < d[e[0]]) {
                    d[e[0]] = d[u.i] + e[1];
                    pq.add(new Node(e[0], d[e[0]]));
                }
        }
    }
}
