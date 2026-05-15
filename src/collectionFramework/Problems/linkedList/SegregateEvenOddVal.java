package collectionFramework.Problems.linkedList;

public class SegregateEvenOddVal {
    public static Node segregate(Node head) {
        Node es=null, ee=null, os=null, oe=null, c=head;
        while(c!=null) {
            if(c.data%2==0) { if(es==null) es=c; else ee.next=c; ee=c; }
            else { if(os==null) os=c; else oe.next=c; oe=c; }
            c=c.next;
        }
        if(os==null) return es; if(es==null) return os;
        ee.next=os; oe.next=null; return es;
    }
}