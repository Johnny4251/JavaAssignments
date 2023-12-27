/*
 Name:          John Pertell
 Date:          11-02-2022
 Description:   This class has a generic type T, that is constrained
                to the Number class. This class takes in an array of
                number of type T. This class also provides methods also
                provides methods that retrieve data from the array.
 */

public class Analyzer<T extends Number> {
    // Field of an array of numbers of Type T
    private T[] numberArray;

    /**
     * The Constructor for this class takes in an array of numbers
     * of type T and then sets the numberArray field equal to the
     * array passed.
     * @param numberArray. The Parameter used to initialize the numberArray
     *                     field.
     */
    public Analyzer(T[] numberArray) {
        // Initializing the numberArray field
        this.numberArray = numberArray;
    }

    /**
     * This method will return the highest number in the
     * numberArray as a double. It will do this by traversing
     * the array and comparing the values to highestNum.
     * @return the highest number value of the array as a double.
     */
    public T getHighest() {
        // Initializing the highestNum as the first element
        T highestNum = numberArray[0];

        // Traversing the array, comparing values to highestNum
        for(int i=1; i<numberArray.length; i++) {
            if(numberArray[i].doubleValue() > highestNum.doubleValue() )
                // If higher, then change value of highestNum
                highestNum = numberArray[i];
        }

        // Return the highest number
        return highestNum;
    }

    /**
     * This method will return the lowest number in the
     * numberArray as a double. It will do this by traversing
     * the array and comparing the values to lowestNum.
     * @return the lowest number value of the array as a double.
     */
    public T getLowest() {
        // Initializing the lowestNum as the first element
        T lowestNum = numberArray[0];

        // Traversing the array, comparing values to lowestNum
        for(int i=1; i<numberArray.length; i++) {
            if(numberArray[i].doubleValue() < lowestNum.doubleValue())
                lowestNum = numberArray[i];
        }

        // Return the lowest number
        return lowestNum;
    }

    /**
     * This method will traverse the numberArray and keep a
     * running total of the contents of the array.
     * @return the sum of the elements of the array.
     */
    public double getTotal() {
        // This is too a running total of the elements in the array
        double totalValue = 0;

        // Traversing the array, adding the values to totalValue
        for(int i=0; i<numberArray.length; i++) {
            totalValue += numberArray[i].doubleValue();
        }

        // Returning the sum of all elements
        return totalValue;
    }

    /**
     * This method uses the getTotal method to calculate
     * the average number value in the array. It does this by
     * dividing the total by the length of the array.
     * @return the average number.
     */
    public double getAverage() {
        // This returns the sum / the size of the array
        return getTotal() / numberArray.length;
    }
}
