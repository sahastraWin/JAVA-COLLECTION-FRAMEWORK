package collectionFramework.java8;

public class lamdaExpression {
    public static void main(String[] args) {
        //java-8 --> minimal code , functional programming features
        //java-8 --> lamda Expression ,Streams, Date and Time API
        //Streams : method reference , constructor reference
        //lamda expression : It is an anonymous function (no name , no return type , no access modifier)
        //lamda expression is used to implement functional interfaces (those interfaces which contain only one asbtract method)
        //Thread t1 = new Thread(new Task());
        //Reference of functional interface can hold lambda expression
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });
        MathOperation sumOperation = (a, b) -> a + b;
        int res = sumOperation.operate(1, 2);
        System.out.println(res);
        //Functional Interface can hold lamda expression
    }
}
/*
Note : without lambda expression we had to use different classes for each operation
class SumOperation implements MathOperation{
    @Override
    public int operate(int a, int b) {
        return 0;
    }
}
*/
interface MathOperation {
    int operate(int a, int b);
}