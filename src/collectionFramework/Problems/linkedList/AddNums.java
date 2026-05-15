package collectionFramework.Problems.linkedList;

public class AddNums {
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node d=new Node(0), c=d; int carry=0;
        while(l1!=null || l2!=null || carry>0) {
            int s=carry+(l1!=null?l1.data:0)+(l2!=null?l2.data:0);
            c.next=new Node(s%10); carry=s/10; c=c.next;
            if(l1!=null) l1=l1.next; if(l2!=null) l2=l2.next;
        }
        return d.next;
    }
}