package ru.alex.home.stepictask.advanset.part03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a collector that evaluates the product of squares of integer numbers in a Stream<Integer>.
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an argument to the collect() method of a stream as shown below.
 * Квадрат перемножения всех чисел.
 * Используется Stream API
 */
public class task56 {

  public static void main(String[] args) {
    // Мое Решение
//    Collectors.reducing(1, x-> x * x, (a, b) -> a * b)


    Stream<Integer> s = Stream.of(5, 10, 20, 50);
    Integer i = s.collect(Collectors.reducing(1, (integer, integer2)
        -> integer2 * integer));
    System.out.println(i);


    List<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(3);

    Integer i2 = numbers.stream().collect(Collectors.reducing(1, (integer, integer2)
        -> integer2 * integer));
    System.out.println(i);

    int value1 = Stream.of(2, 3)
        .collect(Collectors.reducing(
            0, x-> x * x, (a, b) -> a + b
        ));
    System.out.println("value 1 = " + value1);


    int value2 = Stream.of(2, 3)
        .collect(Collectors.reducing(
            1, x-> x * x, (a, b) -> a * b
        ));
    System.out.println("value 2 = " + value2);

  }
}
