package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class ExtractSubList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<5; i++) list.add(i);
        System.out.println(list.subList(1, 4));
    }
}