package collectionFramework.Problems.linkedList;

public class RotateList {
    public static Node rotateRight(Node head, int k) {
        if(head==null || k==0) return head;
        Node t=head; int len=1;
        while(t.next!=null) { t=t.next; len++; }
        t.next=head; k%=len;
        for(int i=0; i<len-k; i++) t=t.next;
        head=t.next; t.next=null; return head;
    }
}