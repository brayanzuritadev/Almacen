/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.transaccion.dao;

import conexionDB.IConexionServicio;
import java.sql.SQLException;
import java.util.ArrayList;
import manejoProductos.almacen.Almacen;
import manejoProductos.categoria.Categoria;
import manejoProductos.existencia.Existencia;
import manejoProductos.existencia.IServicioExistencia;
import manejoProductos.existencia.ServicioExistenciaFabrica;
import manejoProductos.producto.Producto;
import manejoProductos.transaccion.Transaccion;
import manejoProductos.usuario.Usuario;
import manejoProductos.validador.Validador;

/**
 *
 * @author Brayan
 */
public class TransaccionDao implements ITransaccionDao {
    private IConexionServicio conexion;

    public TransaccionDao(IConexionServicio conexin) {
        this.conexion = conexin;
    }
    
    @Override
    public void registrarTransaccion(Transaccion t) {
        try{
            
            String sql = "INSERT INTO Transaccion(idAlmacen,idProducto,idUsuario,cantidad,totalTrasaccion, destino, tTransaccion)" +
                    " VALUES(?,?,?,?,?,?,?)";
            var con = conexion.getConexion();
            var ps = con.prepareStatement(sql);
            ps.setInt(1,t.getAlmacen().getIdAlmacen());
            ps.setString(2,t.getProdcuto().getCodProducto());
            ps.setInt(3,t.getUsuario().getIdUsuario());
            ps.setInt(4,t.getCantidad());
            ps.setDouble(5,t.getTotalTransaccion());
            ps.setString(6,t.getDestino());
            ps.setString(7,t.gettTransaccion());
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
        conexion.cerrarConexion();
        
        
    }

    @Override
    public ArrayList<Transaccion> obtenerTransaccion(String tipo) {
        var resultado = new ArrayList<Transaccion>();
        try {
                
                String sql = "Select idTransaccion, a.nombre, p.idProducto, p.nombre, p.Descripcion, p.preciocompra, c.nombre"
                        + ",t.cantidad, t.totalTrasaccion, t.tTransaccion, u.nombre u.idUsuario from Transaccion as t  "
                        + "inner join Producto as p "
                        + "on p.idProducto=t.idProducto "
                        + "inner join Categoria as c "
                        + "on c.idCategoria =p.IdCategoria "
                        + "inner join Usuario as u " 
                        + "on t.idUsuario=u.idUsuario "
                        + "inner join Almacen as a " 
                        + "on t.idAlmacen =a.IdAlmacen ";
                
                        if(Validador.getUsuario().getAlmacen().gettAlmacen().equals("Principal") && tipo == "Entrada"){
                            sql= sql + "where t.tTransaccion = 'Entrada' "; 
                        }if(Validador.getUsuario().getAlmacen().gettAlmacen().equals("Principal") && tipo == "Salida"){
                            sql= sql + "where t.tTransaccion = 'Salida' ";
                        }if(Validador.getUsuario().getAlmacen().gettAlmacen().equals("Secundario") && tipo == "Entrada"){
                            sql= sql + "where t.tTransaccion = 'Entrada' and WHERE u.idUsuario = " + Validador.getUsuario().getIdUsuario() ;
                        }if(Validador.getUsuario().getAlmacen().gettAlmacen().equals("Secundario") && tipo == "Salida"){
                            sql= sql + "where t.tTransaccion = 'Salida' and WHERE u.idUsuario = " + Validador.getUsuario().getIdUsuario() ;
                        }
                        
                        
            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(sql);
            var resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                var p = new Producto();
                var t = new Transaccion();
                var c = new Categoria();
                
                t.setCantidad(resultSet.getInt(1));
                c.setNombre(resultSet.getString(2));
                p.setCategoria(c);
                t.setProdcuto(p);
                resultado.add(t);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();

        return resultado;
    }

    @Override
    public ArrayList<Transaccion> buscarTransaccion(String valor, String tipo) {
        var resultado = new ArrayList<Transaccion>();
        try {
               
                String sql = "Select cantidad, c.nombre  from Transaccion as t  "
                        + "inner join Producto as p "
                        + "on p.idProducto=t.idProducto "
                        + "inner join Categoria as c "
                        + "on c.idCategoria =p.IdCategoria "
                        + "Where tTransaccion ="+ tipo;
                        
            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(sql);
            var resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                var p = new Producto();
                var t = new Transaccion();
                var c = new Categoria();
                
                t.setCantidad(resultSet.getInt(1));
                c.setNombre(resultSet.getString(2));
                p.setCategoria(c);
                t.setProdcuto(p);
                resultado.add(t);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();

        return resultado;
    }
    
    
}
