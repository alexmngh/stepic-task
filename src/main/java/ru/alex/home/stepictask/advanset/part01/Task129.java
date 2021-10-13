package ru.alex.home.stepictask.advanset.part01;

import java.util.Scanner;

public class Task129 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] array = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        array[i][j] = scanner.nextInt();
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = n - 1; j >= 0; j--) {
        System.out.print(array[j][i]);
        if (j > 0)
          System.out.print(" ");
      }
      System.out.println("");
    }
  }
}
