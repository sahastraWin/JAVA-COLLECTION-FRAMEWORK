package collectionFramework.Problems.arrayList;

import java.util.*;
public class Zigzag {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(4, 3, 7, 8, 6));
        for(int i=0; i<l.size()-1; i++) {
            if(i%2==0) { if(l.get(i)>l.get(i+1)) Collections.swap(l, i, i+1); }
            else { if(l.get(i)<l.get(i+1)) Collections.swap(l, i, i+1); }
        }
        System.out.println(l);
    }
}