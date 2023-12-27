/*
Name:               John Pertell
Date:               3.10.22
Description:        This program will use the RoomCarpet and RoomDimension
                    class to make a calculator that will calculate the total
                    cost for a carpet installation.
 */
package chp08pc03;

import java.util.Scanner;

public class Chp08PC03 {
    public static void main(String[] args) {
        
        // Instantiate new Scanner object for user input
        Scanner keyboard = new Scanner(System.in);
        
        // Will use to grab length in width inputs from end user
        double length, width;
        
        // Will use to grab carpet price from user
        double carpetPrice;
        
        // Ask user for fields
        System.out.println("---Carpet Calculator---");
        System.out.print("Room Length? ");
        length = keyboard.nextDouble();
        
        // Ask for width, store into width
        System.out.print("Room Width? ");
        width = keyboard.nextDouble();
        
        // Ask for price per sqft, store into carpetPrice
        System.out.print("Cost per sqft? $");
        carpetPrice = keyboard.nextDouble();
        
        // Instantiate roomDimenstion with user inputted fields (Aggregate class)
        RoomDimension roomDimension = new RoomDimension(length, width);
        // Instantiate roomCarpet with user inputted fields
        RoomCarpet roomCarpet = new RoomCarpet(roomDimension, carpetPrice);
        
        // Display data using an implicit toString call
        System.out.println("-----------------------");
        System.out.println(roomCarpet);
    }
}