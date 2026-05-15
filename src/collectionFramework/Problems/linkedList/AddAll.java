package collectionFramework.Problems.linkedList;

import java.util.LinkedList; import java.util.Arrays;
public class AddAll {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1));
        l1.addAll(Arrays.asList(2, 3));
        System.out.println(l1);
    }
}