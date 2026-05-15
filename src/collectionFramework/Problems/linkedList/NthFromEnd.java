package collectionFramework.Problems.linkedList;

public class NthFromEnd {
    public static Node findNthFromEnd(Node head, int n) {
        Node m=head, r=head;
        for(int i=0; i<n; i++) if(r!=null) r=r.next;
        while(r!=null) { m=m.next; r=r.next; }
        return m;
    }
}