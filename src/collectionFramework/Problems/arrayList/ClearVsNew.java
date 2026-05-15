package collectionFramework.Problems.arrayList;

import java.util.ArrayList;
public class ClearVsNew {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); 
        ArrayList<Integer> list2 = list1;
        list1.clear(); // Affects list2
        System.out.println(list2); 
        list1 = new ArrayList<>(); // Does not affect list2
        list1.add(5);
        System.out.println(list1 + " " + list2);
    }
}