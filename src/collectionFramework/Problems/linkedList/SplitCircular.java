package collectionFramework.Problems.linkedList;

public class SplitCircular {
    public static void splitList(Node head) {
        Node s=head, f=head;
        while(f.next!=head && f.next.next!=head) { s=s.next; f=f.next.next; }
        if(f.next.next==head) f=f.next;
        Node h1=head, h2=s.next;
        f.next=h2; s.next=h1;
    }
}