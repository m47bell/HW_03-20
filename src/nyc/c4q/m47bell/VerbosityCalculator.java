package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 3/20/15.
 * Access Code 2-1
 * Marbella Vidals
 * Homework #3
 * Due: March 20
 */

    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.Scanner;

    /**
     * Calculate the verbosity of a text
     */
    public class VerbosityCalculator {
        public static void main(String[] args) {

            // An abstract representation of a File
            File charlesDickens = new File("/Users/c4q-marbella/Desktop/accesscode/HW_03-20/src/nyc/c4q/m47bell/CharlesDickens");
            File hermanMelville = new File("/Users/c4q-marbella/Desktop/accesscode/HW_03-20/src/nyc/c4q/m47bell/mobydick");


            System.out.println("Herman Melville:");
            count(hermanMelville);
            System.out.println("Charles Dickens");
            count(charlesDickens);

            System.out.println("\nWhich author is more verbose?" + " Herman Melville");
        }

         public static void count(File file){
            try{
                Scanner sc = new Scanner(file);

                String textFile;
               // String authorName;

                int wordCount=0,sentenceCount=0;

                //Returns true if the iteration has more elements
                while(sc.hasNext()){
                   textFile=sc.next();
                    wordCount++;
                //looks for ., !, ? and counts as a sentence,
                if (textFile.contains("!") || textFile.contains(".") || textFile.contains("?"))
                        sentenceCount++;
                }

                System.out.println("Number of words: " + wordCount);
                System.out.println("Number of sentences: " + sentenceCount);
                double result= Math.round((wordCount/(double)sentenceCount));
                System.out.println("Verbosity :" + result+ "\n");




            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
    }

