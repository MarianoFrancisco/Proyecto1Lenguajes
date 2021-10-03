/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.Controladores;

/**
 *
 * @author Mariano
 */
public class MovilizadorDatos {
    //creamos variables
    private int fila,columna,caracteresUsados,condiconalError,hayEspacio;
    private String cadenaUsada,tokenProviniente;
    public static MovilizadorDatos movilizar;
    //constructor para movilizarme mis datos entre clases

    public MovilizadorDatos(int fila, int columna, int caracteresUsados, int condiconalError, int hayEspacio, String cadenaUsada, String tokenProviniente) {
        this.fila = fila;
        this.columna = columna;
        this.caracteresUsados = caracteresUsados;
        this.condiconalError = condiconalError;
        this.hayEspacio = hayEspacio;
        this.cadenaUsada = cadenaUsada;
        this.tokenProviniente = tokenProviniente;
    }
    

    //creamos gets y sets para modificar y hacer llamados
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getCaracteresUsados() {
        return caracteresUsados;
    }

    public void setCaracteresUsados(int caracteresUsados) {
        this.caracteresUsados = caracteresUsados;
    }
    
    public String getCadenaUsada() {
        return cadenaUsada;
    }

    public void setCadenaUsada(String cadenaUsada) {
        this.cadenaUsada = cadenaUsada;
    }

    public String getTokenProviniente() {
        return tokenProviniente;
    }

    public void setTokenProviniente(String tokenProviniente) {
        this.tokenProviniente = tokenProviniente;
    }

    public int getCondiconalError() {
        return condiconalError;
    }

    public void setCondiconalError(int condiconalError) {
        this.condiconalError = condiconalError;
    }

    public int getHayEspacio() {
        return hayEspacio;
    }

    public void setHayEspacio(int hayEspacio) {
        this.hayEspacio = hayEspacio;
    }
    
    //estructuramos creador de un valor MovilizadorDatos inicializandolo
    public static void crearMovilizador(){
         movilizar= new MovilizadorDatos(0,0,0,0,0,"","");
    }
}
