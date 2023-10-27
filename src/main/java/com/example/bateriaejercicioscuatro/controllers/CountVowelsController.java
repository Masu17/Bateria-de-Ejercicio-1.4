package com.example.bateriaejercicioscuatro.controllers;

import com.example.bateriaejercicioscuatro.views.OpenExplorerView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class CountVowelsController {

    public TextField letterA;
    public TextField letterE;
    public TextField letterI;
    public TextField letterO;
    public TextField letterU;
    public TextArea showTextField;

    public void initialize() {
        try {
            letterA.setText("0");
            letterE.setText("0");
            letterI.setText("0");
            letterO.setText("0");
            letterU.setText("0");

            Scanner sc = new Scanner(OpenExplorerView.getOpenedFile());
            while (sc.hasNext()) {
                showTextField.appendText(sc.nextLine());
            }
            sc = new Scanner(OpenExplorerView.getOpenedFile());
            while (sc.hasNext()){
                List<String> list = List.of(sc.nextLine().split(""));
                list.forEach(i ->{
                    switch (i) {
                        case "a", "A" -> letterA.setText(String.valueOf(Integer.parseInt(letterA.getText()) + 1));
                        case "e", "E" -> letterE.setText(String.valueOf(Integer.parseInt(letterE.getText()) + 1));
                        case "i", "I" -> letterI.setText(String.valueOf(Integer.parseInt(letterI.getText()) + 1));
                        case "o", "O" -> letterO.setText(String.valueOf(Integer.parseInt(letterO.getText()) + 1));
                        case "u", "U" -> letterU.setText(String.valueOf(Integer.parseInt(letterU.getText()) + 1));
                    }
                });
            }
            showTextField.setEditable(false);
            letterA.setEditable(false);
            letterE.setEditable(false);
            letterI.setEditable(false);
            letterO.setEditable(false);
            letterU.setEditable(false);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
