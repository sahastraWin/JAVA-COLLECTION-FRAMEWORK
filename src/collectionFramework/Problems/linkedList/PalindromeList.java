package collectionFramework.Problems.linkedList;

import java.util.Stack;
public class PalindromeList {
    public static boolean isPalindrome(Node head) {
        Node s=head, f=head; Stack<Integer> st = new Stack<>();
        while(f!=null && f.next!=null) { st.push(s.data); s=s.next; f=f.next.next; }
        if(f!=null) s=s.next;
        while(s!=null) { if(st.pop()!=s.data) return false; s=s.next; }
        return true;
    }
}