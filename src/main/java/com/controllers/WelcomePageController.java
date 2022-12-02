package com.controllers;
import com.casino.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.IOException;


public class WelcomePageController {
    @FXML
    private AnchorPane ap = new AnchorPane();
    private Media media;
    private MediaPlayer mediaPlayer;
    @FXML
    private MediaView video;
    @FXML
    void loadNewPane() throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("firstScreen.fxml"));
        Stage stage = (Stage) ap.getScene().getWindow();
        stage.setScene(new Scene(loader.load()));


        //media = new Media("file:///C:/Casino/src/main/resources/videos/zero_roulette.mp4");
        media = new Media("https://www.youtube.com/watch?v=pNbMqqlNayg");
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        video = new MediaView(mediaPlayer);

        stage.show();
    }

}