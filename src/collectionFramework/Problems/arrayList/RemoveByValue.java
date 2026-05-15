package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class RemoveByValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2, 5));
        list.removeIf(n -> n == 2);
        System.out.println(list);
    }
}