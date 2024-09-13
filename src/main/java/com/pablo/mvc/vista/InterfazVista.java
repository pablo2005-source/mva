/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.pablo.mvc.vista;

import com.pablo.mvc.controlador.ControlConversor;

/**
 *
 * @author Pablo
 * @version 1.0 
 * Fecha 13 sept 2024
 */
public interface InterfazVista {
    void setControlador(ControlConversor c);
    
    void arranca();
    
    double getCantidad();
    
    void escribeCambio(String s);
    
    /**
     * Constantes para la operación
     */
    static final String AEUROS = "Pesetas a Euros";
    static final String APESETAS = "Euros a Pesetas";
    
}
