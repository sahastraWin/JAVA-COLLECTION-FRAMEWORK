package collectionFramework.Problems.linkedList;

public class OddEvenList {
    public static Node oddEvenList(Node head) {
        if(head==null) return null;
        Node o=head, e=head.next, eh=e;
        while(e!=null && e.next!=null) { o.next=e.next; o=o.next; e.next=o.next; e=e.next; }
        o.next=eh; return head;
    }
}