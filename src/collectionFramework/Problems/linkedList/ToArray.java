package collectionFramework.Problems.linkedList;

import java.util.LinkedList; import java.util.Arrays;
public class ToArray {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        System.out.println(Arrays.toString(list.toArray(new String[0])));
    }
}