package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class FindIndices {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("A");
        System.out.println(list.indexOf("A") + " " + list.lastIndexOf("A"));
    }
}