package com.example.bateriaejercicioscuatro.views;

import com.example.bateriaejercicioscuatro.MainApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CountVowelsView {
    private static Stage countVowelsStage = new Stage();

    public static void show() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("CountVowelsView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        countVowelsStage.setScene(scene);
        countVowelsStage.show();
    }
}
