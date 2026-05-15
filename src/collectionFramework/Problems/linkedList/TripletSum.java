package collectionFramework.Problems.linkedList;

class DLLNode { int data; DLLNode next, prev; }
public class TripletSum {
    public static boolean findTriplet(DLLNode head, int x) {
        DLLNode p1, p2, p3=head;
        while(p3!=null) {
            p1=p3.next; p2=head; while(p2.next!=null) p2=p2.next;
            while(p1!=null && p2!=null && p1!=p2 && p2.next!=p1) {
                int sum=p1.data+p2.data+p3.data;
                if(sum==x) return true; else if(sum<x) p1=p1.next; else p2=p2.prev;
            }
            p3=p3.next;
        }
        return false;
    }
}