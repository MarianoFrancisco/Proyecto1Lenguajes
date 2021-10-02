/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.CargadorObjetos;

import com.mycompany.proyecto1lenguajes.AlmacenadorReportes.CrearError;
import com.mycompany.proyecto1lenguajes.AlmacenadorReportes.*;
import static com.mycompany.proyecto1lenguajes.Controladores.MovilizadorDatos.movilizar;
import static com.mycompany.proyecto1lenguajes.frames.Inicio.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Mariano
 */
public class CargarLexema {
    public ArrayList<RecuentoLexemaObjeto> cargarLexema() throws FileNotFoundException,IOException,ClassNotFoundException{
        int verificarExistencia=0;
        //definimos los espacios que ocupara en nuestro error al ser creado
        String lexema=movilizar.getCadenaUsada()+"";
        String token=movilizar.getTokenProviniente();
        for (int i = 0; i < lexemaEstablecido.size(); i++) {
            if (lexemaEstablecido.get(i).getLexema().equals(lexema)) {
                lexemaEstablecido.get(i).setCantidad(lexemaEstablecido.get(i).getCantidad()+1);
                verificarExistencia=1;
            }  
        }
        if(verificarExistencia==0){
            String espacio[]={lexema,token,"1"};
            RecuentoLexemaObjeto lexemas = CrearLexema.crearLexema(espacio);
            lexemaEstablecido.add(lexemas);//agreagamos un nuevo lexema
        }

        return lexemaEstablecido;
    }
}
