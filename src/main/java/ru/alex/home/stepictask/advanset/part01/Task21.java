package ru.alex.home.stepictask.advanset.part01;

import java.util.Scanner;

public class Task21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String form = scanner.nextLine();
    double floorage = 0.0;
    int size_1;
    int size_2;
    int size_3;
    switch (form) {
      case "triangle":
        size_1 = scanner.nextInt();
        size_2 = scanner.nextInt();
        size_3 = scanner.nextInt();
        double perimetr = (size_1 + size_2 + size_3) /2.0;
        floorage =
            Math.sqrt(perimetr * (perimetr - size_1) * (perimetr - size_2) * (perimetr - size_3));
        break;
      case "rectangle":
        size_1 = scanner.nextInt();
        size_2 = scanner.nextInt();
        floorage = size_1 * size_2;
        break;
      case "circle":
        size_1 = scanner.nextInt();
        floorage = size_1 * size_1 * 3.14;
        break;
    }
    System.out.println(floorage);
  }

}
