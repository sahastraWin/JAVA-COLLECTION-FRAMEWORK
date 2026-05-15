package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
class Event implements Comparable<Event> { int time; String desc; Event(int t, String d) { time = t; desc = d; } public int compareTo(Event e) { return this.time - e.time; } public String toString() { return time + ":" + desc; } }
public class Timeline {
    public static void main(String[] args) {
        TreeSet<Event> e = new TreeSet<>(); e.add(new Event(1000, "Start")); e.add(new Event(0, "Wake")); System.out.println(e);
    }
}