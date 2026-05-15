package collectionFramework.Problems.linkedList;

public class Partition {
    public static Node partition(Node head, int x) {
        Node sH=new Node(0), sT=sH, gH=new Node(0), gT=gH;
        while(head!=null) { if(head.data<x) { sT.next=head; sT=sT.next; } else { gT.next=head; gT=gT.next; } head=head.next; }
        gT.next=null; sT.next=gH.next; return sH.next;
    }
}