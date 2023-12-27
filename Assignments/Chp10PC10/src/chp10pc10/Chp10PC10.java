/*
Name:               John Pertell
Date:               04/12/22
Description:        This program will use inheritance to create 3 different
                    types of Ships. All Ships inherit the Ship class. In the main
                    method an array of type Ship is created. Through polymorphism
                    we can add all classes that extend the Ship class. Finally
                    this class prints out the contents(toString) of the Ships.
 */
package chp10pc10;

public class Chp10PC10 {

    public static void main(String[] args) 
    {
        // Initialize a new array of Ships
        Ship[] shipArray = new Ship[4];
        
        // Because of polymorphism, we can assign different types of ships
        shipArray[0] = new Ship("Atlantis", "1976");
        shipArray[1] = new Ship("Long Journey", "1984");
        shipArray[2] = new CruiseShip("Carnival Paradise", "1998", 2052);
        shipArray[3] = new CargoShip("Ever Given", "2015", 220940);
        
        // Print a line seperator
        System.out.println("----------------------");
        
        // Loop thorugh the array, printing out the toString method
        for(int index=0; index<shipArray.length; index++)
        {
            System.out.println(shipArray[index]);
            System.out.println("----------------------");

        }
    }
}
