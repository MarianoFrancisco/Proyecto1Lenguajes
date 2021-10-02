/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.Automatas;


import static com.mycompany.proyecto1lenguajes.Controladores.MovilizadorDatos.movilizar;
import static com.mycompany.proyecto1lenguajes.frames.Inicio.cargarError;
import static com.mycompany.proyecto1lenguajes.frames.Inicio.cargarLexema;
import static com.mycompany.proyecto1lenguajes.frames.Inicio.cargarToken;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Mariano
 */
public class NumeroDecimal {
    //creamos matriz, 0 es digito,1 es punto,3 es error 
    //estado 0 es 0, estado 1 es 1, estado 2 es 2, estado 3 es 3, 4 es error
    static int matriz[][]=new int [4][2];
    String numeroDecimalTotal="";
    {
        matriz[0][0]=1;
        matriz[0][1]=4;
        matriz[1][0]=1;
        matriz[1][1]=2;
        matriz[2][0]=3;
        matriz[2][1]=4;
        matriz[3][0]=3;
        matriz[3][1]=4;
    }
    boolean lectura=true;
    int caracter=0, iterador = 0,estadoPresente=0, estadoIr=0,resultado=0,enviarReporte=0;//enteros
    char [] caract;//caracter
    
    public static void numeroDecimalInicio(String linea,JTextArea movimiento){
        //incializamos  y creamos valores
        NumeroDecimal numeroDecimal = new NumeroDecimal();
        numeroDecimal.inicializacion(linea,movimiento);
        
    }
    public int conseguirSiguiente(int estadoPasable,int caracter){
        resultado=4;
        //verificamos caracter
        if(caracter>=0&&caracter<=1){
            resultado = matriz[estadoPasable][caracter];
        }   
        return resultado;
    }
    public int comprobarExistencia(char caracter){
        resultado=4;
        String comprobarPunto=Character.toString(caracter);
        if(Character.isDigit(caracter)){
                resultado=0;
        }
        else if(comprobarPunto.equals(".")){
                if (numeroDecimalTotal.contains(".")) {
                    resultado=4;
                }else{
                    resultado=1;
                }
        }
        return resultado;
    }
    public void inicializacion(String linea,JTextArea movimiento){
        enviarReporte=0;
        numeroDecimalTotal="";
        iterador=0;
        caract=linea.toCharArray();//formato matriz
        estadoPresente=0;
        while((lectura)&&iterador<linea.length()&&resultado!=4){
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
        
        if(resultado==4){
            movimiento.setText(movimiento.getText()+"Error numero decimal \n");
            enviarReporte=1;
        }
        numeroDecimalTotal=numeroDecimalTotal+Character.toString(caract[iterador]);
        
        iterador++;
        }
        String comprobarPunto=Character.toString(caract[iterador-1]);
        if(comprobarPunto.equals(".")){
            enviarReporte=1;
        }
        movilizar.setColumna(iterador);
        movilizar.setCaracteresUsados(movilizar.getCaracteresUsados()+iterador);
        movilizar.setCadenaUsada(numeroDecimalTotal.replaceAll(" ", ""));
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
            if (numeroDecimalTotal.contains(".")) {
                    movilizar.setTokenProviniente("Decimal");
            }else{
                    movilizar.setTokenProviniente("Numero");
            }  
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
