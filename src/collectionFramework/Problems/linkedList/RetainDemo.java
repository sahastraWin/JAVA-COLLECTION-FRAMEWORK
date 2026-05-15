package collectionFramework.Problems.linkedList;

import java.util.LinkedList; import java.util.Arrays;
public class RetainDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.retainAll(Arrays.asList("A", "C"));
        System.out.println(list);
    }
}