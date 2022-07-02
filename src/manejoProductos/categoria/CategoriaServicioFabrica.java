/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.categoria;

import manejoProductos.categoria.dao.CategoriaDaoFabrica;
import conexionDB.ConexionH2;
import conexionDB.ConexionSQLServer;
import manejoProductos.categoria.CategoriaServicio;
import manejoProductos.categoria.ICategoriaServicio;

/**
 *
 * @author Brayan
 */
public class CategoriaServicioFabrica {
    public static ICategoriaServicio Construir(){
            
       
        var categoriaDao = CategoriaDaoFabrica.Construir();
        return new CategoriaServicio();
    }
}
