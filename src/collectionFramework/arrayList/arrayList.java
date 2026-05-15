package collectionFramework.arrayList;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(-1);


      /*
        CREATING AN ARRAYLIST:

        //by default capacity is 10, the capacity refers to the size of the internal array that can hold elements before needing to resize.

        //using default constructor , creates an empty ArrayList with an initial capacity of 10:
        ArrayList<String> list = new ArrayList<>();

        //creating an ArrayList with a specified initial capacity:
        ArrayList<String> list = new ArrayList<>(20);

        //creating an ArrayList from another collection:
        ArrayList<String> list = new ArrayList<>();

        //by changing the reference:
        List<String> list = new ArrayList<>();

        //adding integers in collectionExercises.arrayList.
        list.add(1);//0
        list.add(5);//1
        list.add(80);//2

        ACCESSING THE VALUE AT A SPECIFIC INDEX:
        System.out.println(list.get(2));//will print 3;

        SIZE OF THE ARRAYLIST:
        System.out.println(list.size());

        ITERATION IN ARRAYLIST:
        1.using for loop:
        for (int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        2.using for each loop:
        for (int x : list)
        {
            System.out.println(x);
        }

        CHECKING EXISTENCE:
        System.out.println(list.contains(5));
        System.out.println(list.contains(57));

        REMOVING ELEMENTS:
        list.remove(2);

        DIFFERENCE BETWEEN ADD AND SET ;
        list.add(2,55);//the element at 2nd index will be shifted to 3rd index and 55 will be inserted at the respective 2nd position.
        list.set(1,23);//replaces the value at 1st index.

        ASLIST METHOD:
                //in this method size is fixed
        List<String> list1 = Arrays.asList("Monday", "Tuesday");//we cannot write Arraylist<> lis1 = new ArrayList<>; because it is returning parent and writing child is wrong
        System.out.println(list1.getClass().getName());
        //we cannot add or remove elements and can only replace elements.
        list1.set(1,"DryDay");

        //if we want to add new elements in the asList(i.e list1) we have to create new ArrayList.
        List<String> list4 = new ArrayList<>(list1);
        list4.add("Sunday");
        System.out.println(list4);

        String[] arr = {"Apples", "Oranges", "Mangoes"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list1.getClass().getName());
        //we cannot add or remove elements and can only replace elements.

        List<Integer> list3 = List.of(1, 2, 3);
        //no modification allowed , immutable objects.

        ADD ALL METHOD:
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list1 = List.of(5, 6, 7, 8, 9, 10);
        list.addAll(list1);
        System.out.println(list);

        REMOVE:
        List<Integer> list = new ArrayList<>();//after java7 we can omit the type ArrayList<>
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(1);//2 will be removed
        list.remove(Integer.valueOf(2));//2 is an object and its first occurrence will be removed.
        System.out.println(list);


        CONVERTING STRING TO ARRAY
        List<String> list = new ArrayList<>();//after java7 we can omit the type ArrayList<>
        list.add("Sahastrajeet");
        list.add("Jeet");
        list.add("Aman");

        Object[] array = list.toArray();
        String[] array1 = list.toArray(new String[0]);
        System.out.println(list);
       */

    }
}
