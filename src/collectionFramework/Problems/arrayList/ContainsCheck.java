package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class ContainsCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        System.out.println(list.indexOf("Python"));
    }
}