package _9collection.ex_002_iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//before the Java 1.5 foreach you must write in this way:
public class Main {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(5);
        al.add(8);
        System.out.println(al);

        // using an iterator, we can run through our list
        Iterator<Integer> iterator = al.iterator();

        // ask if there is the next item in the list,
        // if true, when body of while loop will be executed
        while (iterator.hasNext()) {
            // go to the next item in the list and display it
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }

        // the same action, but through an optimized ListIterator interface
        ListIterator<Integer> listIterator = al.listIterator();

        while (listIterator.hasNext()) {
            Integer tmp = listIterator.next();
            System.out.println(tmp);
        }

        for (Integer i: al) {
            System.out.println(i);
        }
    }
}
