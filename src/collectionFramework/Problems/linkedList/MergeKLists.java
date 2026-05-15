package collectionFramework.Problems.linkedList;

import java.util.PriorityQueue;
public class MergeKLists {
    public static Node mergeKLists(Node[] lists) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.data-b.data);
        for(Node l:lists) if(l!=null) pq.add(l);
        Node d=new Node(0), t=d;
        while(!pq.isEmpty()) { t.next=pq.poll(); t=t.next; if(t.next!=null) pq.add(t.next); }
        return d.next;
    }
}