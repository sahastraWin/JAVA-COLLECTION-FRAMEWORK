package collectionFramework.linkedList;

import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(2);//O(N)
        list.addLast(4);
        list.addFirst(0);
        System.out.println(list);
        list.removeIf(x -> x % 2 == 0);//removing elements according to the condition
        System.out.println(list);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant","Lion"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove);//removing all the elements present in animalsToRemove and animals (commom animals)
        System.out.println(animals);


    }
}
