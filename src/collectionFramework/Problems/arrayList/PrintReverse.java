package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays; import java.util.ListIterator;
public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListIterator<Integer> it = list.listIterator(list.size());
        while(it.hasPrevious()) System.out.print(it.previous() + " ");
    }
}