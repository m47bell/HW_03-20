package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/20/15.
 * Access Code 2-1
 * Marbella Vidals
 * Homework #3
 * Due: March 20
 */

public class DivisorPatternArt {

    public static void main(String[] args) {

        print(5);
    }

    // creates a table with the number of columns and rows entered
    public static void print(int number) {
        int row;
        int column;

        for (row = 1; row <= number; row++) {
            for (column = 1; column < number; column++) {
                System.out.print(art(row, column));
            }
            System.out.println(art(row, column));
        }
    }

    //prints a @ or a space in the proper spot within the grid
    public static String art(int i, int j) {

        //prints where i and j have a remainder of zero
        //row 1 and column 1 remainder is zero, print @
        if (i % j == 0 || j % i == 0) {
            return "@ ";
            //return "@*"; testing num of spaces
        }

        //prints a space where the remainder is not zero
        // example, if the row is 1 and column is 2 remainder is .5 so print space
        else {
            return "  ";
            // return "##"; testing num of spaces
        }
    }


}



