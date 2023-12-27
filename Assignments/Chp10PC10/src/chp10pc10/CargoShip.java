/*
Name:               John Pertell
Date:               04/12/22
Description:        This is class inherits all fields and methods from the Ship
                    class. This class also contains an additional cargoCapacity
                    field with an appropriate accessor and mutator.
 */
package chp10pc10;

public class CargoShip extends Ship
{
    // Declare an instance field of type int that will store the cargoCapacity in tonnage
    private int cargoCapcity;
    
    /**
     * This constructor takes in three arguments that will initialize the instance 
     * fields. Two of the arguments use the super class constructor to do so.
     * @param shipName. Passed to the superclass constructor initialize the shipName.
     * @param yearBuilt. Passed to the superclass constructor initialize the yearBuilt.
     * @param cargoCapacity. Passed to the constructor to initialize the cargoCapacity field. 
     */
    public CargoShip(String shipName, String yearBuilt, int cargoCapacity)
    {
        super(shipName, yearBuilt);
        this.cargoCapcity = cargoCapacity;
    }
    
    /**
     * This method will allow the programmer to set the cargoCapcity field.
     * @param cargoCapcity. Used to initialize cargoCapcity.
     */
    public void setCargoCapacity(int cargoCapcity)
    {
        this.cargoCapcity = cargoCapcity;
    }
    
    /**
     * This method will retrieve the cargoCapacity field.
     * @return cargoCapacity. 
     */
    public int getCargoCapcity()
    {
        return cargoCapcity;
    }
    
    /**
     * This method will print out the values of the instance fields.
     * @return a String containing the data in the instance fields.
     */
    public String toString()
    {
        return ("Ship Name: " + super.getShipName()
               +"\nCargo Capcity: " + cargoCapcity + " tons");
    }
}
