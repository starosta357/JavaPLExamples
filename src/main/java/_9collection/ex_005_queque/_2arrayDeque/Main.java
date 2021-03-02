package _9collection.ex_005_queque._2arrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // Deque - extends Queue and work as bidirectional queue, and can implement
        // LIFO - Last in First out principle.

        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("Ukraine");
        states.add("Poland");

        // add element to the beginning
        states.push("UK");

        // Get the first item without deleting
        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null) {
            // Checkout from the beginning
            System.out.println(states.pop());
        }
        System.out.println("Queue size: " + states.size());

        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}

class Person {
    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }
}

