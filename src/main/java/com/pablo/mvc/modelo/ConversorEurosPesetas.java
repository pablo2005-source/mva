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
public class ConversorEurosPesetas extends Conversor{

    public ConversorEurosPesetas() {
        super(166.386D);
    }

    public double euroApesetas(double cantidad) {
        return euroAmoneda(cantidad); 
    }

    public double pesetasAeuros(double cantidad) {
        return monedaAeuros(cantidad);
    }

    
    
    
    
}
