package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class StringToAL {
    public static void main(String[] args) {
        String s = "A, B, C";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(", ")));
        System.out.println(list);
    }
}