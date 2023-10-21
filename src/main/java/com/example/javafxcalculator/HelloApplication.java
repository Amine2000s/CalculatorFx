package com.example.javafxcalculator;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scientifique_Calculator.fxml"));

        String css1 = this.getClass().getResource("dark-theme.css").toExternalForm();
        String css2 = this.getClass().getResource("light-theme.css").toExternalForm();
        Parent p = fxmlLoader.load();
        Scene scene = new Scene(p);
        scene.getStylesheets().add(css2);

        NormalCalculatorController  s1 = new NormalCalculatorController();

        s1.setScene(scene);
        s1.setTypeofCalculator();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}