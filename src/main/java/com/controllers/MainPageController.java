package com.controllers;


import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainPageController {

    private Media media;
    private MediaPlayer mediaPlayer;
    @FXML
    private MediaView rouletteVideo;

    MainPageController(){
        media = new Media("src/main/resources/videos/zero_roulette.mp4");
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        rouletteVideo = new MediaView(mediaPlayer);
    }

}
