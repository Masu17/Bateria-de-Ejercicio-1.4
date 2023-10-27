package com.example.bateriaejercicioscuatro.controllers;

import com.example.bateriaejercicioscuatro.views.OpenExplorerView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class CountWordsController {

    public TextArea showTextField;
    public TextField numeroPalabrasBox;

    public void initialize() {
        try {
            Scanner sc = new Scanner(OpenExplorerView.getOpenedFile());
            while (sc.hasNext()) {
                showTextField.appendText(sc.nextLine());
            }
            sc = new Scanner(OpenExplorerView.getOpenedFile());
            int count = 0;
            while (sc.hasNext()){
                sc.next();
                count++;
            }
            numeroPalabrasBox.setText(String.valueOf(count));
            showTextField.setEditable(false);
            numeroPalabrasBox.setEditable(false);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
