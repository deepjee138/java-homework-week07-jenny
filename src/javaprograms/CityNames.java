package javaprograms;

import java.util.Scanner;

/**8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 any other alphabet should be invalid entry
 *
 */

public class CityNames {


    public static void main(String[] args) {
        CityNames d1= new CityNames();
        d1.d1();

    }
    public void d1(){


        // scanner create
        Scanner scanner= new Scanner(System.in);

        // input alphabet
        System.out.println("Enter alphabet A to Z:");
        char alphabet = scanner.next().toUpperCase().charAt(0); // Convert input to uppercase

        // Check the input alphabet and print corresponding city name
        if (alphabet == 'A') {
            System.out.println("A -> Ahemdabad");
        } else if (alphabet == 'B') {
            System.out.println("B -> Bristol");
        } else if (alphabet == 'C') {
            System.out.println("C -> Chicago");
        } else if (alphabet == 'D') {
            System.out.println("D -> Dubai");
        } else if (alphabet == 'E') {
            System.out.println("E -> Edinburgh");
        } else if (alphabet == 'F') {
            System.out.println("F -> Fatsar");
        } else {
            System.out.println("Invalid entry");
        }

        // Close the scanner
        scanner.close();
    }
}









