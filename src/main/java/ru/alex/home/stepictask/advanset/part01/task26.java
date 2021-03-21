package ru.alex.home.stepictask.advanset.part01;

import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;

/**
 * You are given coordinates of two queens on a chess board. Find out, whether they hit each other or not.
 * INPUT
 * Four integer numbers x_1, y_1, x_2, y_2x
 *   are being typed.
 * OUTPUT
 * Type "YES" (uppercase) if they hit each other or "NO" if the don't.
 * You may need the function, that calculates the absolute magnitude of the number, here it is:
 * a = abs(a)
 */
@Slf4j
public class task26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sLine[] = scanner.nextLine().split(" ");

    scanner.close();
    int x1 = Integer.parseInt(sLine[0]);
    int y1 = Integer.parseInt(sLine[1]);
    int x2 = Integer.parseInt(sLine[2]);
    int y2 = Integer.parseInt(sLine[3]);
    String sOut = "NO";
    if ((x1 == x2) || (y1 == y2) || (Math.abs(x1 - x2) == Math.abs(y1 - y2))) {
      sOut = "YES";
    }
    System.out.println(sOut);

  }
}
