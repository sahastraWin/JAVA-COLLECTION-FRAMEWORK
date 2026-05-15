package collectionFramework.hashMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class concurrentSkipListMap {
    public static void main(String[] args) {
        //skipList : probabilistic data structure that allows for efficient search , insertion and deletion operations
        //it is similar to sorted linkedList but with multiple layers that " skip " over portions of the list to provide faster access to elements.
        //(Thread safe and TreeMap)
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();

    }
}
