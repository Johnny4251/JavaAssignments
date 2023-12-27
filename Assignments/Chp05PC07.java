/*
Name:                John Pertell
Date:                12.06.21
Description:         This program will take five user-inputted test scores
                     and use a method named determineGrade to find the
                     corresponding letter grade. The program will also use
                     another method (calcAverage), to calculate the average
                     of the totals.
 */
//package chp05pc07;
import java.util.Scanner;

public class Chp05PC07
{
    public static void main(String[] args)
    {
        // Used to store value of scores as int data types
        int scoreOne;
        int scoreTwo;
        int scoreThree;
        int scoreFour;
        int scoreFive;

        // Using the Scanner class to read user input
        Scanner keyboard = new Scanner(System.in);

        double gradeAverage;

        // Prompt for scores, store in corresponding int
        System.out.print("Enter Score #1: ");
        scoreOne = keyboard.nextInt();

        System.out.print("Enter Score #2: ");
        scoreTwo = keyboard.nextInt();

        System.out.print("Enter Score #3: ");
        scoreThree = keyboard.nextInt();

        System.out.print("Enter Score #4: ");
        scoreFour = keyboard.nextInt();

        System.out.print("Enter Score #5: ");
        scoreFive = keyboard.nextInt();

        // Print report card, using determineGrade method which takes the score
        // and turns it into a letter grade to display on the grade report
        System.out.println("\n-----|REPORT CARD|-----");
        System.out.println("\nScore #1: " + determineGrade(scoreOne));
        System.out.println("Score #2: " + determineGrade(scoreTwo));
        System.out.println("Score #3: " + determineGrade(scoreThree));
        System.out.println("Score #4: " + determineGrade(scoreFour));
        System.out.println("Score #5: " + determineGrade(scoreFive));

        // Determine grade average and print at bottom of report card
        gradeAverage = calcAverage(scoreOne, scoreTwo,
                                   scoreThree, scoreFour, scoreFive);
        System.out.printf("\nAverage grade: %.1f%%\n" , gradeAverage);
    }

    /**
     * This method will take a passed integer score and using an if-statement
     * will determine the correct letterGrade that corresponds with the score.
     * @param score We will use this to set letter grade
     * @return a letterGrade as a char with the corresponding letter
     */

    public static char determineGrade(int score)
    {
        char letterGrade;

        // Find corresponding letterGrade for the score passed
        if(score < 60)
            letterGrade = 'F';
        else if(score < 70)
            letterGrade = 'D';
        else if(score < 80)
            letterGrade = 'C';
        else if(score < 90)
            letterGrade = 'B';
        else
            letterGrade = 'A';

        return letterGrade;
    }

    /**
     * This method will take 5 passed integers and average them all by getting
     * their sums and dividing by 5.0.
     * @param gradeOne This will be the value of the first grade
     * @param gradeTwo This will be the value of the second grade
     * @param gradeThree This will be the value of the third grade
     * @param gradeFour This will be the value of the fourth grade
     * @param gradeFive This will be the value of the fifth grade
     * @return  return gradeAverage of all five integers passed
     */
    public static double calcAverage(int gradeOne, int gradeTwo, int gradeThree,
                                     int gradeFour, int gradeFive)
    {
        // Average all grades passed and store into gradeAverage
        double gradeAverage = (gradeOne + gradeTwo +
                            gradeThree + gradeFour + gradeFive) / 5.0;

        return gradeAverage;
    }
}
