/*
Name:                  John Pertell
Date:                  September 29, 2021
Description:           This program will use dialog boxes to calculate sales
                       tax totals from a user inputted purchase price
*/

//package chp02pc07;
import javax.swing.JOptionPane;

public class Chp02PC07
{
    public static void main(String[] args)
    {
            // Declare & initialize tax constants
        final double STATE_SALES_TAX_RATE = 0.04;
        final double COUNTY_SALES_TAX_RATE = 0.02;

            // Declare purchasePrice, totalTaxRate & userInput
        double purchasePrice;
        double totalTaxRate = STATE_SALES_TAX_RATE + COUNTY_SALES_TAX_RATE;
        String userInput;

            // Grab userInput from dialog box, then parse as a double
        userInput = JOptionPane.showInputDialog("What was your purchase price?");
        purchasePrice = Double.parseDouble(userInput);

            // Display all totals in dialog box
        JOptionPane.showMessageDialog(null, "     ----------Receipt----------\n"
       + "\nPurchase Price:           $" + purchasePrice
       + "\nSales Tax Paid:            $" + purchasePrice * STATE_SALES_TAX_RATE
       + "\nCounty Tax Paid:         $" + purchasePrice * COUNTY_SALES_TAX_RATE
       + "\nTotal Tax Paid:             $" + totalTaxRate * purchasePrice
       + "\n\nTotal Paid after Tax:   $" + purchasePrice * (1 + totalTaxRate));

        System.exit(0);
    }
}
