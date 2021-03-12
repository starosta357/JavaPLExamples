package _12java8.ex_002_stream.secondExample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Nikita", 30));
        persons.add(new Person("Anna", 14));
        persons.add(new Person("Alex", 25));
        persons.add(new Person("Olena", 8));
        persons.add(new Person("Marvel", 23));

        int sum = 0;
        int adultPersons = 0;

        for (Person p : persons) {
            if (p.getAge() >= 18) {
                sum += p.getAge();
                adultPersons++;
            }
        }

        double averageAge = (double) sum / adultPersons;

        System.out.println(averageAge);

        // ================================

        double average2 = persons.stream()
                                 .filter(p -> p.getAge() >= 18)
                                 .mapToInt(p -> p.getAge())
                                 .average().getAsDouble();

        System.out.println(average2);

        // ================================

//        persons.stream()
//               .filter(p -> p.getAge() >= 18)
//               .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
//               .map(person -> person.getName())
//               .forEach(
//                      (String name) -> System.out.println(name)
//                      System.out::println
//               );

//        for (Person p : persons)
//            System.out.println(p);

//        persons.stream().forEach(
//                (Person p) -> {
//                    System.out.println(p);
//                }
//        );
    }
}
