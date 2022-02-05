package ru.alex.home.stepictask.advanset.part01;

import java.util.Scanner;

/**
 * A detector compares the size of parts produced by a machine with the reference standard.
 * If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
 * If the size of the part is smaller, it is removed as reject, and the detector prints the number -1.
 * If the part was made perfect, it is sent to the box with ready products, and the detector prints 0.
 * Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
 * The program should output numbers in a single line – the number of ready parts,
 * the number of parts to be fixed, and the number of rejects.
 */
public class task43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int perfect = 0;
        int larger = 0;
        int smaller = 0;
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        for (int value: array) {
            switch (value){
                case 0:
                    perfect++;
                    break;
                case 1:
                    larger++;
                    break;
                case -1:
                    smaller++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}
