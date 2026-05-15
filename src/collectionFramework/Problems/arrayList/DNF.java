package collectionFramework.Problems.arrayList;

import java.util.*;
public class DNF {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 0, 1));
        int l=0, m=0, h=list.size()-1;
        while(m<=h) {
            if(list.get(m)==0) Collections.swap(list, l++, m++);
            else if(list.get(m)==1) m++;
            else Collections.swap(list, m, h--);
        }
        System.out.println(list);
    }
}