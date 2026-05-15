package collectionFramework.Problems.hashMap;

import java.util.HashMap;
class Item implements Cloneable { String n; Item(String n){this.n=n;} public Object clone() throws CloneNotSupportedException{return new Item(n);} }
public class DeepClone {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Item> m = new HashMap<>(); m.put(1, new Item("A"));
        HashMap<Integer, Item> c = new HashMap<>();
        for(var e:m.entrySet()) c.put(e.getKey(), (Item)e.getValue().clone());
    }
}