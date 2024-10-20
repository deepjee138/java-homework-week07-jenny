package javaprograms;

/**
 *  Write a Java program to calculate the average value of array elements.
 */

public class AverageValue {

    public static void main(String[] args) {
    AverageValue obj = new AverageValue();
    obj.method();
    }
    public void method(){
    // array
        int[] array = {10, 20, 30, 40, 50};

        // Variable to hold the sum
        int sum = 0;

        // Loop through the array and calculate the sum of all elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate the average by dividing sum by the number of elements in the array
        double average = (double) sum / array.length;

        // Print the average value of the array
        System.out.println("The average value of the array elements is: " + average);
    }
}



