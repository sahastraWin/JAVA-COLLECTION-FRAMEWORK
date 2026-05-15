package collectionFramework.Problems.priorityQueue;

import java.util.*;

class E implements Comparable<E> {
	int v, r, c;

	E(int v, int r, int c) {
		this.v = v;
		this.r = r;
		this.c = c;
	}

	public int compareTo(E e) {
		return v - e.v;
	}
}

public class MergeArrays {
	public static void main(String[] args) {
		int[][] a = { { 1 }, { 2 } };
		PriorityQueue<E> pq = new PriorityQueue<>();
		for (int i = 0; i < a.length; i++)
			pq.add(new E(a[i][0], i, 0));
		while (!pq.isEmpty()) {
			E e = pq.poll();
			System.out.print(e.v + " ");
			if (e.c + 1 < a[e.r].length)
				pq.add(new E(a[e.r][e.c + 1], e.r, e.c + 1));
		}
	}
}