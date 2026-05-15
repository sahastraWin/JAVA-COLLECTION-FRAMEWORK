package collectionFramework.Problems.arrayList;

import java.util.*;
public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 15, 2));
        list.removeIf(n -> n > 10);
        System.out.println(list);
    }
}