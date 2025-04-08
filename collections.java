// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Map;
// import java.util.PriorityQueue;

import java.util.*;

public class collections {
    public static void main(String[] args) {
        // ArrayList - Dynamic array
        System.out.println("ArrayList Example:- ");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple"); // allows duplicates
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // HashSet - No duplicates, unordered
        System.out.println("\nHashSet Example:- ");
        HashSet<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("India"); // duplicate, won't be added
        for (String country : countries) {
            System.out.println(country);
        }

        // HashMap - Key-Value pair
        System.out.println("\nHashMap Example:- ");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(102, "David"); // Overwrites Bob
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        // ArrayDeque - Double-ended queue (fast insert/remove at both ends)
        System.out.println("\nArrayDeque Example:- ");
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");
        deque.add("Middle");
        System.out.println("Deque: " + deque);
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        // PriorityQueue - Min-heap (by default), smallest comes first
        System.out.println("\nPriorityQueue Example:- ");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        while (!pq.isEmpty()) {
            System.out.println("Polled: " + pq.poll());
        }
    }
}
