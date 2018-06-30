/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author turupawn
 */
public class Producto {
    String nombre;
    String categoria;
    int existencias;
    double precio;
    
    Producto(String nombre, String categoria, int existencias, double precio)
    {
        this.nombre = nombre;
        this.categoria = categoria;
        this.existencias = existencias;
        this.precio = precio;
    }

    Producto(String nombre, String categoria, double existencias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
