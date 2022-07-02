package manejoProductos.producto;

import manejoProductos.categoria.dao.CategoriaDaoFabrica;
import manejoProductos.categoria.dao.ICategoriaDao;
import manejoProductos.producto.dao.IProductoDao;
import manejoProductos.producto.dao.ProductoDaoFabrica;

import java.util.ArrayList;

public class ProductoServicio implements IProductoServicio{

    IProductoDao productoDao = ProductoDaoFabrica.construir();
    @Override
    public void registrar(Producto p) {
        productoDao.guardar(p);
    }

    @Override
    public void modificar(Producto p) {
        productoDao.modificar(p);
    }

    @Override
    public ArrayList<Producto> obtenerProductos() {
        return productoDao.obtener();
    }

    @Override
    public ArrayList<Producto> buscarProductos(String valor) {
        return productoDao.buscar(valor);
    }
}
