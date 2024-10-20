package javaprograms;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)

 */


public class OddEvenChecker {

    public static void main(String[] args) {
        OddEvenChecker scanner = new OddEvenChecker();
        scanner.method();

    }

    public void method() {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // enter a data
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(" Enter a second number");
        int number2 = scanner.nextInt();

        String result = (number % 2 == 0) ? "The number is even." : "The number is odd."; // concetination
        String result1 = (number % 5 == 0) ? "The number is even." : "The number is odd.";

        System.out.println(result);
        // scanner close
        scanner.close();
    }

}










