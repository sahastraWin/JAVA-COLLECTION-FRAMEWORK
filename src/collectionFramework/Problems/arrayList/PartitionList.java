package collectionFramework.Problems.arrayList;

import java.util.*; import java.util.stream.Collectors;
public class PartitionList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 60, 20));
        Map<Boolean, List<Integer>> p = list.stream().collect(Collectors.partitioningBy(n -> n > 50));
        System.out.println(p);
    }
}