package _12java8.ex_002_stream.firstExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Nikita", 30));
        persons.add(new Person("Anna", 14));
        persons.add(new Person("Alex", 28));
        persons.add(new Person("Olena", 8));
        persons.add(new Person("Marvel", 25));

        persons.stream()
               .filter(p -> p.getAge() >= 18)
//             .sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
               .sorted(Comparator.comparing(Person::getName))
//               .map(person -> person.getName())
               .map(Person::getName)
               .forEach(
//                    (String name) -> System.out.println(name)
                       System.out::println
               );

//        for (Person p : persons) {
//            System.out.println(p);
//        }

//        persons.stream().forEach(
//                (Person p) -> {
//                    System.out.println(p);
//                }
//        );
    }
}
