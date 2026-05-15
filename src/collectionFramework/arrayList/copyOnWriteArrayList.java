package collectionFramework.arrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        /*
        copy on write means whenever a write operation like adding or removing an element takes place ; instead of
        updating the existing list a new copy of the list is created , and the modification is applied to that copy
        this ensures that the other threads which are reading the list will remain unaffected

        READ OPERATIONS  : fast and direct , since they happen on a stable list without interference from modifications

        WRITE OPERATIONS : a new copy of the list is created for every modification , the reference to the list
                           is then updated so that subsequent reads use this new list
        */

        /*
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List: " + shoppingList);
        for (String item : shoppingList) {
            System.out.println(item);
            if (item.equals("Eggs")) {
                shoppingList.add("Butter");
                System.out.println("Adding butter while reading");
            }
        }
        System.out.println("Updated Shopping List" + shoppingList);//will cause run-time error(ConcurrentModificationException) because we are modifying Arraylist while we are iterating
         */

        //to resolve this issue we will use CopyOnWriteArrayList


        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List: " + shoppingList);

        for (String item : shoppingList) {
            System.out.println(item);
            if (item.equals("Eggs")) {
                shoppingList.add("Butter");
                System.out.println("Adding butter while reading");
            }
        }
        //list will be modified after the loop is over
        System.out.println("Updated Shopping List" + shoppingList);
    }
}
