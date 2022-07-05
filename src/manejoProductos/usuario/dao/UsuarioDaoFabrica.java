package manejoProductos.usuario.dao;

import conexionDB.ConexionServicioFabrica;
import conexionDB.IConexionServicio;

public class UsuarioDaoFabrica {
    public static IUsuarioDao construir(){
        IConexionServicio con = ConexionServicioFabrica.construir();
        return new UsuarioDao(con);
    }
}
