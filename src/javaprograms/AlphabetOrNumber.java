package javaprograms;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class AlphabetOrNumber {

    public static void main(String[] args) {
        AlphabetOrNumber new1 = new AlphabetOrNumber();
        new1.r1();






    }
    public void r1 (){

        // create a scanner
        Scanner obj = new Scanner(System.in);

        // ask user to enter alphabetic number
        System.out.println("Enter a charactor:");
        char input = obj.next().charAt(0);


        // Check if the character is an alphabet
        if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) {
            System.out.println(input + " is an alphabet.");
        }
        // Check if the character is a digit
        else if (input >= '0' && input <= '9') {
            System.out.println(input + " is a number.");
        }
        // If it's not an alphabet or a number, it must be a symbol
        else {
            System.out.println(input + " is a symbol.");
        }

        // Close the scanner
        obj.close();
    }
}



