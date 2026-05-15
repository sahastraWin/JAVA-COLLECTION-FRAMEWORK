package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class ConvertToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B"));
        String[] arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}