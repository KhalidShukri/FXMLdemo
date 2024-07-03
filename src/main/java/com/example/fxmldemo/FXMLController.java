package com.example.fxmldemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {
    @FXML
    private TextField nameField;
    @FXML
    private Label greetingLabel;
    @FXML
    private void sayHello(){
        String name = nameField.getText();
        greetingLabel.setText("Hello "+ name + "!");
    }


}
