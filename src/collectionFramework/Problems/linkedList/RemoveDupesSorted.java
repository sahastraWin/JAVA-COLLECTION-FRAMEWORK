package collectionFramework.Problems.linkedList;

public class RemoveDupesSorted {
    public static Node deleteDuplicates(Node head) {
        Node c=head;
        while(c!=null && c.next!=null) { if(c.data==c.next.data) c.next=c.next.next; else c=c.next; }
        return head;
    }
}