/**
 * NAME:        John Pertell
 * DATE:        09.21.22
 * DESCRIPTION: This program uses recursion to define the sum of all numbers in
 *              a specified range. The program then prints out the sum to the 
 *              command line.
 */

package chp15pc08;

public class Chp15PC08 {

    public static void main(String[] args) {
        // Used to determine end point of sum range.
        int max = 10;
        
        // Print out the sum of all numbers from 1-max
        System.out.println("The sum of numbers 1 through " + max 
                         + " is: " + numberSum(max));
    }
    
    /**
     * This method uses recursion to determine the sum of all numbers from one 
     * to the value of the max parameter.
     * @param max. This determines the max number to sum.
     * @return the sum of all numbers from one to the value of max.
     */
    public static int numberSum(int max) {
        // Checking if the max is equal to or below zero
        if(max <= 0) {
            // if true then return 0
            return 0;
        }
        else {
            // If max > 0, then use recursion to return the sum of the current
            // number plus the next number
            return max + numberSum(max - 1);
        }
    }
    
}