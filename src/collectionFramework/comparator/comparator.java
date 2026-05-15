package collectionFramework.comparator;

import java.util.*;

class StringlengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // return s2.length()-s1.length();descending order.
        return s1.length() - s2.length();//ascending order.

    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // return o2 - o1; descending order.
        return o1 - o2;//ascending order.
    }
}

public class comparator {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(-1);
        //Collections.sort(list);
        list.sort(new MyComparator());

        System.out.println(list);

        //using method
        List<String> words = Arrays.asList("jeet", "sahastrajeet", "vedraj");
        words.sort(new StringlengthComparator());

        //lambdaExpression:
        words.sort((a, b) -> a.length() - b.length());//ascending order
        words.sort((a, b) -> b.length() - a.length());//descending order
        System.out.println(words);
    }
}
