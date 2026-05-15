package collectionFramework.Problems.linkedList;

public class RemoveNth {
    public static Node removeNthFromEnd(Node head, int n) {
        Node d=new Node(0); d.next=head; Node f=d, s=d;
        for(int i=0; i<=n; i++) f=f.next;
        while(f!=null) { f=f.next; s=s.next; }
        s.next=s.next.next; return d.next;
    }
}