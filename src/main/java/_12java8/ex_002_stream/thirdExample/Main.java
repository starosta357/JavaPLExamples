package _12java8.ex_002_stream.thirdExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> collect = Arrays.asList(10, -20, 30, 40, 30)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        Stream<Integer> stream = Stream.of(10, 20, 30);

        String[] arr = {"Nikita", "Karyna", "Ivan"};

        Stream<String> stream1 = Arrays.stream(arr);

        Stream<Object> build = Stream.builder()
                .add(10)
                .add(20)
                .add(30)
                .build();

        IntStream chars = "Hello".chars();
    }
}
