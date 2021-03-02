package _9collection.ex_006_set.treeSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(7);
        integerTreeSet.add(2);
        integerTreeSet.add(14);
        NavigableSet<Car> carTreeSet = new TreeSet<>();

        carTreeSet.add(new Car(5000));
        carTreeSet.add(new Car(3000));
        System.out.println(carTreeSet);

        // Create a subcollection headSet,
        // no more than 5, true - inclusive
        NavigableSet<Integer> headSet = integerTreeSet.headSet(5, true);
        System.out.println(headSet);

        headSet.add(3);
        System.out.println(integerTreeSet);
        System.out.println(headSet);

        integerTreeSet.add(8);
        System.out.println(integerTreeSet + "\n" + headSet);

        // In subcollections, you cannot go beyond IllegalArgumentException
//        ts1.add(6);


        // Using the iterator method,
        // we got an instance of the interface iterator
        Iterator<Integer> iterator = integerTreeSet.iterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            // Temp value does not change
            temp++;
//            System.out.println(iterator.next());
        }


        System.out.println(integerTreeSet);
        Iterator<Car> carIterator = carTreeSet.iterator();


        while (carIterator.hasNext()) {
            Car temp = carIterator.next();
            temp.price++;
//            System.out.println(iterator.next());
        }
        System.out.println(carTreeSet);
    }
}

class Car implements Comparable<Car> {
    int price;

    Car(int price) {
        this.price = price;
    }
    
    public String toString() {
        return "" + this.price;
    }

    public int compareTo(Car c) {
        return this.price - c.price;
    }
}
