/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.categoria.dao;

import conexionDB.ConexionServicioFabrica;
import conexionDB.IConexionServicio;

/**
 *
 * @author Brayan
 */
public class CategoriaDaoFabrica {
    public static ICategoriaDao Construir(){
        IConexionServicio con = ConexionServicioFabrica.construir();
        return new CategoriaDao(con);
    }
}
