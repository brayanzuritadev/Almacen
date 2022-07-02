package manejoProductos.almacen;

import conexionDB.ConexionSQLServer;

import java.sql.SQLException;

public class ServicioAlmacen implements IAlmacenServicio{
    private ConexionSQLServer conexion;

    public ServicioAlmacen(ConexionSQLServer conexion) {
        this.conexion = conexion;
    }

    @Override
    public void registrar(Almacen almacen) {
        try{
            String sql="INSERT INTO Almacen (nombre,ubicacion,telefono,tipoAlmacen)"
                    + "VALUES(?,?,?,?)";
            var con =conexion.getConexion();
            var ps=con.prepareStatement(sql);
            ps.setString(1,almacen.getNombre());
            ps.setString(2,almacen.getUbicacion());
            ps.setString(3,almacen.getTelefono());
            ps.setString(4,"Segundario");
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
    }

    @Override
    public void modificar(Almacen almacen) {
        try{
            String sql="UPDATE Almacen "
                    + "SET nombre = ?,"
                    + "ubicacion = ?, "
                    + "telefono = ?, "
                    + "WHERE idProducto = ?";
            var con =conexion.getConexion();
            var ps=con.prepareStatement(sql);
            ps.setString(1,almacen.getNombre());
            ps.setString(2,almacen.getUbicacion());
            ps.setString(3,almacen.getTelefono());
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
    }
}
