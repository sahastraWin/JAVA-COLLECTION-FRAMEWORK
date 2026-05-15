package collectionFramework.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        Integer removed = s.pop();//removing top most element i.e 5
        System.out.println(s);
        Integer peeks = s.peek();
        System.out.println(peeks);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        int searches = s.search(3);//it has 1 based indexing
        System.out.println(searches);

        //LinkedList as STACK ? :
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.getLast();//peek
        list.remove();//pop
        list.indexOf(3);

        //ArrayList as STACK ? :

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);//push
        a.add(2);//push
        a.add(3);//push
        a.add(4);//push
        a.get(a.size() - 1);//peek
        a.remove(a.size() - 1);//pop

        //ArrayList and LinkedList aren't thread safe whereas Vector and Stack are thread safe
    }
}
