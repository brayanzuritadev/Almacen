package manejoProductos.almacen;

import conexionDB.ConexionSQLServer;

import java.sql.SQLException;
import java.util.ArrayList;
import manejoProductos.almacen.dao.AlmacenDaoFabrica;
import manejoProductos.almacen.dao.IAlmacenDao;

public class AlmacenServicio implements IAlmacenServicio{
    IAlmacenDao almacenDao = AlmacenDaoFabrica.construir();

    @Override
    public void registrar(Almacen almacen) {
        almacenDao.guardar(almacen);
    }

    @Override
    public void modificar(Almacen almacen) {
        almacenDao.modificar(almacen);
    }

    @Override
    public ArrayList<Almacen> obtenerCategorias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
