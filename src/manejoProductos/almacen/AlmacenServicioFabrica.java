/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.almacen;

/**
 *
 * @author Brayan
 */
public class AlmacenServicioFabrica {
    public static IAlmacenServicio construir(){
    return new AlmacenServicio();
    }
}
