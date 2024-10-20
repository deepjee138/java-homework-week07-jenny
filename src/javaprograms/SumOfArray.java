package javaprograms;

/**
 *  Write a Java program to sort a numeric array and a string array.
 */

public class SumOfArray {


    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();
        obj.m4();

    }
    public void m4(){
        // value of array
        int[]numericArray = {10,20,30,40,50,60,70,80,90,};

        // variable of hold
        int sum= 0;
        for (int i = 0; i < numericArray.length; i++) {
            sum += numericArray[i];

            //print sum array
            System.out.println("The sum of the array values is: " + sum);

        }




    }
}
