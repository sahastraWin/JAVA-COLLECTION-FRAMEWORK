package collectionFramework.Problems.linkedList;

public class DeleteGreater {
    public static Node compute(Node head) {
        head=ReverseList.reverse(head); Node c=head; int max=head.data;
        while(c!=null && c.next!=null) { if(c.next.data<max) c.next=c.next.next; else { c=c.next; max=c.data; } }
        return ReverseList.reverse(head);
    }
}