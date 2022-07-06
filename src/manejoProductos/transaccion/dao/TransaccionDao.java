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
            
            String sql = "INSERT INTO Transaccion(idAlmacen,idProducto,idUsuario,cantidad,totalTrasaccion,tTransaccion)" +
                    " VALUES(?,?,?,?,?,?)";
            var con = conexion.getConexion();
            var ps = con.prepareStatement(sql);
            ps.setInt(1,t.getAlmacen().getIdAlmacen());
            ps.setString(2,t.getProdcuto().getCodProducto());
            ps.setInt(3,t.getUsuario().getIdUsuario());
            ps.setInt(4,t.getCantidad());
            ps.setDouble(5,t.getTotalTransaccion());
            ps.setString(6,t.gettTransaccion());
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
                System.out.println("estamos aqui nueva");
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

    @Override
    public ArrayList<Transaccion> buscarTransaccion(String valor, String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
