package collectionFramework.Problems.linkedList;

import java.util.LinkedList; import java.util.Collections;
public class NullCheck {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add(null);
        System.out.println(Collections.frequency(list, null));
    }
}