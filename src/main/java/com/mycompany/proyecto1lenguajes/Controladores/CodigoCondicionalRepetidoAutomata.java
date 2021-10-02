/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.Controladores;

import com.mycompany.proyecto1lenguajes.Automatas.*;
import static com.mycompany.proyecto1lenguajes.Controladores.DatosInstanciadores.instanciadores;
import static com.mycompany.proyecto1lenguajes.Controladores.MovilizadorDatos.movilizar;
import static com.mycompany.proyecto1lenguajes.frames.Inicio.MovimientoEstado;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Mariano
 */
public class CodigoCondicionalRepetidoAutomata {
    public static void codigoAutomataRepitencia(String linea, char verificadorLinea,String reduccionLinea,int caracteresUsados,JTextArea MovilizadorDatos){
        verificadorLinea=reduccionLinea.charAt(0);
        if (Character.isSpaceChar(verificadorLinea)) {
            verificadorLinea=reduccionLinea.charAt(1);
        }
        String comprobarPunto=Character.toString(verificadorLinea);
        if(Character.isLetter(verificadorLinea)){
            Identificador.identificadorInicio(reduccionLinea,MovimientoEstado);
            reduccionLinea=linea.substring(movilizar.getCaracteresUsados(), linea.length());
        }else if(Character.isDigit(verificadorLinea)){
            NumeroDecimal.numeroDecimalInicio(reduccionLinea, MovimientoEstado);
            reduccionLinea=linea.substring(movilizar.getCaracteresUsados(), linea.length());
        }else if(comprobarPunto.equals("+")|comprobarPunto.equals("-")|comprobarPunto.equals("*")|comprobarPunto.equals("/")|comprobarPunto.equals("%")){
            Operador.operadorInicio(reduccionLinea, MovimientoEstado);
            reduccionLinea=linea.substring(movilizar.getCaracteresUsados(), linea.length());
        }else if(comprobarPunto.equals(".")|comprobarPunto.equals(",")|comprobarPunto.equals(";")|comprobarPunto.equals(":")){
            Puntuacion.puntuacionInicio(reduccionLinea, MovimientoEstado);
            reduccionLinea=linea.substring(movilizar.getCaracteresUsados(), linea.length());
        }else if(comprobarPunto.equals("(")|comprobarPunto.equals(")")|comprobarPunto.equals("[")|comprobarPunto.equals("]")|comprobarPunto.equals("{")|comprobarPunto.equals("}")){
            Agrupacion.agrupacionInicio(reduccionLinea, MovimientoEstado);
            reduccionLinea=linea.substring(movilizar.getCaracteresUsados(), linea.length());
        }
        instanciadores.setLinea(linea);
        instanciadores.setReduccionLinea(reduccionLinea);
        instanciadores.setVerificadorLinea(verificadorLinea);
    }
}
