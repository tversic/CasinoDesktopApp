package com.controllers;
import com.casino.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class WelcomePageController {
    @FXML
    AnchorPane ap = new AnchorPane();

    @FXML
    void loadNewPane() throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("firstScreen.fxml"));
        Stage stage = (Stage) ap.getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }

}