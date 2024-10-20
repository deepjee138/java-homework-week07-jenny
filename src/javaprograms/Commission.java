package javaprograms;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Commission {
    public static void main(String[] args) {
        Commission obj = new Commission();
        obj.method();

    }
    public void method(){

        // create a scanneer
        Scanner obj= new Scanner(System.in);

        // input the sales details
        System.out.println("Enter a sales ID:");
        int salesId= obj.nextInt();

        System.out.println(" Enter a seller'Name:");
        String name= obj.nextLine();

        System.out.println(" Enter a sales amount:");
        int amount= obj.nextInt();

        System.out.println("Enter a sales basic salary");
        long basicsalary= obj.nextInt();

        // calculate commission based on sales
        double commissionPercentage;


        if (amount >= 50000) {
            commissionPercentage = 35;
        } else if (amount >= 30000) {
            commissionPercentage = 20;
        } else if (amount >= 20000) {
            commissionPercentage = 10;
        } else if (amount >= 10000) {
            commissionPercentage = 5;
        } else {
            commissionPercentage = 2;
        }
        // calculate the amount
        double commission = (commissionPercentage/ 100)*amount;

        // scanner close
        obj.close();



    }
}
