/*
Name:       John Pertell
Date:       05.05.22
Desc:       This program will ask an end user to give an input for the price
            of a meal. The program will calculate the tip, tax and total for the
            inputted value and then display it to the end user.
*/
package chp12pc03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javax.swing.JOptionPane;

public class Chp12PC03 extends Application {

    public static void main(String[] args) 
    {
        // Launch the application
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) 
    {
        // Declare constants for tip & tax rates
        final double TIP_RATE = 0.18;
        final double TAX_RATE = 0.07;
        
        // Instantiate labels for displays
        Label mealChargeLabel = new Label("Meal Charge: ");
        Label tipLabel = new Label("Tip: ");
        Label taxLabel = new Label("Tax: ");
        Label totalLabel = new Label("Total: ");
        
        // Instantiate TextField for user input
        TextField mealChargeTextField = new TextField();
        
        // Instantiate Button, change the button width
        Button calculateButton = new Button("Calculate");
        calculateButton.setPrefWidth(200);

        // Handling the event through a lambda expression when button is clicked
        calculateButton.setOnAction(event ->
        {
            // Try to calculate the mealcharge
            try
            {
                // Parse the texfield and multiply it by the tip/tax rate
                double tipPrice = Double.parseDouble(mealChargeTextField.getText())
                                  * TIP_RATE;
                double taxPrice = Double.parseDouble(mealChargeTextField.getText())
                                  * TAX_RATE;
                // Determine the total by adding the text field to the tip/tax 
                double totalPrice = Double.parseDouble(mealChargeTextField.getText())
                                    + tipPrice + taxPrice;
                
                // Format the tip and tax prices to a money format
                String tipPriceFormatted = String.format("    $%,.2f", tipPrice);
                String taxPriceFormatted = String.format("    $%,.2f", taxPrice);
                String totalPriceFormatted = String.format("  $%,.2f", totalPrice);
                
                // Print the labels with their corresponding formatted price
                tipLabel.setText("Tip: " + tipPriceFormatted);
                taxLabel.setText("Tax: " + taxPriceFormatted);
                totalLabel.setText("Total: " + totalPriceFormatted);
            }
            // If an exception is thrown(possibly a parsing error) prompt the user
            catch(NumberFormatException e)
            {
                //  If the number can not be parsed
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid"
                                                  + " number in all fields");
            }
            // Any other possible exceptions that can be thrown
            catch(Exception e)
            {
                // Display error
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        });
        
        // Using GridPane for layout
        GridPane gridPane = new GridPane();
        
        // Nesting VBox in gridPane, adding result labels
        VBox vbox = new VBox(10,tipLabel,taxLabel,totalLabel);
        
        // Add a padding in the window
        gridPane.setPadding(new Insets(15));
        
        // This block is the top half
        gridPane.add(mealChargeLabel, 0,0);
        gridPane.add(mealChargeTextField, 1,0);
        gridPane.add(calculateButton, 1, 1);
        
        // Set a gap in between actors
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        
        // Nest in the vbox into the gridPane
        gridPane.add(vbox, 0, 2);
        
        // Create the scene, set height and width
        Scene scene = new Scene(gridPane, 350, 175);
        // Set scene to the stage
        primaryStage.setScene(scene);
        
        // Set the window title
        primaryStage.setTitle("Meal Calculator");
        
        // Display the primaryStage to the end-user
        primaryStage.show();
    }
}
