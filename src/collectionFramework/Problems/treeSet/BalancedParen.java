package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class BalancedParen {
    public static void main(String[] args) {
        System.out.println("Valid: " + isValid("(())"));
    }
    public static boolean isValid(String s) {
        TreeSet<Integer> idx = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') idx.add(i);
            else if (s.charAt(i) == ')') { if (idx.isEmpty()) return false; idx.pollLast(); }
        }
        return idx.isEmpty();
    }
}