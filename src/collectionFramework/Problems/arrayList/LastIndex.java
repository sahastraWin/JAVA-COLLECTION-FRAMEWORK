package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class LastIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2));
        System.out.println(list.lastIndexOf(2));
    }
}