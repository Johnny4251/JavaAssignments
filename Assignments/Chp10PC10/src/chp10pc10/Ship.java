/*
Name:               John Pertell
Date:               04/12/22
Description         This is the super class for the CruiseShip and CargoShip
                    class. This class is composed of two fields that are passed
                    down to the subclasses. The appropriate accessors and mutators 
                    are also written. 
 */
package chp10pc10;

public class Ship 
{
    // Declare two instance fields to hold String data about the Ship.
    private String shipName;
    private String yearBuilt;
    
    /**
     * This constructor will build the super class and 
     * initialize the instance fields.
     * @param shipName. Parameter used to initialize the shipName field.
     * @param yearBuilt. Parameter used to initialize the yearBuilt field.
     */
    public Ship(String shipName, String yearBuilt)
    {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }
    
    /**
     * This method will set the shipName field to the argument passed
     * @param shipName. Used too set the shipName field.
     */
    public void setShipName(String shipName) 
    {
        this.shipName = shipName;
    }
    
    /**
     * This method will set the yearBuilt instance field to the argument passed.
     * @param yearBuilt. Parameter used to set the yearBuilt field.
     */
    public void setYearBuilt(String yearBuilt)
    {
        this.yearBuilt = yearBuilt;
    }
    
    /**
     * This method will return the shipName instance field
     * @return shipName. The instance field carrying the name of the ship
     */
    public String getShipName() 
    {
        return shipName;
    }
    
    /**
     * This method will return the yearBuilt instance field.
     * @return yearBuilt. The instance field for carrying the year the ship was built
     */
    public String getYearBuilt()
    {
        return yearBuilt;
    }
    
    /**
     * The toString method will return a the values of the instance fields.
     * @return a String which will be the values of the instance fields.
     */
    public String toString()
    {
        return ("Ship Name: " + shipName 
             +"\nYear Built: " + yearBuilt);
    }
}
