/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.producto;

import manejoProductos.producto.ProductoServicio;
import manejoProductos.producto.IProductoServicio;

/**
 *
 * @author Brayan
 */
public class ProductoServicioFabrica {
    
    public static IProductoServicio Construir(){
        return new ProductoServicio();
    }
}
