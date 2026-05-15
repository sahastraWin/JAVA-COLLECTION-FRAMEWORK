package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class SumAvg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20));
        int sum = 0; for(int n:list) sum+=n;
        System.out.println("Sum: "+sum+" Avg: "+(list.isEmpty()?0:sum/(double)list.size()));
    }
}