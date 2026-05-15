package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays; import java.util.LinkedHashSet;
public class RemoveDupes {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);
    }
}