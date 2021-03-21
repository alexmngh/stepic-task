package ru.alex.home.stepictask.advanset.part03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Write a lambda expression that accepts a list of strings and returns new list of distinct
 * strings (without repeating). The order of elements in the result list may be any (elements
 * will be sorted by the testing system).
 * If the input list doesn't contain any strings then the result list should be empty.
 * Hints: it is possible to use sets, maps, lists and so on for helping.
 * Solution format. Submit your lambda expression in any valid format with ; on the end.
 * Examples: x -> x; (x) -> { return x; };
 */
public class task39 {
  public static void main(String[] args) {

    // Мой ответ
    /*
    list -> {
      Set<String> hashSet = new HashSet<>();
      List<String> stringList = new ArrayList<>();
      hashSet.addAll(list);
      stringList.addAll(hashSet);
      return stringList;
    };

    // Лучший ответ
    (list) -> new ArrayList(new HashSet(list));

     */

  }

}
