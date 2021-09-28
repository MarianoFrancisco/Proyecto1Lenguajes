/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.Archivos;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Mariano
 */
public class ExportarArchivo {
    public static void exportarParaExel(JTextArea CargaArchivo) {
        try {
            JFileChooser archivo = new JFileChooser(System.getProperty("C:"));
            archivo.showSaveDialog(null);
            if (archivo.getSelectedFile() != null) {
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                guardado.write(CargaArchivo.getText());
                JOptionPane.showMessageDialog(null, "El archivo fue guardado con éxito en la ruta establecida");
                }
        }
        } catch (IOException ex) {
        System.out.println("ex"+ex);
        }
        
    }
}
