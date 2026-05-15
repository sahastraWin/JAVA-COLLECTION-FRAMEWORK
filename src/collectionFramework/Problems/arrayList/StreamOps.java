package collectionFramework.Problems.arrayList;

import java.util.*; import java.util.stream.Collectors;
public class StreamOps {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(Arrays.asList("a", "b"));
        System.out.println(l.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}