package collectionFramework.Problems.treeSet;

import java.util.TreeSet; import java.util.Arrays;
public class ToArray {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(); ts.add("B"); ts.add("A");
        String[] arr = ts.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}