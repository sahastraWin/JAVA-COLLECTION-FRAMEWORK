package collectionFramework.Problems.arrayList;

import java.util.*;
class Student { String n; int a; Student(String n, int a){this.n=n;this.a=a;} public String toString(){return n+a;} }
public class CustomSort {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>(Arrays.asList(new Student("B", 2), new Student("A", 1)));
        s.sort(Comparator.comparing((Student st)->st.n).thenComparingInt(st->st.a));
        System.out.println(s);
    }
}