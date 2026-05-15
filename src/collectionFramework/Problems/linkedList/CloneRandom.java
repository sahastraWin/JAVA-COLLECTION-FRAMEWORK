package collectionFramework.Problems.linkedList;

import java.util.HashMap;
class RNode { int val; RNode next, random; RNode(int v){val=v;} }
public class CloneRandom {
    public static RNode copyRandomList(RNode head) {
        HashMap<RNode, RNode> m = new HashMap<>();
        RNode c=head; while(c!=null) { m.put(c, new RNode(c.val)); c=c.next; }
        c=head; while(c!=null) { m.get(c).next=m.get(c.next); m.get(c).random=m.get(c.random); c=c.next; }
        return m.get(head);
    }
}