package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 3/20/15.
 * Access Code 2-1
 * Marbella Vidals
 * Homework #3
 * Due: March 20
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     // Fibonacci Call Method, works for integers less than 46, because not using a long!

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Fibonacci Calculator");
        System.out.println("Enter an integer greater than one: ");

        int inputNum=keyboard.nextInt();

        System.out.println("Result: "+ fibonacci(inputNum));

    }

    // Fibonacci

    public static int fibonacci(int number) {

        int fibNum0 = 1;
        int fibNum1 =
                1;
        int result = 1;

        if (number < 1) {

            System.out.println("Invalid! Enter an integer greater than one,please");
            return 0;
        }

        if (number == 1 || number == 2) {

            return 1;
        }

        for (int i = 3; i <= number; i++) {
            // result is equal to the two previous numbers
            result = fibNum0 + fibNum1;

            fibNum0 = fibNum1;
            fibNum1 = result;
        }
        return result;
    }

}







