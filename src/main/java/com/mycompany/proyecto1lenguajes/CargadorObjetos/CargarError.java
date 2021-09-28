/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.CargadorObjetos;

import com.mycompany.proyecto1lenguajes.AlmacenadorReportes.*;
import static com.mycompany.proyecto1lenguajes.RegistroTablas.MovilizadorDatos.movilizar;
import static com.mycompany.proyecto1lenguajes.frames.Inicio.errorEstablecido;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Mariano
 */
public class CargarError {
    public ArrayList<ReporteErrorObjeto> cargarReporte() throws FileNotFoundException,IOException,ClassNotFoundException{
        //definimos los espacios que ocupara en nuestro error al ser creado
        String fila=movilizar.getFila()+"";
        String columna=movilizar.getColumna()+"";
        String espacio[]={movilizar.getCadenaUsada(),fila,columna};
        ReporteErrorObjeto error = CrearError.crearError(espacio);
        errorEstablecido.add(error);//agreagamos un nuevo error
        return errorEstablecido;
    }
}
