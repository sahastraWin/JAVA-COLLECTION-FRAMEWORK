package collectionFramework.Problems.arrayList;

import java.util.*;
public class RotateList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Collections.rotate(list, 2);
        System.out.println(list);
    }
}