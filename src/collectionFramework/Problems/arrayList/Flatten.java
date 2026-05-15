package collectionFramework.Problems.arrayList;

import java.util.*;
public class Flatten {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(new ArrayList<>(Arrays.asList(1))); nested.add(new ArrayList<>(Arrays.asList(2)));
        ArrayList<Integer> flat = new ArrayList<>();
        for(ArrayList<Integer> l : nested) flat.addAll(l);
        System.out.println(flat);
    }
}