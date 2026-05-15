package collectionFramework.Problems.treeSet;

import java.util.*;
class Student { String name; int marks; Student(String n, int m) { name = n; marks = m; } public String toString() { return name + ":" + marks; } }
public class CustomSort {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(Comparator.comparingInt((Student s) -> s.marks).thenComparing(s -> s.name));
        ts.add(new Student("A", 80)); ts.add(new Student("B", 80)); ts.add(new Student("C", 90));
        System.out.println(ts);
    }
}