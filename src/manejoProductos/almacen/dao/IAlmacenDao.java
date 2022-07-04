/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package manejoProductos.almacen.dao;

import java.util.ArrayList;
import manejoProductos.almacen.Almacen;


/**
 *
 * @author Brayan
 */
public interface IAlmacenDao {
    public void guardar(Almacen almacen);
    public void modificar(Almacen almacen);
    public ArrayList<Almacen> obtenerAlmacen();
}
