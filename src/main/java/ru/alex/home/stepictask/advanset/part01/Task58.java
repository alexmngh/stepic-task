package ru.alex.home.stepictask.advanset.part01;

import java.util.Scanner;

public class Task58 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sLine = scanner.nextLine();
    StringBuilder sb = new StringBuilder(sLine);
    String rLine = sb.reverse().toString();
    if (sLine.equals(rLine)) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
