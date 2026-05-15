package collectionFramework.Problems.linkedList;

import java.util.LinkedList; import java.util.Iterator;
public class BiDirectionalPrint {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); list.add(2);
        System.out.println(list);
        Iterator<Integer> it = list.descendingIterator();
        while(it.hasNext()) System.out.print(it.next() + " ");
    }
}