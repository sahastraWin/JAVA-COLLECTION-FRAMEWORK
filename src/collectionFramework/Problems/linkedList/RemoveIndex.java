package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class RemoveIndex {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(20);
        list.remove(1);
        System.out.println(list);
    }
}