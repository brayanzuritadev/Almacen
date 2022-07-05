package manejoProductos.existencia.dao;

import conexionDB.IConexionServicio;
import java.sql.SQLException;
import manejoProductos.existencia.Existencia;

import java.util.ArrayList;

public class ExistenciaDao implements IExistenciaDao{
    private IConexionServicio conexion;

    public ExistenciaDao(IConexionServicio conexion) {
        this.conexion = conexion;
    }

    
    
    @Override
    public ArrayList<Existencia> obteerExistencia() {
        return null;
    }

    @Override
    public void registraExistencia(Existencia e) {
        try{
            
            String sql = "INSERT INTO Usuario(nombre,direccion,ci,telefono,password,email,idAlmacen)" +
                    " VALUES(?,?,?,?,?,?,?)";
            var con = conexion.getConexion();
            var ps = con.prepareStatement(sql);
            ps.setInt(1,e.getAlmacen().getIdAlmacen());
            ps.setString(2,e.getProducto().getCodProducto());
            ps.setInt(3,e.getCantidad());
            ps.setString(4,e.getUbicacion());
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
    }

    @Override
    public ArrayList<Existencia> buscarExistencia() {
        return null;
    }
}
