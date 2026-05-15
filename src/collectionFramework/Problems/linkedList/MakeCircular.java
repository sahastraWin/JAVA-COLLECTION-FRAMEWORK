package collectionFramework.Problems.linkedList;

public class MakeCircular {
    public static Node toCircular(Node head) {
        Node c=head; while(c.next!=null) c=c.next; c.next=head; return head;
    }
}