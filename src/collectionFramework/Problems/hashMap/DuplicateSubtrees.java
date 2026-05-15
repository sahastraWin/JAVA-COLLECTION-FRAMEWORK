package collectionFramework.Problems.hashMap;

import java.util.*;
class TreeNode { int val; TreeNode left, right; TreeNode(int x){val=x;} }
public class DuplicateSubtrees {
    Map<String, Integer> m = new HashMap<>(); List<TreeNode> r = new ArrayList<>();
    public String s(TreeNode n) {
        if(n==null) return "#";
        String ser = n.val + "," + s(n.left) + "," + s(n.right);
        m.put(ser, m.getOrDefault(ser, 0)+1); if(m.get(ser)==2) r.add(n); return ser;
    }
}