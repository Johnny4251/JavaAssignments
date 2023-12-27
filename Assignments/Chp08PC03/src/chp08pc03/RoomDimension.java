/*
Name:               John Pertell
Date:               03.10.22
Description:        This class will take in a RoomDimension object and/or two
                    doubles that will initialize the lenght and width fields. 
                    This class then will us ethe getArea method to calculate
                    the total area. 
 */

package chp08pc03;

public class RoomDimension {
    
    // Declare doubles to hold the room's length and width
    private double length, width, area;
    
    /**
     * This Constructor will take a length and width field and initialize 
     * the field.
     * @param len. This parameter will be used to set the length field.
     * @param w. This parameter will be used to set the width field.
     */
    public RoomDimension(double len, double w) {
        // Initialize the fields from parameters passed.
        length = len;
        width = w;
        // Find area by using the getArea method
        area = getArea();
    }
    
    /**
     * This copy Constructor will take a RoomDimension object and copy the fields.
     * @param roomDimension. This parameter will be used to copy its fields
     *                       over to this object's fields.
     */
    public RoomDimension(RoomDimension roomDimension) {
        // Initialize the fields from the RoomDimension object's fields
        length = roomDimension.length;
        width = roomDimension.width;
        // Find area by using the getArea method
        area = getArea();
    }
    
    /**
     * This method will return the area of the room.
     * @return length * width. This is the formula for area calculation.
     */
    public double getArea() {
        // Return the formula for Area
        return length * width;
    }
    
    /**
     * This method will return a formatted string of the fields contents.
     * @return formattedOutput. formattedOutput is a formatted string of this
     *                          class's fields.
     */
    public String toString() {               
        // Format the fields and store into a String
        String formattedOutput = String.format("Room's Length: %.2f "
                                           + "\nRoom's Width: %.2f"
                                           + "\nRoom's Area: %.2f", length, width, area);
        // Return the formattedOutput
        return formattedOutput;
    }
}