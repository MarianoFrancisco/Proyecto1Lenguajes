/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.Automatas;

import javax.swing.JTextArea;

/**
 *
 * @author Mariano
 */
public class NumeroDecimal {
    //creamos matriz, 0 es digito,1 es punto,error es 2
    //estado 0 es 0, estado 1 es 1, estado 2 es 2, estado 3 es 3, 
    static int matriz[][]=new int [4][4];
    {
        matriz[0][0]=2;
        matriz[0][1]=0;
        matriz[0][2]=2;
        matriz[0][3]=2;
        matriz[1][0]=2;
        matriz[1][1]=0;
        matriz[1][2]=1;
        matriz[1][3]=2;
        matriz[2][0]=2;
        matriz[2][1]=2;
        matriz[2][2]=2;
        matriz[2][3]=0;
        matriz[3][0]=2;
        matriz[3][1]=2;
        matriz[3][2]=2;
        matriz[3][3]=0;
    }
    boolean lectura=true;
    int caracter=0, iterador = 0,estadoPresente=0, estadoIr=0,resultado=0;//enteros
    char [] caract;//caracter

    public static void numeroDecimalInicio(String linea,JTextArea movimiento){
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
        String verPunto=Character.toString(caracter);
        if(Character.isDigit(caracter)){
                resultado=0;
            }else if(verPunto.equals(".")){
                resultado=1;
        }
        return resultado;
    }
    public void inicializacion(String linea,JTextArea movimiento){
        caract=linea.toCharArray();//formato matriz
        estadoPresente=0;
        while((lectura)&&iterador<linea.length()&&resultado!=2){
            if(Character.isSpaceChar(caract[iterador])){
                lectura=false;
            }else{
                estadoIr= conseguirSiguiente(estadoPresente,comprobarExistencia(caract[iterador]));
                movimiento.setText(movimiento.getText()+"Me movi de estado --> "+estadoPresente+" hacia --> "+estadoIr+" con caracter: "+caract[iterador]+"\n");
                estadoPresente=estadoIr;
        }
        if(resultado==2){
            movimiento.setText(movimiento.getText()+"Error");
        }
        iterador++;
        }
        
    }
}
