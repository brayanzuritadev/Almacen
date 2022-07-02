/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.categoria;

import manejoProductos.categoria.dao.CategoriaDaoFabrica;


/**
 *
 * @author Brayan
 */
public class CategoriaServicioFabrica {
    public static ICategoriaServicio Construir(){
        var categoriaDao = CategoriaDaoFabrica.construir();
        return new CategoriaServicio();
    }
}
