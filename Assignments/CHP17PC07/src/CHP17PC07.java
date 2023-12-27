/*
Name:           John Pertell
Date:           11-02-2022
Description:    This class uses the Analyzer class to retrieve data
                from an array of any subclass of Number. After the
                Analyzer object is created. This class will print
                out the highest, lowest, sum, and average of
                the array.
 */

public class CHP17PC07 {
    public static void main(String[] args)
    {
        Integer[] integerNumbers = {	new Integer(10),
                new Integer(20),
                new Integer(30),
                new Integer(40),
                new Integer(50),
                new Integer(60),
                new Integer(70)
        };

        // Create an Analyzer object.
        Analyzer<Integer> analyzer = new Analyzer<>(integerNumbers);

        // Display the highest value in the array.
        System.out.println("The highest value is: " +
                analyzer.getHighest());

        // Display the lowest value in the array.
        System.out.println("The lowest value is: " +
                analyzer.getLowest());

        // Display the total of the values in the array.
        System.out.println("The total of the values is: " +
                analyzer.getTotal());

        // Display the average of the values in the array.
        System.out.println("The average of the values is: " +
                analyzer.getAverage());
    }

}
