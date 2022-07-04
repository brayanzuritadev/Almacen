package manejoProductos.producto.dao;

import manejoProductos.categoria.Categoria;
import manejoProductos.producto.Producto;

import java.util.ArrayList;
import manejoProductos.producto.Producto;

public interface IProductoDao {
    public void guardar(Producto p);
    public void modificar(Producto p);
    public ArrayList<Producto> obtener();
    public ArrayList<Producto> buscar(String nombre);
}
