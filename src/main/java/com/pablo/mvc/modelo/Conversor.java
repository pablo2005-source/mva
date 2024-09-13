/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.pablo.mvc.modelo;

/**
 *
 * @author Pablo
 * @version 1.0
 * Fecha 13 sept 2024
 */
public class Conversor {
    /**
     * Cantidad de la moneda destino a la cual equivale un euro
     */
    private final double cambio;

    public Conversor(double cambio) {
        this.cambio = cambio;
    }
    
    /**
     * 
     * @param cantidad  Cantidad de euross que quiero pasar a la nueva moneda
     * @return          Cantidad equivalente de la moneda destino
     */
    public double euroAmoneda(double cantidad){
        return cantidad*cambio;
    }
    
    /**
     * 
     * @param cantidad  Cantidad de la moneda que queremos pasar a €
     * @return          Cantidad equivalente a €
     */
    public double monedaAeuros(double cantidad){
        return cantidad/cambio;
    }
    
    
    
    
    
}
