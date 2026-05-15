package collectionFramework.stack;

import java.util.*;

public class stackMenu {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice, element;
        do {
            System.out.println("*****Stack Menu*****");
            System.out.println("1 Push");
            System.out.println("2 Pop");
            System.out.println("3 Peek");
            System.out.println("4 Empty");
            System.out.println("5 Display");
            System.out.println("6 Exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be pushed : ");
                    element = sc.nextInt();
                    stack.push(element);
                    System.out.println("Elemnent pushed" + element);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        element = stack.pop();
                        System.out.println("Element popped" + element);
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        element = stack.peek();
                        System.out.println("Top Element" + element);
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is not empty");
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        System.out.println("Stack elements are");
                        System.out.println(stack);
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        } while (choice != 5);
    }
}
