package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class RemoveRange {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        list.subList(2, 5).clear();
        System.out.println(list);
    }
}