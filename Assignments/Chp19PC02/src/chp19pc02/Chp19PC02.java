/**
 * NAME:        John Pertell
 * DATE:        11.23.2022
 * DESCRIPTION: This class utilizes JavaFX to provide a command
 *              line interface to the end user. The commands allow
 *              the end user to modify a LinkedList. The LinkedList
 *              is made from the SortReverseLinkedList class. The LinkedList
 *              is displayed to the end user using a GUI application. 
 */

package chp19pc02;

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

public class Chp19PC02 extends Application {  

    public static void main(String[] args) 
    {
        // Launch GUI
        launch(args);
    }
    
    /**
     * This method starts the GUI application that is called
     * from the main method. The GUI will be used to provide
     * an interface to the user. The interface will allow the
     * user to modify the LinkedList created from SortReverseLinkedList.
     * @param stage Used to create the GUI window. 
     */
    public void start(Stage stage)
    {
        // Reference to linked list.
        SortReverseLinkedList ll = new SortReverseLinkedList();
        
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
                new CommandHandler(ll, listView, resultTextField);
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
        stage.setTitle("Linked List Demo");
        stage.show();
    }
    
    /**
     * This class provides a handler to the cmdTextField. 
     */
    class CommandHandler implements EventHandler<ActionEvent>
    {
        // Fields to hold information passed to the constructor.
        private final SortReverseLinkedList ll;
        private final TextField resultTextField;
        private final TextArea listView;
        
        CommandHandler(SortReverseLinkedList lList, TextArea lView,
                        TextField rTfield)
        {
            ll = lList;
            resultTextField = rTfield;
            listView = lView;
        }
        
        public void handle(ActionEvent event)
        {
            // Get the command from the command textField.
            TextField cmdTextField = (TextField)event.getTarget();
            String cmdText = cmdTextField.getText();
            
            // Use a scanner to read the name of the linked list
            // method and do a switch on it.
            Scanner sc = new Scanner(cmdText);
            String cmd = sc.next();
            switch(cmd)
            {
                case "add":
                    if (sc.hasNextInt())
                    {
                        // add index element
                        int index = sc.nextInt();
                        String element = sc.next();
                        ll.add(index, element);
                    }
                    else
                    {
                        // add element
                        String element = sc.next();
                        ll.add(element);
                    }
                    listView.setText(ll.toString());
                    return;
                case "remove":
                    if (sc.hasNextInt())
                    {
                        // remove index
                        int index = sc.nextInt();
                        String res = ll.remove(index);
                        resultTextField.setText(res);
                    }
                    else
                    {
                        // remove element
                        String element = sc.next();
                        boolean res = ll.remove(element);
                        String resText = String.valueOf(res);
                        resultTextField.setText(resText);
                    }
                    listView.setText(ll.toString());
                    return;
                case "isempty":
                    String resText = String.valueOf(ll.isEmpty());
                    resultTextField.setText(resText);
                    return;
                case "size":
                    String resText1 = String.valueOf(ll.size());
                    resultTextField.setText(resText1);
                    return;
                case "reverse":
                    // Reverse list and display reversed list
                    ll.reverse();
                    String revList = ll.toString();
                    resultTextField.setText("reversed");
                    listView.setText(revList);
                    return;
                case "sort":
                    // sort list in ascending order and then display
                    ll.sort();
                    String sortList = ll.toString();
                    resultTextField.setText("sorted");
                    listView.setText(sortList);
                    return;
            }
        }
    }
    
}
