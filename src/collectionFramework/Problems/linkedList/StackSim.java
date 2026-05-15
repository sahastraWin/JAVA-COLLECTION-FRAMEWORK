package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class StackSim {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.push("A"); s.push("B");
        System.out.println(s.pop());
    }
}