package collectionFramework.hashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class tableHash {
    public static void main(String[] args) {
        //Hashtable<Integer, String> hashTable = new Hashtable<>();
        //it is synchronized
        //no null key or value
        //slower than hashmap because it is synchronized
        //Legacy Class , replaced by  concurrent hashMap
        //only linked list is used in case of collison
        //all methods are synchronized

        Hashtable<Integer, String> hashTable = new Hashtable<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashTable.put(i, "Thread 1");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashTable.put(i, "Thread 2");
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final HashTable size : " + hashTable.size());
    }
}
