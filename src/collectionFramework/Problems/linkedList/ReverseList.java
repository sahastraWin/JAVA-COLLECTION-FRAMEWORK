package collectionFramework.Problems.linkedList;

public class ReverseList {
    public static Node reverse(Node head) {
        Node p=null, c=head, n;
        while(c!=null){ n=c.next; c.next=p; p=c; c=n; }
        return p;
    }
}