/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.pablo.mvc.controlador;

import com.pablo.mvc.modelo.ConversorEurosPesetas;
import com.pablo.mvc.vista.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pablo
 * @version 1.0
 * Fecha 13 sept 2024
 */
public class ControlConversor implements ActionListener{
    
    private final InterfazVista vista;
    private final ConversorEurosPesetas modelo;

    public ControlConversor(InterfazVista vista, ConversorEurosPesetas modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.setControlador(this);
        this.vista.arranca();
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        double cantidad = vista.getCantidad();
        
        switch (evento.getActionCommand()){
            case InterfazVista.AEUROS -> vista.escribeCambio(cantidad + " pesetas son: "+ modelo.pesetasAeuros(cantidad) + " euros");
            case InterfazVista.APESETAS -> vista.escribeCambio(cantidad + " euros son: "+ modelo.euroApesetas(cantidad) + " pesetas");
            default -> vista.escribeCambio("Error en la conversion");
        }
    }
    
}
