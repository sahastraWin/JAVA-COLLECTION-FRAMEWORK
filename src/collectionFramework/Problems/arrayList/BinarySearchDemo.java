package collectionFramework.Problems.arrayList;

import java.util.*;
public class BinarySearchDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5));
        System.out.println(Collections.binarySearch(list, 5));
    }
}