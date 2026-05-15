package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
class ListNode { int val; ListNode next; ListNode(int x){val=x;} }
public class MergeLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode l:lists) if(l!=null) pq.add(l);
        ListNode d=new ListNode(0), t=d;
        while(!pq.isEmpty()){ t.next=pq.poll(); t=t.next; if(t.next!=null) pq.add(t.next); } return d.next;
    }
}