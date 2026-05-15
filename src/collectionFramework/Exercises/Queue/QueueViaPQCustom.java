package collectionFramework.Exercises.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// Custom class to demonstrate object sorting
class Job {
    String name;
    int priorityLevel; // 1 = High, 10 = Low

    public Job(String name, int priorityLevel) {
        this.name = name;
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return name + "(Priority: " + priorityLevel + ")";
    }
}

public class QueueViaPQCustom {
    public static void main(String[] args) {
        /*
         * Logic:
         * Here we implement a "Priority Job Scheduler".
         * The Queue is backed by a PriorityQueue with a comparator that sorts jobs
         * based on their 'priorityLevel'. Lower number = Higher importance.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue with a custom struct comparator:
         * Time Complexity: O(log N) for insertions and deletions.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */

        // Comparator: Ascending order of priorityLevel (1 comes before 10)
        Comparator<Job> jobComparator = Comparator.comparingInt(j -> j.priorityLevel);

        Queue<Job> jobQueue = new PriorityQueue<>(jobComparator);

        jobQueue.offer(new Job("Email Sync", 5));
        jobQueue.offer(new Job("Database Backup", 1)); // Highest Priority
        jobQueue.offer(new Job("UI Update", 3));

        System.out.println("Job Processing Order:");
        while (!jobQueue.isEmpty()) {
            System.out.println(jobQueue.poll());
        }
    }
}