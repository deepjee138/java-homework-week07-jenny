package javaprograms;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class SpecificValue {



    public static void main(String[] args) {
    SpecificValue obj = new SpecificValue();
    obj.method();
    }
    public void method(){
        // intiger
        int[] array = {10, 20, 30, 40, 50};

        // Create a Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the value to search for
        System.out.print("Enter a value to check if it's in the array: ");
        int valueToFind = scanner.nextInt();

        // Variable to track if the value is found
        boolean found = false;

        // Loop through the array to check for the value
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToFind) {
                found = true; // Value found
                break; // Exit the loop early
            }
        }

        // Output the result
        if (found) {
            System.out.println("The array contains the value: " + valueToFind);
        } else {
            System.out.println("The array does not contain the value: " + valueToFind);
        }

        // Close the scanner
        scanner.close();
    }
}





