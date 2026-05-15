package collectionFramework.Problems.linkedList;

public class PairSwap {
    public static Node swapPairs(Node head) {
        if(head==null || head.next==null) return head;
        Node s=head.next; head.next=swapPairs(s.next); s.next=head; return s;
    }
}