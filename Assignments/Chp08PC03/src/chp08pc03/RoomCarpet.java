/*
Name:                John Pertell
Date:                03.10.22
Description:         This class will take a RoomDimension object and instantiate
                     a new RoomDimension object named size inside of the copy
                     constructor. This class has a method that will calculate
                     the carpetCost using the RoomDimension object's area.
 */

package chp08pc03;

public class RoomCarpet {
    
    // Declare a RoomDimension object.
    private RoomDimension size;
    
    // Declare a carpetCost field to store the cost per sqft
    private double carpetCost, totalCost;
    
    /**
     * This Constructor will instantiate a new size object set to the
     * dim argument passed.
     * @param dim. This parameter will take in a RoomDimension object. 
     * @param cost. This parameter will be used to determine the cost per sqft.
     */
    public RoomCarpet(RoomDimension dim, double cost) {
        // Instantiate a new RoomDimension object by using the copy constructor
        size = new RoomDimension(dim);
        carpetCost = cost;
        
        // Call the getTotalCost method in order to find the totalCost
        totalCost = getTotalCost();
    }
    /**
     * This method will take the carpetCost and multiply it by the room's
     * area to calculate the totalCost.
     * @return totalCost. The formula used will be, carpetCost * size.getArea().
     */
    public double getTotalCost() {
        // Formula for the totalCost
        return carpetCost * size.getArea();     
    }
    
    /**
     * This method will return a formatted String that details the fields contents
     * @return the toString method from size + the formattedOutput
     */
    public String toString() {
        // Format the String to hold 2 decimal places
        String formattedOutput = String.format("\nCost Per Sqft: $%.2f "
                + "\nTotal Cost: $%,.2f", carpetCost, totalCost);
        // Return the toString from the roomDimension object + the formattedOutput
        return size + formattedOutput;
    }
}