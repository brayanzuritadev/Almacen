/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.almacen.dao;

import conexionDB.ConexionServicioFabrica;
import conexionDB.IConexionServicio;
import java.sql.SQLException;
import java.util.ArrayList;
import manejoProductos.almacen.Almacen;

/**
 *
 * @author Brayan
 */
public class AlmacenDao implements IAlmacenDao {

    private IConexionServicio conexion;
    
    public AlmacenDao(IConexionServicio conexion) {
        this.conexion = conexion;
    }
            
    @Override
    public void guardar(Almacen almacen) {
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
            ps.setInt(4, almacen.getIdAlmacen());
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
    }

    @Override
    public ArrayList<Almacen> obtenerAlmacen() {
        var resultado = new ArrayList<Almacen>();
        try{
            String sql = "SELECT * FROM Almacen";
            var con = conexion.getConexion();
            var preparedStatemt = con.prepareStatement(sql);
            var resultSet = preparedStatemt.executeQuery();
            
            while(resultSet.next()){
                var almacen = new Almacen();
                almacen.setIdAlmacen(resultSet.getInt(1));
                almacen.setNombre(resultSet.getString(2));
                almacen.setUbicacion(resultSet.getString(3));
                almacen.setTelefono(resultSet.getString(4));
                almacen.settAlmacen(resultSet.getString(5));
                resultado.add(almacen);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
                return resultado;
        
    }

    @Override
    public ArrayList<Almacen> buscarAlmacen(String nombre) {
        var resultado = new ArrayList<Almacen>();
        try{
            String sql = "SELECT * FROM Almacen WHERE nombre = ?";
            var con = conexion.getConexion();
            var preparedStatemt = con.prepareStatement(sql);
            preparedStatemt.setString(1, nombre);
            var resultSet = preparedStatemt.executeQuery();
            
            while(resultSet.next()){
                var almacen = new Almacen();
                almacen.setIdAlmacen(resultSet.getInt(1));
                almacen.setNombre(resultSet.getString(2));
                almacen.setUbicacion(resultSet.getString(3));
                almacen.setTelefono(resultSet.getString(4));
                almacen.settAlmacen(resultSet.getString(5));
                resultado.add(almacen);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
                return resultado;    
    }
    
}
