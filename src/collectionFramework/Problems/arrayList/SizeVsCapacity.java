package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.lang.reflect.Field;
public class SizeVsCapacity {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        System.out.println("Size: " + list.size());
        Field f = ArrayList.class.getDeclaredField("elementData");
        f.setAccessible(true);
        System.out.println("Capacity: " + ((Object[]) f.get(list)).length);
    }
}