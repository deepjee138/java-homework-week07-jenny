package javaprograms;

import java.util.Scanner;

public class WeekContains {

    public static void main(String[] args) {
        WeekContains m3= new WeekContains();
        m3.m2();

    }
    public void m2(){
         // ctreate scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");
        int day = scanner.nextInt();  // Read the input number

        // Switch case
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}

