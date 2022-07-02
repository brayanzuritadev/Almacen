/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.producto;

import conexionDB.ConexionSQLServer;
import manejoProductos.categoria.dao.ICategoriaDao;
import manejoProductos.producto.dao.IProductoDao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Brayan
 */
public class ProductoServicio implements IProductoServicio {
    private IProductoDao productoDao;
    

    @Override
<<<<<<< Updated upstream
    public void registrar(manejoProductos.producto.Producto p) {

      /*  try {
            String SQL = "INSERT INTO Producto (idproducto ,nombre, descripcion,idCategoria,precioCompra,precioVenta,tipoGuardado)"
                    + "VALUES(?,?,?,?,?,?,?)";

            var con = conexion.getConexion();

            var ps = con.prepareStatement(SQL);
            ps.setString(1, p.getCodProducto());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getDescripcion());
            ps.setInt(4, p.getIdCategoria());
            ps.setDouble(5, p.getpCompra());
            ps.setDouble(6, p.getpCompra());
            ps.setString(7, p.gettGuardado());
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        conexion.cerrarConexion();*/
    }

    @Override
    public void modificar(manejoProductos.producto.Producto p) {
       /* try {
            System.out.println(p.getNombre());
            String sql = "UPDATE Producto "
                    + "SET nombre = ?,"
                    + "descripcion = ?, "
                    + "idCategoria = ?, "
                    + "precioCompra = ?, "
                    + "precioVenta = ?, "
                    + "tipoGuardado = ? "
                    + "WHERE idProducto = ?";

            var con = conexion.getConexion();

            var ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setInt(3, p.getIdCategoria());
            ps.setDouble(4, p.getpCompra());
            ps.setDouble(5, p.getpVenta());
            ps.setString(6, p.gettGuardado());
            ps.setString(7, p.getCodProducto());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();*/
    }

    @Override
    public ArrayList<manejoProductos.producto.Producto> obtenerProductos() {
       /* 
        var resultado = new ArrayList<manejoProductos.producto.Producto>();
        try {
            String sql = "SELECT * FROM Producto";

            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(sql);
            var resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                var p = new manejoProductos.producto.Producto();
                
                p.setCodProducto(resultSet.getString("idProducto"));
                p.setNombre(resultSet.getString("nombre"));
                p.setDescripcion(resultSet.getString("descripcion"));
                p.setIdCategoria(resultSet.getInt("idCategoria"));
                p.setpCompra(resultSet.getDouble("precioCompra"));
                p.setpVenta(resultSet.getDouble("precioVenta"));
                p.settGuardado(resultSet.getString("tipoGuardado"));
                resultado.add(p);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();*/

        return null;    
    }

    @Override
    public ArrayList<manejoProductos.producto.Producto> buscarProducto(String valor) {
        /*var resultado = new ArrayList<manejoProductos.producto.Producto>();
        try{
            String sql = "SELECT * FROM Producto " 
                    +"WHERE (nombre LIKE '%"+ valor + "%') OR (idProducto LIKE '%"+ valor + "%')" ;
            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(sql);
            var resultSet = prepareStatement.executeQuery();
            
            while (resultSet.next()) {
                var p = new Producto();
                
                p.setCodProducto(resultSet.getString("idProducto"));
                p.setNombre(resultSet.getString("nombre"));
                p.setDescripcion(resultSet.getString("descripcion"));
                p.setIdCategoria(resultSet.getInt("idCategoria"));
                p.setpCompra(resultSet.getDouble("precioCompra"));
                p.setpVenta(resultSet.getDouble("precioVenta"));
                p.settGuardado(resultSet.getString("tipoGuardado"));
                resultado.add(p);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();*/
        return null;
=======
    public void registrar(Producto p) {
        productoDao.guardar(p);
    }

    @Override
    public void modificar(Producto p) {
        productoDao.modificar(p);
    }

    @Override
    public ArrayList<Producto> obtenerProductos() {
        return productoDao.obtener();
    }

    @Override
    public ArrayList<Producto> buscarProducto(String valor) {
        return productoDao.buscar(valor);
>>>>>>> Stashed changes
    }
}
