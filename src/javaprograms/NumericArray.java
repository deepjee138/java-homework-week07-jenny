package javaprograms;

import java.util.Arrays;

/**
 *  Write a Java program to sort a numeric array and a string array.
 */

public class NumericArray {


    public static void main(String[] args) {
  NumericArray obj= new NumericArray();
  obj.r1();

    }

    public void r1(){

        // Numeric array
        int[]numericArray = {1,2,3,4,5,6,7,8,9,};

        // String array
        String[]stringsArrays= { "Ishika, jenny, Jalpa, Kajal, manmeet, bhoomi"};
        // Sort the numeric array
        Arrays.sort(numericArray);

        // Sort the string array
        Arrays.sort(stringsArrays);

        // Print sorted numeric array
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // Print sorted string array
        System.out.println("Sorted String Array: " + Arrays.toString(stringsArrays));
    }
}

