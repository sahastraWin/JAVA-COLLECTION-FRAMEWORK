package collectionFramework.Problems.linkedList;

import java.util.LinkedList;
public class OfferOps {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.offer("End"); list.offerFirst("Start");
        System.out.println(list);
    }
}