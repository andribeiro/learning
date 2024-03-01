package pt.ajgr;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 6, 20, 17};

        int max = IntStream.of(numbers)
//                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();

        System.out.println(max);

        List<String> fruits = Arrays.asList("cherry", "apple", "banana");
        System.out.println(String.join("", fruits));


        System.out.println(fruits.stream().map(String::toUpperCase).sorted().toList());


        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        double asDouble = doubles.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println(asDouble);

        System.out.println("max: " +
                fruits.stream().mapToInt(String::length).max().orElse(0));

        System.out.println("Second smallest element: " +
                Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().orElse(0));


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 1};
        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);


        System.out.println();
        System.out.println("INTs");
        List<Integer> ints = Stream.of(1, 4, 3, 2, 5, 6)
                .filter(n -> n <= 5)
                .toList();  // new, instead of the verbose .collect(Collectors.toList())
        ints.forEach(System.out::println);
    }

//    public static void main(String[] args) {
//        // Example 1: takeWhile
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> lessThanFive = numbers.stream()
//                .takeWhile(n -> n < 5)
//                .collect(Collectors.toList());
//
//        System.out.println("Numbers less than 5: " + lessThanFive);
//
//        // Example 2: dropWhile
//        List<Integer> greaterThanThree = numbers.stream()
//                .dropWhile(n -> n <= 3)
//                .collect(Collectors.toList());
//
//        System.out.println("Numbers greater than 3: " + greaterThanThree);
//
//        // Example 3: ofNullable
//
//        // Example 3: ofNullable
//        String value1 = "Hello";
//        String value2 = null;
//
//        // Example with a non-null value
//        Stream.ofNullable(value1)
//                .ifPresentOrElse(v -> System.out.println("ofNullable Example - Non-null value: " + v),
//                        () -> System.out.println("ofNullable Example - Null value"));
//
//        // Example with a null value
//        Stream.ofNullable(value2)
//                .ifPresentOrElse(v -> System.out.println("ofNullable Example - Non-null value: " + v),
//                        () -> System.out.println("ofNullable Example - Null value"));
//
//        //Example of null safe stream
//        List<String> names = Arrays.asList("Alice", "Bob", null, "Charlie", null, "David");
//        List<String> nonNullNames = names.stream()
//                .flatMap(name -> Streams.nullSafeStream(name))
//                .collect(Collectors.toList());
//
//        System.out.println("Non-null names: " + nonNullNames);
//    }
//
//    // Helper method to create a stream from a potentially null value
//    private static <T> java.util.stream.Stream<T> nullSafeStream(T value) {
//        return value == null ? java.util.stream.Stream.empty() : java.util.stream.Stream.of(value);
//    }
}
