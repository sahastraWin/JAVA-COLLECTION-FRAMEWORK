package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class PosNegSplit {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -1, 2));
        ArrayList<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
        for(int n:list) if(n>=0) pos.add(n); else neg.add(n);
        System.out.println(pos + " " + neg);
    }
}