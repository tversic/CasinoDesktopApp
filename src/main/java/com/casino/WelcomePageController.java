package com.casino;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class WelcomePageController {
    @FXML
    Label label = new Label();

    @FXML
    void loadNewPane(){
        label.setText("loaded");
    }

}