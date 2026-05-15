package collectionFramework.Problems.priorityQueue;
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Dijkstra solver = new Dijkstra();
        int n = 5; // Number of nodes
        int startNode = 0;

        // Initialize adjacency list
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        // Add edges: {neighbor, weight}
        graph.get(0).add(new int[]{1, 2});
        graph.get(0).add(new int[]{2, 4});
        graph.get(1).add(new int[]{2, 1});
        graph.get(1).add(new int[]{3, 7});
        graph.get(2).add(new int[]{4, 3});
        graph.get(3).add(new int[]{4, 1});

        solver.shortestPath(startNode, graph, n);
    }
}
