/*
Name:                   John Pertell
Date:                   03.02.22
Description:            This program will ask a user to input information about
                        the rainfall in each month. The program will then use
                        use the Rainfall class to calculate the lowest, max, average
                        and total rainfall counts. 
 */
package chp07pc01;

import java.util.Scanner;

public class Chp07PC01 
{
    public static void main(String[] args) 
    {
        // Create instance of Scanner class for input
        Scanner keyboard = new Scanner(System.in);

        // Declare doubles to calculate rainfall average and totals
        double totalRainfall;
        double averageRainfall;
        
        // Declare integers to determine the month with the most and least rainfall
        int mostRainfall;
        int leastRainfall;
        
        // Create an array to store rainfall figure in the corresponding month
        final int MONTHS = 12;
        double[] monthlyRainfall = new double[MONTHS];
        
        // Looping through the monthlyRainfall array 
        for(int month = 1; month <= monthlyRainfall.length;)
        {
            // Store rainfall figure into the corresponding month
            System.out.print("Enter rainfall for month " + month + ": ");
            monthlyRainfall[month - 1] = keyboard.nextDouble();

            // Check for input validation, if valid then continue to next month
            if(monthlyRainfall[month - 1] >= 0)
            {
                month++;
            }
            else
            {
                // If not valid, reiterate the loop not incrementing the month
                System.out.println("Please enter a valid rainfall figure");
            }
        }
        
        // Create instance of Rainfall class for calculation
        Rainfall rainfall = new Rainfall(monthlyRainfall);
        
        // Set totals and averages equal to the return value from the Rainfall class's methods
        totalRainfall = rainfall.calcTotalRainfall();
        averageRainfall = rainfall.calcAverageRainfall();
        mostRainfall = rainfall.findMostRainfall();
        leastRainfall = rainfall.findLeastRainfall();
         
        // Output data retrieved using the Rainfall class
        System.out.printf("\nTotal rainfall: %.1f", totalRainfall);
        System.out.printf("\nAverage rainfall: %.1f" , averageRainfall);
        System.out.printf("\nMonth with most rainfall: %d", mostRainfall);
        System.out.printf("\nMonth with least rainfall: %d\n", leastRainfall);
        
    }
}