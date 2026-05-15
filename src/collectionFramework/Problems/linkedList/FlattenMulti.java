package collectionFramework.Problems.linkedList;

class DNode { int val; DNode prev, next, child; }
public class FlattenMulti {
    public static DNode flatten(DNode head) {
        DNode c=head;
        while(c!=null) {
            if(c.child!=null) {
                DNode n=c.next; c.next=flatten(c.child); c.next.prev=c; c.child=null;
                while(c.next!=null) c=c.next;
                if(n!=null) { c.next=n; n.prev=c; }
            }
            c=c.next;
        }
        return head;
    }
}