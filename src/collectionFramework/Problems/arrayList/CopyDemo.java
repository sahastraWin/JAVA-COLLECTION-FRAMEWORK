package collectionFramework.Problems.arrayList;

import java.util.*;
class Item implements Cloneable { String n; Item(String n){this.n=n;} public Object clone() throws CloneNotSupportedException{return new Item(n);} public String toString(){return n;} }
public class CopyDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<Item> l = new ArrayList<>(); l.add(new Item("A"));
        ArrayList<Item> deep = new ArrayList<>();
        for(Item i:l) deep.add((Item)i.clone());
        l.get(0).n = "B";
        System.out.println(l + " " + deep);
    }
}