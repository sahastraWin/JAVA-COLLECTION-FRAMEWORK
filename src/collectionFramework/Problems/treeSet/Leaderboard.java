package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
class Player implements Comparable<Player> { String name; int score; Player(String n, int s) { name = n; score = s; } public int compareTo(Player p) { return p.score != this.score ? p.score - this.score : this.name.compareTo(p.name); } public String toString() { return name + ":" + score; } }
public class Leaderboard {
    public static void main(String[] args) {
        TreeSet<Player> lb = new TreeSet<>(); lb.add(new Player("Alice", 100)); lb.add(new Player("Bob", 150));
        System.out.println("Top 1: " + lb.first());
    }
}