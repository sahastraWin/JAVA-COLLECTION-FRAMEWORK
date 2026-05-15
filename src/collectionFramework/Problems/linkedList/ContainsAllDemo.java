package collectionFramework.Problems.linkedList;

import java.util.LinkedList; import java.util.Arrays;
public class ContainsAllDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> sub = new LinkedList<>(Arrays.asList(2, 3));
        System.out.println("Contains all? " + list.containsAll(sub));
    }
}