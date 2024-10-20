package javaprograms;

import java.util.Scanner;

/**Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *) find addition,
  Subtraction, multiplication and division according
  to their symbol  (using if else)

 *
 */

public class Calculation {


    public static void main(String[] args) {
        Calculation obj= new Calculation();
        obj.g1();

    }
    public void g1(){

        // scanner
        Scanner m1 = new Scanner(System.in);
        System.out.println("Enter a FistNumber:");
        int number= m1.nextInt();

        System.out.println("Ener a second number:");
        int number2 = m1.nextInt();

        System.out.println("Enter an operation symbol (+, -, *, /):) ");
        double symbol = m1.next().charAt(0);

        // using if else
        if (symbol == '+'){
            System.out.println("Result:"+(number+number2));
        } else if (symbol == '-') {
            System.out.println("Result: " + (number - number2));
        }else if (symbol == '*'){
            System.out.println("Result: " + (number * number2));
        }else if (symbol == '/'){
            if (number2 != 0){
                System.out.println("Result: " + (number / number2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid symbol entered.");
        }
        // scanner close
        m1.close();

    }





    }

