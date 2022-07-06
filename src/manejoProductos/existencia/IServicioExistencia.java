package manejoProductos.existencia;

import manejoProductos.almacen.Almacen;

import java.util.ArrayList;
import manejoProductos.producto.Producto;

public interface IServicioExistencia {
    public ArrayList<Existencia> obteerExistencia();
    public void registrarExistencia(Existencia e, ArrayList<Almacen> a);
    public Existencia buscarExistenciaByIds(int idAlmacen, String idProducto);
    public void registrarExistenciaAlmacen(Existencia e, ArrayList<Producto> p);
    
    public void actualizarExistencia(Existencia e);
}
