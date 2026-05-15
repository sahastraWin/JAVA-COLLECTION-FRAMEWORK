package collectionFramework.hashMap;

import java.util.*;

public class identityHashMap {
    public static void main(String[] args) {

        //in object class hashCode deals with memory addressl
        String key1 = new String("key");//String class has its own hashCodes , hashCode will be different because new keyword is used
        String key2 = new String("key");//String class has its own hashCode  , hashCode will be different   because new keyword is used

        //Map<String, Integer> map = new HashMap<>();

        Map<String, Integer> map = new IdentityHashMap<>();

        //identityHashMap deals with the hashCode of object only i.e plays with memory address
        //identityHashCode and == operator for checking refernce

        map.put(key1, 1);//key , 1
        map.put(key2, 2);//key , 2
        System.out.println(key1.equals(key2));//true and replaces the key 1 with key 2
        System.out.println(map);

        System.out.println(System.identityHashCode(key1));//hashCode will be different because it plays with memory address
        System.out.println(System.identityHashCode(key2));//hashCode will be different because it plays with memory address

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());


    }
}
