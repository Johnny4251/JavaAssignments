/*
Name:               John Pertell
Date:               04/12/22
Description:        This is class inherits all fields and methods from the Ship
                    class. This class also contains an additional maxPassengers
                    field with an appropriate accessor and mutator. 
 */
package chp10pc10;

public class CruiseShip extends Ship
{
    // Declare an instance field to hold an int data type for the max number of passengers
    private int maxPassengers;
    
    /**
     * This constructor will take in three arguments and initialize all instance
     * fields in this class, and the super class by passing the data to the super
     * class constructor.
     * @param shipName. Passed to the superclass constructor initialize the shipName.
     * @param yearBuilt. Passed to the superclass constructor initialize the yearBuilt.
     * @param maxPassengers. Passed to the constructor to initialize the maxPassenger field.
     */
    public CruiseShip(String shipName, String yearBuilt, int maxPassengers)
    {
        super(shipName, yearBuilt);
        this.maxPassengers = maxPassengers;
    }
    
    /**
     * This method will allow the programmer to make changes to the maxPassengers field.
     * @param maxPassengers. Passed to initialize the maxPassengers field.
     */
    public void setMaxPassengers(int maxPassengers)
    {
        this.maxPassengers = maxPassengers;
    }
    
    /**
     * This method will all the programmer to retrieve the value stored in maxPassengers.
     * @return maxPassengers. 
     */
    public int getMaxPassengers()
    {
        return maxPassengers;
    }
    
    /**
     * This method will print out the values of the instance fields to the console.
     * @return a String that is made up of the values of the instance fields.
     */
    public String toString()
    {
        return ("Ship Name: " + super.getShipName() 
              +"\nMax Number of Passengers: " + maxPassengers);
    }
}
