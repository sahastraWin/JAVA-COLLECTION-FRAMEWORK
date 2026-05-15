package collectionFramework.Problems.queue;

import java.util.*; public class RotateQ { void r(Queue<Integer> q, int k){ for(int i = 0; i<k; i++)q.add(q.poll()); } }