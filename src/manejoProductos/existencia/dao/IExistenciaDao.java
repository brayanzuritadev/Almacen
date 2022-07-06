package manejoProductos.existencia.dao;

import manejoProductos.almacen.Almacen;
import manejoProductos.existencia.Existencia;

import java.util.ArrayList;
import manejoProductos.producto.Producto;

public interface IExistenciaDao {
    public ArrayList<Existencia> obteerExistencia();
    public void registrarExistencia(Existencia e, ArrayList<Almacen> a);
    public ArrayList<Existencia> buscarExistencia();
    public void registrarExistenciaAlmacen(Existencia e,ArrayList<Producto> p);
    
    public Existencia buscarExistenciaByIds(int idAlmacen, String idProducto);
    public void actualizarExistencia(Existencia e);
}
