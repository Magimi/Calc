package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;


public class PaneController {

    @FXML
    private Button digitButton;

    @FXML
    public void initialize() {

    }

    @FXML
    private TextField textField;


    @FXML
    private void MouseEnteredDigit(ActionEvent event) {
       String buttonText =  ((Button) event.getSource()).getText();
       // String buttonText = button.getText();

        textField.appendText(buttonText);
    }
    public void AddOperation(){}
    public void DivisionOperation(){}
    public void EqualsAction(){}
    public void SubstractionOperation(){}
    public void DeleteAll(){
        textField.setText("0");
    }
    public void MultiplyOperation(){}
}

