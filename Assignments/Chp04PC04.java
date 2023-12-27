/*
Name:                John Pertell
Date:                11.09.21
Description:         This program will take a user input for the amount of days
                     worked and then calculate their salary. Assuming that their
                     salary is 1 penny and their salary doubles every day
                     worked.
 */
//package chp04pc04;
import java.util.Scanner;

public class Chp04PC04
{
    public static void main(String[] args)
    {
        int daysWorked;                     // Initialize daysWorked for input
        int days;                           // Measurement of days, used in loop

        double salary = 0.01;               // Penny's are worth $0.01
        double totalSalary = 0;             // Declare and initialize total pay

            // Find userInput using the Scanner class
        Scanner userInput = new Scanner(System.in);

            // Prompt amount of days worked, store into daysWorked as an int
        System.out.print("Enter the amount of days worked: ");
        daysWorked = userInput.nextInt();

            // Check for input validation, if true then prompt user to enter again
        while(daysWorked <= 0)
        {
            System.out.print("\nPlease enter a valid number of days worked: ");
            daysWorked = userInput.nextInt();
        }
            // Start chart graphic heaading
        System.out.println("\n Day \t  |\t Salary "
                         + "\n----------|--------------------");

            /* Using a for loop, double the salary for every day worked,
            then output results and add a running total to totalPay.
            Loop for amount of days worked. */
        for(days = 1; days <= daysWorked; days++, salary *= 2)
        {
            System.out.printf("  %d\t  |\t $%,.2f\n" , days, salary);
            totalSalary += salary;       // Running total for totalPay
        }
            // Finally output the total pay graphic
        System.out.println("===============================");
        System.out.printf("  Total Salary:\t $%,.2f\n", totalSalary);
        System.out.println("===============================");
    }
}