package collectionFramework.Problems.arrayList;

import java.util.*;
public class MajorityEl {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(3, 2, 3));
        int c=0, cand=0;
        for(int x:n) { if(c==0) cand=x; c+=(x==cand)?1:-1; }
        System.out.println(cand);
    }
}