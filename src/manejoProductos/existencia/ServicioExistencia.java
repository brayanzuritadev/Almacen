package manejoProductos.existencia;

import manejoProductos.almacen.Almacen;
import manejoProductos.existencia.dao.ExistenciaDaoFabrica;
import manejoProductos.existencia.dao.IExistenciaDao;

import java.util.ArrayList;
import manejoProductos.producto.Producto;

public class ServicioExistencia implements IServicioExistencia{
    private IExistenciaDao existenciaD = ExistenciaDaoFabrica.construir();
    @Override
    public ArrayList<Existencia> obteerExistencia() {
        return existenciaD.obteerExistencia();
    }

    @Override
    public void registrarExistencia(Existencia e, ArrayList<Almacen> a) {
            System.out.println("Estamos aqui"+a.size());
            existenciaD.registrarExistencia(e, a);
    }

    @Override
    public Existencia buscarExistenciaByIds(int idAlmacen, String idProducto) {
        return existenciaD.buscarExistenciaByIds(idAlmacen,idProducto);
    }

    @Override
    public void registrarExistenciaAlmacen(Existencia e, ArrayList<Producto> p) {
        existenciaD.registrarExistenciaAlmacen(e, p);
    }

    @Override
    public void actualizarExistencia(Existencia e) {
        existenciaD.actualizarExistencia(e);
    }

} 
