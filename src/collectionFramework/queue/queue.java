package collectionFramework.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class queue {
    public static void main(String[] args) {
        //LinkedList as queue:
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(3);//enqueue
        list.addLast(5);//enqueue
        list.addLast(6);//enqueue
        Integer i = list.removeFirst();//dequeue
        System.out.println(list);
        System.out.println(list.getFirst());//peek

        //Queue Interface
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(3);//enqueue
        queue1.add(5);//enqueue
        queue1.add(6);//enqueue
        Integer i1 = queue1.remove();//dequeue
        System.out.println(queue1);
        System.out.println(queue1.peek());//peek

        System.out.println(queue1.remove(1)); // throws exception if empty
        System.out.println(queue1.poll());

        System.out.println(queue1.element());  // throws exception if empty
        System.out.println(queue1.peek());

        //ArrayBlockingQueue:
        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1));//true
        System.out.println(queue2.add(2));//true

        //System.out.println(queue2.add(2)); throws exception
        System.out.println(queue2.offer(3));//false


    }
}
