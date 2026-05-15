package collectionFramework.Problems.hashSet;

import java.util.LinkedList;
class MyHashSet {
    LinkedList<Integer>[] b = new LinkedList[100];
    public void add(int k) { int i=k%100; if(b[i]==null) b[i]=new LinkedList<>(); if(!b[i].contains(k)) b[i].add(k); }
}