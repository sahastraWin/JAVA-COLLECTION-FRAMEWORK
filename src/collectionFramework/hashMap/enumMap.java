package collectionFramework.hashMap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class enumMap {
    public static void main(String[] args) {
        //array size is same as enum
        //no hashing
        //faster than hashMap
        //memory efficient
        //ordinal/index is used
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.WEDNESDAY, "Walk");
        System.out.println(Day.TUESDAY.ordinal());//indexing
        System.out.println(map);//order is maintained as defined in the enum
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, RIDAY, SATURDAY, SUNDAY
}