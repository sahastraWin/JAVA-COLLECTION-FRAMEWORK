package collectionFramework.Problems.treeSet;

import java.util.*; import java.io.*;
public class SerializeTreeSet {
    public static void main(String[] args) throws Exception {
        TreeSet<String> ts = new TreeSet<>(); ts.add("SaveMe");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ts.ser")); out.writeObject(ts); out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("ts.ser")); System.out.println(in.readObject()); in.close();
    }
}