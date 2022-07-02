package manejoProductos.producto.dao;

import conexionDB.ConexionServicioFabrica;
import conexionDB.IConexionServicio;

public class ProductoDaoFabrica {
    public static IProductoDao construir(){
        IConexionServicio conexion = ConexionServicioFabrica.construir();
        return new ProductoDao(conexion);
    }
}
