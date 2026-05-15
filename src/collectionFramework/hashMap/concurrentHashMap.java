package collectionFramework.hashMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<>();
        //in concurrent hashmap incremental resizing happens
        //java-7 ---> segment based mapping (by default) 16 segments --> smaller hashmaps
        //only the segment being written to or read from is locked
        //read  : do no require locking unless there is a writing operation happening on the same segment
        //write : locks the segment
        //java-8 --> no segmentation
        //       --> compare and swap approach --> no locking except resizing or collision
        //MAP --> SORTED AND THREAD SAFE : ConcurrentSkipListMap
    }
}
