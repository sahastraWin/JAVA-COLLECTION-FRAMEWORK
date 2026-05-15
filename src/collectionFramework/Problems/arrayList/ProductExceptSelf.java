package collectionFramework.Problems.arrayList;

import java.util.*;
public class ProductExceptSelf {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n.size(), 1));
        int l=1; for(int i=0; i<n.size(); i++) { res.set(i, l); l*=n.get(i); }
        int r=1; for(int i=n.size()-1; i>=0; i--) { res.set(i, res.get(i)*r); r*=n.get(i); }
        System.out.println(res);
    }
}