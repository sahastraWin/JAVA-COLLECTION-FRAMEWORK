package collectionFramework.Problems.linkedList;

public class ReverseKGroup {
    public static Node reverseKGroup(Node head, int k) {
        Node c=head; int count=0;
        while(c!=null && count!=k){ c=c.next; count++; }
        if(count==k) {
            c=reverseKGroup(c, k);
            while(count-->0){ Node t=head.next; head.next=c; c=head; head=t; }
            head=c;
        }
        return head;
    }
}