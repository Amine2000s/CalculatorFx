package com.example.javafxcalculator;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class NormalCalculatorController {


     Scene scene ;

    @FXML
    ComboBox<String> TypeofCalculator = new ComboBox<>();



    public void setScene(Scene scene){
        this.scene = scene ;

    }
    public void setTypeofCalculator(){

        TypeofCalculator.getItems().addAll(
            "Normal Calculator","Scientific Calculator"
        );

        TypeofCalculator.setValue("Normal Calculator");
    }
}