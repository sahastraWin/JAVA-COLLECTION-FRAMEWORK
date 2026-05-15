package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class ClearList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.clear();
        System.out.println("List after clear: " + list);
    }
}