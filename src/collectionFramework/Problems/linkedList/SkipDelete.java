package collectionFramework.Problems.linkedList;

public class SkipDelete {
    public static void linkDelete(Node head, int M, int N) {
        Node c=head, t;
        while(c!=null) {
            for(int i=1; i<M && c!=null; i++) c=c.next;
            if(c==null) return;
            t=c.next;
            for(int i=1; i<=N && t!=null; i++) t=t.next;
            c.next=t; c=t;
        }
    }
}