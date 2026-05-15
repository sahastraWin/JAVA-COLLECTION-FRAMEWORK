package collectionFramework.Problems.arrayList;

import java.util.*;
public class ValidParens {
    public static void main(String[] args) {
        ArrayList<Character> c = new ArrayList<>(Arrays.asList('(',')',')'));
        int o=0; for(int i=0; i<c.size(); i++) {
            if(c.get(i)=='(') o++; else if(c.get(i)==')') { if(o>0) o--; else { c.remove(i); i--; } }
        }
        System.out.println(c);
    }
}