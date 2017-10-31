/*
 * This program is to see the the difference in the algorithims for
 * finding the first recurring character in a string
 */

package firstrecurring;

import java.util.Scanner;

/**
 *
 * @author Mark Erickson
 */

public class FirstRecurring {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String testString = "";
        long startTime = 0;
        long endTime = 0;
        long totalTimeNiave = 0;
        long totalTimeBetter = 0;
        
        // Get user supplied string
        System.out.println("Please enter a string?");
        testString = keyboard.nextLine();
       
        startTime = System.nanoTime();
        firstRecurringNiave(testString);
        endTime = System.nanoTime();
        totalTimeNiave = endTime - startTime;
        System.out.println("The niave method took " + totalTimeNiave
                            + " nanoseconds");
        
        
        startTime = System.nanoTime();
        //firstRecurringBetter(testString);
        endTime = System.nanoTime();
        totalTimeBetter = endTime - startTime;
        System.out.println("The niave method took " + totalTimeBetter
                            + " nanoseconds");
        
        // Report which is better and by how much
        if (totalTimeBetter < totalTimeNiave)
        {
            System.out.println("The second method was better by "
                                + (totalTimeNiave - totalTimeBetter));
        }
        else
        {
            System.out.println("The first method was better by "
                                + (totalTimeBetter - totalTimeNiave));
        }
    }

    private static void firstRecurringNiave(String string) {
        
        char charChecked;
        
        // loop through string
        for(int i = 0; i < string.length(); i++)
        {
           charChecked = string.charAt(i);
           
           for(int j = i + 1; j < string.length(); j++)
           {
               if(charChecked == string.charAt(j))
               {
                   System.out.println(string.charAt(j) 
                           + " is the first recurring character");
                   return;
               }
           }
        }
    }
    
}
