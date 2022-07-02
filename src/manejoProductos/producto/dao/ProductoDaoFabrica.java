package manejoProductos.producto.dao;

import conexionDB.ConexionServicioFabrica;
import conexionDB.IConexionServicio;

public class ProductoDaoFabrica {
    public IProductoDao construir(){
<<<<<<< Updated upstream
        var con =new ConexionServicioFabrica();
        return null;
=======
        IConexionServicio conexion = ConexionServicioFabrica.construir();
        return new ProductoDao(conexion);
>>>>>>> Stashed changes
    }
}
