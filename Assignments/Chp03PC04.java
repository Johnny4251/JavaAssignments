/*
Name:                   John Pertell
Date:                   10.27.21
Description             This program will read user inputted grades and then
                        average the values and print the result as a
                        grade average and a grade letter.
 */

//package chp03pc04;
import java.util.Scanner;

public class Chp03PC04
{
    public static void main(String[] args)
    {

        int gradeOne;
        int gradeTwo;           // Declare the three test scores as an int
        int gradeThree;

        double gradeAverage;    // Declare the grade average as a double

        char letterGrade;       // Declare letterGrade as a char

            // Using the scanner class, declare a new object to read userInput
        Scanner userInput = new Scanner(System.in);

           // Prompt user for test scores, then store in corresponding variables
        System.out.print("Enter first test score: ");
        gradeOne = userInput.nextInt();

        System.out.print("Enter second test score: ");
        gradeTwo = userInput.nextInt();

        System.out.print("Enter third test score: ");
        gradeThree = userInput.nextInt();

            // Print report card graphic
        System.out.println("\n--------REPORT CARD--------");

            // Calculate grade average and store into double gradeAverage
        gradeAverage = ((gradeOne + gradeTwo + gradeThree) / 3.0);

            // Find letter grade that corresponds to the grade average
        if (gradeAverage < 60)
            letterGrade = 'F';

        else if(gradeAverage < 70)
            letterGrade = 'D';

        else if(gradeAverage < 80)
            letterGrade = 'C';

        else if(gradeAverage < 90)
            letterGrade = 'B';

        else
            letterGrade = 'A';

          // After finding letter grades, prompt the user grade & letter grade
        System.out.printf("\nGrade Average: %.1f%%\n" , gradeAverage);
        System.out.println("Letter Grade: " + letterGrade);
    }
}
