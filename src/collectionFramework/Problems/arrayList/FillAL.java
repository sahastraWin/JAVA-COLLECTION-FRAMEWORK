package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Collections;
public class FillAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(5, 10));
        System.out.println(list);
    }
}