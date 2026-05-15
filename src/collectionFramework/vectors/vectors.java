package collectionFramework.vectors;

import java.util.*;

public class vectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(11);
        //vector has an ability to check capacity unlike collectionExercises.arrayList
        System.out.println(v.capacity());
        //if the size of the vector goes beyond the pre-defined or defined capacity then the size grows 2x times the previous defined.
        //or pre-defined capacity unlike in collectionExercises.arrayList it grows by 1.5x.
        Vector<Integer> v1 = new Vector<>(11, 13);//incrementing the capacity manually
        Vector<String> v2 = new Vector<>(Arrays.asList("jeet", "suraj"));
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        Vector<Integer> v3 = new Vector<>(l1);
        System.out.println(v3);
        System.out.println(v2);
        for (int i = 0; i < v2.size(); i++) {
            System.out.println(v2.get(i));
        }
        //clear
        v2.clear();
        System.out.println(v2);


    }
}
