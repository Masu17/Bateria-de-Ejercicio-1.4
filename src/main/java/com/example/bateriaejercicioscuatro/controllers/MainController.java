package com.example.bateriaejercicioscuatro.controllers;

import com.example.bateriaejercicioscuatro.services.FileService;
import com.example.bateriaejercicioscuatro.views.CountVowelsView;
import com.example.bateriaejercicioscuatro.views.CountWordsView;
import com.example.bateriaejercicioscuatro.views.OpenExplorerView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javax.swing.*;
import java.io.IOException;

public class MainController {

    @FXML
    public void openCrearArchivo() {
        try {
            OpenExplorerView.showSave();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void openAbrirArchivo() {
        try {
            OpenExplorerView.showOpen();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void openContarPalabras(ActionEvent actionEvent) {
        try {
            if (OpenExplorerView.getOpenedFile().exists()){
                CountWordsView.show();
            }
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void openContarVocales(ActionEvent actionEvent) {
        try {
            if (OpenExplorerView.getOpenedFile().exists()){
                CountVowelsView.show();
            }
        }catch (NullPointerException e){
            throw new RuntimeException(e);
//            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}