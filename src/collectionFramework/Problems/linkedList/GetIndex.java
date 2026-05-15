package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class GetIndex {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First"); list.add("Second");
        System.out.println("Element at index 1: " + list.get(1));
    }
}