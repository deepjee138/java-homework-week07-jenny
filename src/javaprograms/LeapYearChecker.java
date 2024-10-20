package javaprograms;

import java.util.Scanner;

/**2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 not?
 *
 */

public class LeapYearChecker {

    public static void main(String[] args) {
        LeapYearChecker obj = new LeapYearChecker();
        obj.m1();

    }

    public void m1(){


        // scanner
        Scanner obj = new Scanner(System.in);
        // Enter a value
        System.out.println( "Enter a year (ex.2007 ):");
        int year = obj.nextInt();

        boolean isLeapYear= ( year % 4 == 0 && year % 100 != 0) || ((year % 400 == 0));

        // if else
        if (isLeapYear) {
            System.out.println("Is a leap year"+year);
        }else {
            System.out.println(" Is not leap year"+year);
            // scanner close
            obj.close();

        }
    }




}
