package collectionFramework.Problems.arrayList;

import java.util.*; import java.io.*;
public class SerializeAL {
    public static void main(String[] args) throws Exception {
        ArrayList<String> l = new ArrayList<>(Arrays.asList("A"));
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("l.ser"));
        o.writeObject(l); o.close();
        System.out.println("Serialized");
    }
}