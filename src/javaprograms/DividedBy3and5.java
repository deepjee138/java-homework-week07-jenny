package javaprograms;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */


public class DividedBy3and5 {


    public static void main(String[] args) {
        DividedBy3and5 obj = new DividedBy3and5();
        obj.m1();

    }
    public void m1(){

            // Numbers divisible by 3
            System.out.println("Numbers divisible by 3 between 1 and 100:");

            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();  // For new line

            // Numbers divisible by 5
            System.out.println("Numbers divisible by 5 between 1 and 100:");
            for (int i = 1; i <= 100; i++) {

                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }





