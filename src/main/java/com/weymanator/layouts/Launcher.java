package com.weymanator.layouts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Launcher extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Border Layout
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("borderLayout.fxml"));

        // HBox Layout
        // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("hBox.fxml"));

        // VBox Layout
        // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("vBox.fxml"));

        // StackPane Layout
        // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("stackPane.fxml"));

        // GridPane Layout
        // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("gridPane.fxml"));

        // FlowPane Layout
        // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("flowPane.fxml"));

        // TilePane Layout
        // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("tilePane.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Layouts JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
