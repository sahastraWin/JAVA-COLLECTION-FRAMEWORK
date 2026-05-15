package collectionFramework.set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class copyOnWriteArraySet {
    public static void main(String[] args) {
        //Thread safe
        //Copy-On-Write elements
        //No Duplicate elements
        //Iterators do not reflect modifications
        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        for (int i = 0; i <= 5; i++) {
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial CopyOnWriteArraySet     : " + copyOnWriteSet);
        System.out.println("Initial ConcurrentSkipListSet : " + concurrentSkipListSet);
        System.out.println("Iterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet) {
            System.out.println("Reading from CopyOnWriteArraySet : " + num);
            //Attempting to modify the set during iteration
            concurrentSkipListSet.add(6);//6 will not be printed
        }

        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet : " + num);
            //Attempting to modify the set during iteration
            if (num == 4) {
                concurrentSkipListSet.add(6);//6 will be printed
            }
        }
        //System.out.println(concurrentlistSet);//this is known as consistency


    }
}
