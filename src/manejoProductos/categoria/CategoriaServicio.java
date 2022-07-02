<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.categoria;

import manejoProductos.categoria.dao.ICategoriaDao;
import conexionDB.ConexionH2;
import conexionDB.ConexionSQLServer;
import java.sql.SQLException;
import java.util.ArrayList;
import manejoProductos.categoria.dao.CategoriaDaoFabrica;

/**
 *
 * @author Brayan
 */
public class CategoriaServicio implements ICategoriaServicio {

    ICategoriaDao categoriaDao = CategoriaDaoFabrica.Construir();
    
    @Override
    public void registrar(Categoria c) {
        categoriaDao.guardar(c);
    }

    @Override
    public void modificar(Categoria c) {
        categoriaDao.modificar(c);
    }

    

    @Override
    public ArrayList<Categoria> buscarCategoria(String nombre) {
        return categoriaDao.buscar(nombre);
    }

    @Override
    public ArrayList<Categoria> obtenerCategorias() {
        return categoriaDao.obtener();
    }

}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.categoria;

import manejoProductos.categoria.dao.ICategoriaDao;
import conexionDB.ConexionH2;
import conexionDB.ConexionSQLServer;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Brayan
 */
public class CategoriaServicio implements ICategoriaServicio {

   
    private ICategoriaDao categoriaDao;

    @Override
    public void registrar(Categoria c) {
        categoriaDao.guardar(c);
    }

    @Override
    public void modificar(Categoria c) {
        categoriaDao.modificar(c);
    }

    

    @Override
    public ArrayList<Categoria> buscarCategoria(String nombre) {
        return categoriaDao.buscar(nombre);
    }

    @Override
    public ArrayList<Categoria> obtenerCategorias() {
        return categoriaDao.obtener();
    }

}
>>>>>>> Stashed changes
