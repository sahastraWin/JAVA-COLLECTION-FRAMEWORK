package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class RemoveRange {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<10; i++) list.add(i);
        list.subList(2, 5).clear();
        System.out.println(list);
    }
}