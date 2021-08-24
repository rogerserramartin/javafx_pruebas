package com.roger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class MainPrueba extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {


        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "view/VentanaAbanca.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

        // Create the Pane and all Details
        AnchorPane root = (AnchorPane) loader.load(fxmlStream);

        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        stage.setScene(scene);
        // Display the Stage
        stage.show();


    }
}
