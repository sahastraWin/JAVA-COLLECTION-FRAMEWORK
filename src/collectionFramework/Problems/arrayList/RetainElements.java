package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class RetainElements {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        l1.retainAll(Arrays.asList("B", "D"));
        System.out.println(l1);
    }
}