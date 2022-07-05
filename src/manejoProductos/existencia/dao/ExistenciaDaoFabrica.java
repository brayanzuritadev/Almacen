package manejoProductos.existencia.dao;

import conexionDB.ConexionServicioFabrica;
import conexionDB.IConexionServicio;
import manejoProductos.existencia.Existencia;

import java.util.ArrayList;

public class ExistenciaDaoFabrica {
    public static IExistenciaDao construir(){
        IConexionServicio con = ConexionServicioFabrica.construir();
        return new ExistenciaDao(con);
    }
}
