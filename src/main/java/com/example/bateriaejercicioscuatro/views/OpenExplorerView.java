package com.example.bateriaejercicioscuatro.views;

import com.example.bateriaejercicioscuatro.MainApp;
import com.example.bateriaejercicioscuatro.services.FileService;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import lombok.Getter;

import java.io.File;
import java.io.IOException;

public class OpenExplorerView {

    @Getter
    private static Stage explorerStage;
    @Getter
    private static File openedFile;

    public static void showOpen() throws IOException {
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
            openedFile = FileService.checkFile(fileChooser.showOpenDialog(explorerStage));
        }catch (NullPointerException e){
            System.out.println("No se ha seleccionado ningún archivo");
        }
    }

    public static void showSave() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Resource File");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        openedFile = fileChooser.showSaveDialog(explorerStage);
        FileService.createFile(openedFile);
    }



}
