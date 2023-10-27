package com.example.bateriaejercicioscuatro.views;

import com.example.bateriaejercicioscuatro.MainApp;
import com.example.bateriaejercicioscuatro.services.FileService;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class CountWordsView {

    private static Stage countWordsStage = new Stage();

    public static void show() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("CountWordsView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        countWordsStage.setScene(scene);
        countWordsStage.show();
    }

}
