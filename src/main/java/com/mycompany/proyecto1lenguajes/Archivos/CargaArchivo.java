/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author Mariano
 */
public class CargaArchivo {
    public void leer(File archivo, JTextArea texto) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileReader leerA = new FileReader(archivo);
        BufferedReader leerTA = new BufferedReader(leerA);
        String linea;
        while ((linea = leerTA.readLine()) != null) {
            texto.append(linea+"\n");
        }
    }
}
