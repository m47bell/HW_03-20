package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/20/15.
 * Access Code 2-1
 * Marbella Vidals
 */

import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args) {
        // Fibonacci Call Method, for all numbers YAY!

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Fibonacci Calculator");
        System.out.println("Enter an integer greater than one: ");

        int inputNum = keyboard.nextInt();
        //long finalResult = (int)inputNum;

        System.out.println("Result: " + fibonacci(inputNum));

    }

    // Fibonacci

    public static long fibonacci(long number) {

        long fibNum0 = 1;
        long fibNum1 = 1;
        long result = 1;

        if (number < 1) {

            System.out.println("Invalid!Enter an integer greater than one,please");
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
       //using the math formula
    public static long fibonacci2(long number) {
        //tried the math formula but could not make it work for greater than 50
        double fibNum0 = Math.pow(((1 + Math.sqrt(5)) / 2.0), number);
        double fibNum1 = Math.pow(((1 - Math.sqrt(5)) / 2.0), number);

        double result = fibNum0 + fibNum1 / Math.sqrt(5);
        long finalResult = (long)result;

        return finalResult;
    }


}
