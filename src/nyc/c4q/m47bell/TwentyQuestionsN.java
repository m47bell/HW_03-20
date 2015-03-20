package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/20/15.
 * Access Code 2-1
 * Marbella Vidals
 */

import java.util.Random;
import java.util.Scanner;

public class TwentyQuestionsN {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //secret number being generated
        int secretNumber = random.nextInt((1000-1) + 1)+1;
        // number of guesses
        int numGuesses=0;


        while(true) {
            System.out.println("Number of guesses made:" + numGuesses+"\n");
            System.out.println("Guess a number between 1 and 1000? ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 1000)

                System.out.println("Please enter an integer between 1 and 1000");

            else if (guess > secretNumber){
                System.out.println("Your guess is too high.");
                numGuesses++;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
                numGuesses ++;
            } else {
                System.out.println("That's right! You win.");
                break;
            }
            if (numGuesses > 19) {
                System.out.println("You lose!");
                System.out.println("Answer: " + secretNumber);
                break;
            }

        }

    }



}

