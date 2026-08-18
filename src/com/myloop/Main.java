/**
 *  Java program to exit a loop.
 */
package com.myloop;

import java.util.Scanner;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Asking user for exit.
        while (true) {
            System.out.println("Exit? (y exits)");
            String input = scanner.nextLine();
            if(input.equals("y")) {
                break;
            }

            System.out.println("Ok! let's carry on!");
        }

        // After exit of the loop.
        System.out.println("Ready!");

    }
}