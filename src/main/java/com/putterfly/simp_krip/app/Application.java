package com.putterfly.simp_krip.app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}