package collectionFramework.Problems.linkedList;

class Node { int data; Node next; Node(int d){data=d;} }
public class DetectCycle {
    public static boolean hasCycle(Node head) {
        Node s=head, f=head;
        while(f!=null && f.next!=null) { s=s.next; f=f.next.next; if(s==f) return true; }
        return false;
    }
}