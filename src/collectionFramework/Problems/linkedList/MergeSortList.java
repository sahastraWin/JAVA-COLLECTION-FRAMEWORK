package collectionFramework.Problems.linkedList;

public class MergeSortList {
    public static Node sortList(Node head) {
        if(head==null || head.next==null) return head;
        Node p=null, s=head, f=head;
        while(f!=null && f.next!=null) { p=s; s=s.next; f=f.next.next; }
        p.next=null;
        return MergeSorted.mergeTwoLists(sortList(head), sortList(s));
    }
}