package javaprograms;

import java.util.Scanner;

/**
 * . Same as above program-8 using switch statement.
 */

public class Programme8 {

    public static void main(String[] args) {
        Programme8 obj= new Programme8(); // callin into main mathod
        obj.d1();


    }

    public void d1() {

        //scanner create
        Scanner m1 = new Scanner(System.in);
        {

        }
        // input alphabet
        System.out.println("Enter alphabet A to Z:");
        char alphabet = m1.next().toUpperCase().charAt(0);
        // Convert input to uppercase

        // Check the input alphabet and Switch corresponding city name
        switch (alphabet) {
            case 'A':
                System.out.println("A -> Ahemdavad");
                break;
            case 'B':
                System.out.println("B -> Bristol");
                break;
            case 'C':
                System.out.println("C -> Chicago");
                break;
            case 'D':
                System.out.println("D -> Dubai");
                break;
            case 'E':
                System.out.println("E -> Edinburgh");
                break;
            case 'F':
                System.out.println("F -> Florida");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }

        // Close the scanner
        m1.close();
    }
}
