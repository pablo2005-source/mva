/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pablo.mvc;

import com.pablo.mvc.vista.InterfazVista;
import com.pablo.mvc.controlador.ControlConversor;
import com.pablo.mvc.modelo.ConversorEurosPesetas;
/**
 *
 * @author Pablo
 */
import com.pablo.mvc.vista.VentanaConversor;
public class Mvc {

    public static void main(String[] args) {
        InterfazVista vista = new VentanaConversor();
        ConversorEurosPesetas modelo = new ConversorEurosPesetas();
        ControlConversor control = new ControlConversor(vista, modelo);
    }
}
