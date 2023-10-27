package com.example.bateriaejercicioscuatro.services;

import java.io.File;
import javax.swing.*;

public class FileService {

    public static File checkFile(File file) throws RuntimeException {
        if (file.getName().contains(".txt") || file.getName().contains(".xml")) {
            return file;
        } else {
            throw new RuntimeException("El archivo no es válido");
        }
    }

    public static void createFile(File file){
        try {
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog
                        (null,
                                "Archivo creado correctamente en el directorio: "
                                        + file.getAbsolutePath());
            }
        }catch (NullPointerException e){
            System.out.println("No se ha seleccionado ningún archivo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo");
        }
    }

}
