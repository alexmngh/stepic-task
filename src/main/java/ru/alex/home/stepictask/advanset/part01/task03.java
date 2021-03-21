package ru.alex.home.stepictask.advanset.part01;

import java.util.Scanner;

/**
 * Улитка ползет вверх по вертикальному столбу высотой H футов. За день он поднимается на A
 * фут, а за ночь опускается на B. В какой день улитка достигнет вершины шеста?
 * Формат входных данных H, A, B
 * На вход программа получает неотрицательные целые числа H, A, B, где H > B и A > B. Каждое
 * целое число не превышает 100.
 */
public class task03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();
    int speedSnail  = scanner.nextInt();
    int reverseSnail = scanner.nextInt();

    int countDay = 1;
    int curHeight = speedSnail;

    while (curHeight < height) {
      curHeight -= reverseSnail;
      curHeight += speedSnail;
      countDay++;
    }
    System.out.println(countDay);
  }

}
