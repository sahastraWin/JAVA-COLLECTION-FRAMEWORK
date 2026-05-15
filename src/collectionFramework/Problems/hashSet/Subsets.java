package collectionFramework.Problems.hashSet;

import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2));
        for(int i=0; i<(1<<l.size()); i++) {
            List<Integer> sub = new ArrayList<>();
            for(int j=0; j<l.size(); j++) if((i&(1<<j))>0) sub.add(l.get(j));
            System.out.println(sub);
        }
    }
}