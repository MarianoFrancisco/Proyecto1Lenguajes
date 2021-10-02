/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.CargadorObjetos;

import com.mycompany.proyecto1lenguajes.AlmacenadorReportes.*;
import static com.mycompany.proyecto1lenguajes.Controladores.MovilizadorDatos.movilizar;
import static com.mycompany.proyecto1lenguajes.frames.Inicio.tokenEstablecido;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Mariano
 */
public class CargarToken {
    public ArrayList<ReporteTokensObjeto> cargarToken() throws FileNotFoundException,IOException,ClassNotFoundException{
        //definimos los espacios que ocupara en nuestro error al ser creado
        int procesoReduccionColumna=movilizar.getCaracteresUsados()-movilizar.getCadenaUsada().length();
        String nombreToken=movilizar.getTokenProviniente();
        String lexema=movilizar.getCadenaUsada();
        String fila=movilizar.getFila()+"";
        String columna=procesoReduccionColumna+"";
        if (columna.equals("0")) {
            columna="1";
        }
        String espacio[]={nombreToken,lexema,fila,columna};
        ReporteTokensObjeto tokens = CrearToken.crearToken(espacio);
        tokenEstablecido.add(tokens);//agreagamos un nuevo token
        return tokenEstablecido;
    }
}
