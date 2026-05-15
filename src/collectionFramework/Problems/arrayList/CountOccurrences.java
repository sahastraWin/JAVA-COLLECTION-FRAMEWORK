package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Collections; import java.util.Arrays;
public class CountOccurrences {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        System.out.println(Collections.frequency(list, 2));
    }
}