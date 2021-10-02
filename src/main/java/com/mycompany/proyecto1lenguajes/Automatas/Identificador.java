/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.Automatas;

import static com.mycompany.proyecto1lenguajes.Controladores.MovilizadorDatos.movilizar;
import static com.mycompany.proyecto1lenguajes.frames.Inicio.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Mariano
 */
public class Identificador {
    //creamos matriz, 0 es letra, 1 es digito
    //estado 0 es 0, estado 1 es 1, 2 es error
    static int matriz[][]=new int [2][2];
    String identificadorTotal="";
    {
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[1][0]=1;
        matriz[1][1]=1;
    }
    boolean lectura=true;
    int caracter=0, iterador = 0,estadoPresente=0, estadoIr=0,resultado=0,enviarReporte=0;//enteros
    char [] caract;//caracter

    public static void identificadorInicio(String linea,JTextArea movimiento){
        //incializamos  y creamos valores
        Identificador id = new Identificador();
        id.inicializacion(linea,movimiento);
        
    }
    public int conseguirSiguiente(int estadoPasable,int caracter){
        resultado=2;
        //verificamos caracter
        if(caracter>=0&&caracter<=1){
            resultado = matriz[estadoPasable][caracter];
        }   
        return resultado;
    }
    public int comprobarExistencia(char caracter){
        resultado=2;
        if(Character.isLetter(caracter)){
                resultado=0;
            }else if(Character.isDigit(caracter)){
                resultado=1;
            }
        return resultado;
    }
    public void inicializacion(String linea,JTextArea movimiento){
        enviarReporte=0;
        identificadorTotal="";
        iterador=0;
        caract=linea.toCharArray();//formato matriz
        estadoPresente=0;
        while((lectura)&&iterador<linea.length()&&resultado!=2){
            if(Character.isSpaceChar(caract[iterador])){
                if(iterador==0){
                }else{
                    lectura=false;
                }
            }else{
                estadoIr= conseguirSiguiente(estadoPresente,comprobarExistencia(caract[iterador]));
                movimiento.setText(movimiento.getText()+"Me movi de estado --> "+estadoPresente+" hacia --> "+estadoIr+" con caracter: "+caract[iterador]+"\n");
                estadoPresente=estadoIr;
        }
        if(resultado==2){
            movimiento.setText(movimiento.getText()+"Error \n");
            enviarReporte=1;
        }  
        identificadorTotal=identificadorTotal+Character.toString(caract[iterador]);
        
        iterador++;
        }
        movilizar.setColumna(iterador);
        movilizar.setCaracteresUsados(movilizar.getCaracteresUsados()+iterador);
        movilizar.setCadenaUsada(identificadorTotal.replaceAll(" ", ""));
        if(enviarReporte==1){
            try {
                cargarError.cargarReporte();
                movilizar.setCondiconalError(1);
            } catch (IOException ex) {
                Logger.getLogger(Identificador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Identificador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            movilizar.setTokenProviniente("Identificador");
            try {
                cargarLexema.cargarLexema();
                cargarToken.cargarToken();
            } catch (IOException ex) {
                Logger.getLogger(Identificador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Identificador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
