/*
Name:                   John Pertell
Date:                   2.15.22
Description:            This class will allow the end-user to convert
                        Fahrenheit to celisus and Kelvin. 
 */
package chp06pc08;

public class Temperature 
{
    private double fahrenheit;
    
    /**
     * The constructor will initialize fahrenheit to an argument passed.
     * @param initialTemp is used to initialize the fahrenheit field.
     */
    public Temperature(double initialTemp)
    {
        fahrenheit = initialTemp;
    }

    /**
     * Sets fahrenheit as argument passed(temp).
     * @param temp changes fahrenheit value.
     */
    public void setFahrenheit(double temp)
    {
        fahrenheit = temp;
    }
    
    /**
     * Gets the value of the fahrenheit field.
     * @return the fahrenheit field.
     */
    public double getFahrenheit()
    {
        return fahrenheit;
    }
    
    /**
     * Calculates celsius temperature from current fahrenheit temperature.
     * @return Returns the celsius temperature equivalent.
     */
    public double celsius()
    {
        // Use formula to convert fahrenheit -> celsius
        return (5.0/9.0) * (fahrenheit - 32.0);
    }
    
    /**
     * Calculates kelvin temperature from current fahrenheit temperature.
     * @return Returns the kelvin temperature equivalent.
     */
    public double kelvin()
    {
        // Use formula to convert fahrenheit -> kelvin
        return ((5.0/9.0) * (fahrenheit - 32.0)) + 273.0;
    }
    
}
