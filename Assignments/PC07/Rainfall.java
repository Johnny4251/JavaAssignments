/*
Name:                   John Pertell
Date:                   03.02.22
Description:            This program will use the rain field to calculate the 
                        total, average, least, and most rainfall.
 */
package chp07pc01;

public class Rainfall 
{
    // Declare the rain field to store in the values of the rainfall
    private double rain[];
    
    
    /**
     * This constructor will take in an array of doubles and set the rain
     * field equal to an array passed by using a for loop to traverse the array.
     * @param rain. Rain will be used to pass in an array of doubles.
     */
    public Rainfall(double[] rain)
    {
        // First initialize the rain array with the same length
        this.rain = new double[rain.length];
        
        // Traverse the array and set each index of the array to the rain field
        for(int index = 0; index < rain.length; index++)
            this.rain[index] = rain[index];
        
        
    }
    
    /**
     * This method will traverse the rain array and keep a running total
     * of every element.
     * @return totalRain. This is the running total used to add together all elements.
     */
    public double calcTotalRainfall()
    {
        double totalRain = 0;
        
        // Traverse the array and keep a running total of all values
        for(int index = 0; index < rain.length; index++)
        {
            totalRain += rain[index];
        }
        
        // Return the running total
        return totalRain;
    }
    
    /**
     * This method will use the calcTotalRainfall method to add together all
     * the rain array elements and then divide them but it's length to determine
     * the average amount of rainfall.
     * @return averageRainfall. This is used to return the average amount of rainfall.
     */
    public double calcAverageRainfall()
    {
        // Use the calcTotalRainfall to find the total amount of rainfall then divide by its length
        double averageRainfall = calcTotalRainfall() / rain.length;
        
        // Return the average
        return averageRainfall;
    }
    
    /**
     * This method will traverse the rain array until it finds the month with
     * the most amount of rainfall.
     * @return highestMonth. This will be an int that holds the month with the most rainfall.
     */
    public int findMostRainfall()
    {
        // Assume the highest month is at index 0
        int highestMonth = 0;
        
        // Traverse the rain array and everytime there is a higher month, store into highestMonth
        for(int index = 0; index < rain.length; index++)
        {
            if(rain[index] > rain[highestMonth])
                highestMonth = index;
        }
        
        // Return the highestMonth, add 1 to format into correct month number
        return highestMonth + 1;
    }
    
    /**
     * This method will traverse the rain array until it finds the month with the
     * least amount of rainfall.
     * @return lowestMonth. This will be an int that holds the month with th least rainfall.
     */
    public int findLeastRainfall ()
    {
        // Assume the lowest month is at index 0
        int lowestMonth = 0;
        
        // Traverse the rain array and everytime there is a lower month, store into lowestMonth
        for(int index = 0; index < rain.length; index++)
        {
            if(rain[index] < rain[lowestMonth])
                lowestMonth = index;
        }
        
        // Return the lowestMonth, add 1 to format into correct month number
        return lowestMonth + 1;
    }    
}
