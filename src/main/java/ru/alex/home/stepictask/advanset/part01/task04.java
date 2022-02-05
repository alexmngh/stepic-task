package ru.alex.home.stepictask.advanset.part01;

import java.util.Scanner;

/**
 * MKAD
 * The length of the Moscow Ring Road (MKAD) is 109 kilometers. Biker Vasya starts from the zero kilometer of MKAD and drives with a speed of V kilometers per hour. On which mark will he stop after T hours?
 * Input data format
 * The program gets integers V and T as input. If V > 0, then Vasya moves in a positive direction along MKAD, if the value of V < 0 – in the negative direction. 0 ≤ T ≤ 1000, -1000 ≤ V ≤ 1000.
 * Output data format
 * The program should output an integer from 0 to 108 - the mark on which Vasya stops.
 */
public class task04 {
    public static void main(String[] args) {
        final int DIST_RING = 109;
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        int time  = scanner.nextInt();
        int distAll = (speed * time);
        int dist;
        int minus = 0;
        if (speed < 0) {
            minus = DIST_RING;
        }
        if ((speed % DIST_RING) == 0) {
            minus = 0;
        }
        dist = (distAll % DIST_RING) + minus;
        System.out.println(dist);

        // У меня где-то ошибка, вот рабочий код
        Scanner sc = new Scanner(System.in);
        int speedv2 = sc.nextInt();
        int hours = sc.nextInt();
        int distance = speedv2 * hours;
        int length = 109;

        int mark = ((distance % length) + length) % length;
        System.out.println(mark);
    }
}
