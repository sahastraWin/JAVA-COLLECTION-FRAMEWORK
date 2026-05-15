package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class SetElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A"); list.set(0, "B");
        System.out.println(list);
    }
}