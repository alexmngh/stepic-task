package ru.alex.home.stepictask.advanset.part01;

import java.util.Scanner;

/**
 * Squirrels and nuts - 1
 * N squirrels found Nuts and decided to divide them equally. Determine how many nuts each squirrel will get.
 * Input data format
 * There are two positive numbers N and K, each of them is not greater than 10000.
 */
public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts  = scanner.nextInt();
        int count = nuts / squirrels;
        System.out.println(count);

    }
}
