package collectionFramework.Problems.arrayList;

import java.util.*;
public class PeakElement {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        for(int i=1; i<n.size()-1; i++) if(n.get(i)>n.get(i-1) && n.get(i)>n.get(i+1)) System.out.println(n.get(i));
    }
}