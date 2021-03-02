package _9collection.ex_001_foreach._2foreach;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sphynx", 4000);
        Animal dog = new Animal("Malamute", 3000);
        Animal bird = new Animal("Crow", 2000);

        Animal[] c = {cat, dog, bird};

        for (Animal tmp : c) {
            // It is possible to change object fields
            tmp.price = tmp.price + 1000;

            // Can't change objects in an array if you using iterator
//            tmp = new Animal("Lion", 200000);
        }

        for (Animal tmp : c) {
            System.out.println(tmp.breed + " " + tmp.price);
        }
    }
}
