package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays; import java.util.Collections;
public class RemoveNulls {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", null, "B"));
        list.removeAll(Collections.singleton(null));
        System.out.println(list);
    }
}