package javaprograms;
/*Write a java program to input any number and find out if it’s odd or even

 */

import java.util.Scanner;

public class OddEven {


    public static void main(String[] args) {
        OddEven t1 = new OddEven(); // calling in main method
        t1.method();

    }


    public void method() {
        // create a scanner
        Scanner t1= new Scanner(System.in);
        // input a value
        System.out.println("Enter a Number:");
        int number=t1.nextInt();

        System.out.println("Enter a odd Number;");
        int number2 = t1.nextInt();

        System.out.println("Ener a Even Number:");
        int number3 = t1.nextInt();

        //Check if the number is even or odd using the modulus operator

        if (number % 2 ==0) {
            System.out.println("Is an Even number?:" + number);
        }else {
            System.out.println("Is an Odd Number?:" + number3);

            // close the scanner
            t1.close();
        }


    }
}