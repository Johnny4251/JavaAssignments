/*
Name:               John Pertell
Date:               2.15.22
Description:        This program will use Java's class system to create an 
                    instance of the Temperature class. This program will then
                    convert Fahrenheit to Celsius and Kelvin.
 */
package chp06pc08;

import java.util.Scanner;

public class Chp06PC08 
{
    public static void main(String[] args) 
    {
        // Declare temperature styles as doubles
        double fahrenheit, celsius, kelvin;
        
        // Create a new instance of the Scanner class
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt User for Current Temperature
        System.out.print("What is the current temperature in Fahrenheit? ");
        
        // Sets temperature equal to the amount the end-user enters
        Temperature temp = new Temperature(keyboard.nextDouble());
        
        // Using the Temperature class, set values accordingly into doubles
        fahrenheit = temp.getFahrenheit();
        celsius = temp.celsius();
        kelvin = temp.kelvin();
        
        // Print out table
        System.out.println("\n|----------Temperatures---------|");
        System.out.println("+-------------------------------+");
        System.out.println("| Fahrenheit | Celsius | Kelvin |");
        System.out.println("+-------------------------------+");
        System.out.printf("|    %.1f    |  %.1f   | %.1f  |"
                           , fahrenheit, celsius, kelvin);
        System.out.println("\n+-------------------------------+");
        
        
    }
}

