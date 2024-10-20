package javaprograms;

import java.util.Scanner;

/**. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 “ZERO”
 *
 */

public class CheckNumber {


    public static void main(String[] args) {
        CheckNumber obj= new CheckNumber();
        obj.method();

    }
    public void method(){
        // scanner
        Scanner o2 = new Scanner(System.in);

        // Enter a number
        System.out.println(" Enter a number:");
        int number=o2.nextInt();

        // check number positive/negative/zero
        if ( number > 0 ) {
            System.out.println("is numbet is positive:"+ number);
        }else if (number < 0) {
            System.out.println("Is number is negetive:" + number);
        }else {
            System.out.println("This number is zero");

            // scanner close
            o2.close();
        }
    }
}