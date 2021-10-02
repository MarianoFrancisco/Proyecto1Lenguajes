/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes;

import com.mycompany.proyecto1lenguajes.Controladores.DatosInstanciadores;
import com.mycompany.proyecto1lenguajes.Controladores.MovilizadorDatos;
import com.mycompany.proyecto1lenguajes.frames.Inicio;



/**
 *
 * @author Mariano
 */
public class PracticaLenguajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clase principal y llamamos el frame
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MovilizadorDatos.crearMovilizador();
                DatosInstanciadores.crearDatosInstanciadores();
                new Inicio().setVisible(true);
            }
        });
    }
    
}
