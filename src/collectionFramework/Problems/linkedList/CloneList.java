package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class CloneList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A"); list.add("B");
        LinkedList<String> cloned = (LinkedList<String>) list.clone();
        System.out.println("Cloned: " + cloned);
    }
}