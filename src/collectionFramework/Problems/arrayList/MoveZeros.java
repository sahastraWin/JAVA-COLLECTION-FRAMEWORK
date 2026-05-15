package collectionFramework.Problems.arrayList;

import java.util.*;
public class MoveZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 0, 3));
        int pos = 0;
        for(int n : list) if(n!=0) list.set(pos++, n);
        while(pos < list.size()) list.set(pos++, 0);
        System.out.println(list);
    }
}