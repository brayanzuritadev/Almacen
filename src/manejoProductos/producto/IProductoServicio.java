/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package manejoProductos.producto;

import java.util.ArrayList;

/**
 *
 * @author Brayan
 */
public interface IProductoServicio {
    public void registrar(Producto p);
    public void modificar(Producto p);
    public ArrayList<Producto> obtenerProductos();
    public ArrayList<Producto> buscarProductos(String valor);
}
