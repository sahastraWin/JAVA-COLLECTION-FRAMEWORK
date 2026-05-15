package collectionFramework.comparator;

import java.util.*;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

}

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sahastrajeet Hardaha", 9.2));
        studentList.add(new Student("Jeet Hardaha", 9.1));
        studentList.add(new Student("Vedraj Hardaha", 9.4));

        //studentList.sort(null);//error
        /*
        The error occurs because the sort(null) line in your code attempts to sort the studentList using the null comparator, but the Student class
        does not implement the Comparable interface or provide a Comparator. When calling sort(null) on a list, Java expects the elements of the list
        to be comparable. Without a specified comparator, the sorting method relies on the natural ordering of elements as defined by the Comparable interface.
        Since your Student class does not implement Comparable, the sort method cannot determine how to order the elements, resulting in an error.
         */
        /*
        //SORTING USING LAMBDA EXPRESSION:
        studentList.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());//lexicographically
            }
            //will print the list of students according to descending order of there GPA since 02-01 gives negative value
        });
       */

        //USING METHOD REFERENCE:
        //Comparator<Student> comparing = Comparator.comparing(Student::getGpa);//will print in ascending order
        //Comparator<Student> comparing1 = Comparator.comparing(Student::getGpa).reversed();//will print in descending order
        Comparator<Student> comparing2 = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);//will compare gpa then name
        studentList.sort(comparing2);
        for (Student s : studentList) {
            System.out.println(s.getName() + " " + s.getGpa());
        }
    }
}