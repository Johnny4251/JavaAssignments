/*
Name:           John Pertell
Date:           12.12.2022
Description:    This program provides an interface to control a Deque created 
                from the Deque class. The user may add/remove from the front
                and rear of the Deque. The user may also view the size & check 
                if the Deque is empty. This program also provides functionality 
                to manipulate the Deque and sort it by it's values in ascending
                and descending order. It can even reverse the Deque as well. 
                The user may also find a Node'svalue as well as clear/exit the 
                program with simple commands. All information received is sent 
                back to the user through a JavaFx GUI interface. 

*/
package chp20pc01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Scanner;
import javafx.geometry.Insets;

public class Chp20PC01 extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * This method starts the GUI application that is called
     * from the main method. The GUI will be used to provide
     * an interface to the user. The interface will allow the
     * user to modify the Deque created from Deque.
     * @param stage. Used to create the GUI window. 
     */
    public void start(Stage stage)
    {
        // Reference to Deque.
        Deque deque = new Deque();
        
        // listView shows current list elements
        TextArea listView = new TextArea();
        listView.setEditable(false);
        
        // Input for user command
        TextField cmdTextField = new TextField();
        cmdTextField.setPrefColumnCount(5);
        
        // Display result of list method that was 
        // invoked by the user command.
        TextField resultTextField = new TextField();
        resultTextField.setPrefColumnCount(5);
        resultTextField.setEditable(false);
        
        // Attatch event handler to cmdTextField
        EventHandler<ActionEvent> handler =
                new CommandHandler(deque, listView, resultTextField);
        cmdTextField.setOnAction(handler);
        
        // HBox to contain command result label and text field.
        HBox hBox1 = new HBox(10);
        Label resultLabel = new Label("Command Result");
        hBox1.getChildren().addAll(resultLabel, resultTextField);
        
        // HBox to contain label and text field for command input.
        HBox hBox2 = new HBox(10);
        Label cmdLabel = new Label("Command: ");
        hBox2.getChildren().addAll(cmdLabel, cmdTextField);
        
        // VBox to contain the user interface components
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10));
        vBox.getChildren().addAll(hBox1, listView, hBox2);
        
        // Set up the scene and show the stage.
        stage.setScene(new Scene(vBox));
        stage.setTitle("Deque Demo");
        stage.show();
    }
    
    /**
     * This class provides a handler to the cmdTextField. 
     */
    class CommandHandler implements EventHandler<ActionEvent>
    {
        // Fields to hold information passed to the constructor.
        private final Deque deque;
        private final TextField resultTextField;
        private final TextArea listView;

        CommandHandler(Deque deque, TextArea lView,
                        TextField rTfield)
        {
            this.deque = deque;
            resultTextField = rTfield;
            listView = lView;
        }
        
        public void handle(ActionEvent event)
        {
            // Get the command from the command textField.
            TextField cmdTextField = (TextField)event.getTarget();
            String cmdText = cmdTextField.getText();
            
            
            // Use a scanner to read the name of the deque
            // method and do a switch on it.
            Scanner sc = new Scanner(cmdText);
            String cmd = sc.next();
            
            String value;
            
            switch(cmd)
            {
                // Actions for commands when adding to the front/rear of the 
                // Deque. Update the listView. 
                case "addFront":
                    value = sc.next();
                    deque.addFront(value);
                    listView.setText(deque.toString());
                    break;
                    
                case "addRear":
                    value = sc.next();
                    deque.addRear(value);
                    listView.setText(deque.toString());
                    break;
                    
                // Actions for commands when removing to the front/rear of the 
                // Deque. Update the listView. 
                case "removeFront":
                    try { 
                        deque.removeFront(); 
                        listView.setText(deque.toString());
                    }
                    catch(Exception e) { e.printStackTrace(); }
                    break;
                    
                case "removeRear":
                    try {
                        deque.removeRear();
                        listView.setText(deque.toString());
                    }
                    catch(Exception e) { e.printStackTrace(); }
                    break;
                    
                // Actions to perform if the end user wants to see the Deque's 
                // size/if it is empty. Update the resultTextField.
                case "empty":
                    String resText = String.valueOf(deque.empty());
                    resultTextField.setText(resText);
                    break;
                    
                case "size":
                    String resText1 = String.valueOf(deque.size());
                    resultTextField.setText(resText1);
                    break;
                
                // Some more methods added for extra functionality
                case "reverse":
                     deque.reverse();
                     listView.setText(deque.toString());
                     break;
                     
                case "sort":
                    value = sc.next();
                    // Use `asc` or `desc` after `sort` to specify order
                    switch(value) 
                    {
                        case "asc":
                            deque.sortAsc();
                            break;
                        case "desc":
                            deque.sortDesc();
                            break;
                    }
                    listView.setText(deque.toString());
                    break;
                    
                case "find":
                    value = sc.next();
                    String location = String.valueOf(deque.find(value));
                    
                    // Location == -1 if the value is not found
                    if(!location.equals(String.valueOf(-1)))
                        resultTextField.setText("Index: " + location);
                    else { resultTextField.setText("Not Found"); }
                    break;
                    
                case "clear":
                    deque.clear();
                    listView.clear();
                    break;
                    
                case "exit":
                    System.exit(0);
                    break;
            }
        }
    }
    
}
