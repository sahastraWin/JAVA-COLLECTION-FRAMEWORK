package collectionFramework.Problems.linkedList;

import java.util.HashSet;
public class RemoveDupesUnsorted {
    public static void removeDuplicates(Node head) {
        HashSet<Integer> s = new HashSet<>();
        Node p=null, c=head;
        while(c!=null) { if(s.contains(c.data)) p.next=c.next; else { s.add(c.data); p=c; } c=c.next; }
    }
}