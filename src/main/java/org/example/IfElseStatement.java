package org.example;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // If statememt

        System.out.print("Enter two positive numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 < 0 && number2 < 0) {
            System.out.println("Please you must enter positive numbers!");
            System.exit(1);

        } else {
            System.out.println("Next time please enter positive number");

        }
        int answer = number1 + number2;
        System.out.println("The result of " + number1 + "+" + number2 + " is " + answer);

    }
}
