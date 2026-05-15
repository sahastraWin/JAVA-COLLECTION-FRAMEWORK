package collectionFramework.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class methodAndConstructorReference {

    public static void main(String[] args) {
        class MobilePhone {
            String name;

            public MobilePhone(String name) {
                this.name = name;
            }
        }

        // Method reference --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);

        //Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());
        //MobilePhone::new --> refereing to the constructor

    }
}
/*
Aspect	           Method Reference	                                        Constructor Reference
Definition	A reference to an existing method	                A reference to a constructor of a class
Syntax	    ClassName::methodName	                            ClassName::new
Usage	    Used to refer to static or instance methods	        Used to create new instances of a class
Parameters	Accepts parameters based on the method signature	Accepts parameters based on the constructor signature
Return Type	Returns the result of the method call	            Returns a new instance of the class
Common Use  Filtering, mapping, or performing actions on streams without writing lambda expressions	Creating new objects in a functional style, especially with streams or functional interfaces
Cases
Lambda Expression (args) -> ClassName.methodName(args)	            (args) -> new ClassName(args)
Equivalent
 */
