package collectionFramework.GC;

import java.lang.ref.WeakReference;

public class garbageCollection {
    public static void main(String[] args) {

        /*
        Phone phone = new Phone("Apple", "16 PRO MAX"); Strong reference
        System.out.println(phone);
        phone = null;
        System.out.println(phone);
         */

        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "16 pro ma x"));
        System.out.println(phoneWeakReference.get());
        System.gc();//suggesting JVM to destroy the weak reference
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {
        }
        System.out.println(phoneWeakReference.get());
    }
}

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}