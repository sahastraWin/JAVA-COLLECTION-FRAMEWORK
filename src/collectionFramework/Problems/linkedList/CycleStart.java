package collectionFramework.Problems.linkedList;

public class CycleStart {
    public static Node detectCycleStart(Node head) {
        Node s=head, f=head;
        while(f!=null && f.next!=null) {
            s=s.next; f=f.next.next;
            if(s==f) { s=head; while(s!=f){s=s.next; f=f.next;} return s; }
        }
        return null;
    }
}