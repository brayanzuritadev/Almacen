/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.almacen.dao;

import conexionDB.ConexionServicioFabrica;

/**
 *
 * @author Brayan
 */
public class AlmacenDaoFabrica {
    public static IAlmacenDao construir(){
        var conexion = ConexionServicioFabrica.construir();
        return new AlmacenDao(conexion);
    }
}
