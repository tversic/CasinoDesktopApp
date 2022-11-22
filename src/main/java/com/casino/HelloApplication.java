package com.casino;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        setStage(stage);
    }

    private static void setStage(Stage stage) throws IOException {
        stage.setTitle("TOMES CASINO");
        stage.getIcons()
                .add(new Image("https://previews.123rf.com/images/pxlprostudio/pxlprostudio1904/pxlprostudio190404087/121349353-casino-icon-on-background-for-graphic-and-web-design-simple-vector-sign-internet-concept-symbol-for-.jpg"));
        stage.setMinWidth(720);
        stage.setMinHeight(480);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}