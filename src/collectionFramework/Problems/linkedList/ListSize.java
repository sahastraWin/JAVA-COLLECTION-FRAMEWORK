package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class ListSize {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); list.add(2);
        System.out.println("Size: " + list.size());
    }
}