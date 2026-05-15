package collectionFramework.Problems.linkedList;

public class ReorderList {
    public static void reorderList(Node head) {
        if(head==null) return;
        Node s=head, f=head; while(f!=null && f.next!=null) { s=s.next; f=f.next.next; }
        Node p=null, c=s, t; while(c!=null) { t=c.next; c.next=p; p=c; c=t; }
        Node fst=head, sec=p;
        while(sec.next!=null) { t=fst.next; fst.next=sec; fst=t; t=sec.next; sec.next=fst; sec=t; }
    }
}