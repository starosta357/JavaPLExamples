package _9collection.ex_002_iterator.iteratorWithObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Sphynx", 5000));
        animals.add(new Animal("Malamute", 4000));

        Iterator<Animal> carIterator = animals.iterator();

        // One more time: we can change field of the object in loops,
        // BUT we can not change the object.
        while (carIterator.hasNext()) {
            Animal tmp = carIterator.next();
            tmp.price += 1000;
        }
        System.out.println(animals);
    }
}

class Animal {
    String breed;
    int price;

    Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " = " + price;
    }
}
