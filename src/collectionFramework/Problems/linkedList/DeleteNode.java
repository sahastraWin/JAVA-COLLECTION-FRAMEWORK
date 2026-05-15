package collectionFramework.Problems.linkedList;

public class DeleteNode {
    public static void deleteNode(Node node) {
        if(node!=null && node.next!=null) { node.data=node.next.data; node.next=node.next.next; }
    }
}