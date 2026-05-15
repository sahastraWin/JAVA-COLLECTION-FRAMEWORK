package collectionFramework.Problems.queue;

import java.util.concurrent.*;
public class ProdCons {
    public static void main(String[] args) { BlockingQueue<Integer> q=new ArrayBlockingQueue<>(10); new Thread(()->{try{q.put(1);}catch(Exception e){}}).start(); new Thread(()->{try{q.take();}catch(Exception e){}}).start(); }
}