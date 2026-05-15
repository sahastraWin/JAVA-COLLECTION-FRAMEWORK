package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;

public class ALtoString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B"));
        System.out.println(String.join(", ", list));
    }
}