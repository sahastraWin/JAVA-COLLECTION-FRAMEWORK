package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class FirstLast {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
        if(!list.isEmpty()) System.out.println(list.get(0) + " " + list.get(list.size()-1));
    }
}