package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import javax.swing.*;


public class PaneController {
private float firstNumber;
private float secondNumber;
private String operation="0";


    @FXML
    private TextField textField;

    @FXML
    public void initialize() {
    }

    @FXML
    public void MouseEnteredDigit(ActionEvent event) {
        if (operation.equals("=")) {
            textField.setText("");
            textField.appendText(((Button) event.getSource()).getText());
            operation = ((Button) event.getSource()).getText();
        }
        else {
            if (textField.getLength() < 10) {
                textField.appendText(((Button) event.getSource()).getText());
            }
        }
    }


    @FXML
    public void handleAction(ActionEvent event){
        firstNumber = Float.parseFloat(textField.getText());
        textField.setText("");
        operation = ((Button) event.getSource()).getText();
    }

    @FXML
    public void equals(ActionEvent event){
        secondNumber = Float.parseFloat(textField.getText());

        if(operation.equals("+")){
            firstNumber = firstNumber + secondNumber;
        }
        else if(operation.equals("-")){
            firstNumber = firstNumber - secondNumber;
        }
        else if(operation.equals("*")){
            firstNumber = firstNumber * secondNumber;
        }
        else if(operation.equals("/")){
            firstNumber = firstNumber / secondNumber;
        }
        textField.setText(""+firstNumber);
        operation = ((Button) event.getSource()).getText();
    }

    @FXML
    public void deleteAll(){
        textField.setText("");
    }
}

