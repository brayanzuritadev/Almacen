package manejoProductos.existencia.dao;

import conexionDB.IConexionServicio;
import java.sql.SQLException;

import manejoProductos.almacen.Almacen;
import manejoProductos.existencia.Existencia;

import java.util.ArrayList;
import manejoProductos.categoria.Categoria;
import manejoProductos.producto.Producto;

public class ExistenciaDao implements IExistenciaDao{
    private IConexionServicio conexion;

    public ExistenciaDao(IConexionServicio conexion) {
        this.conexion = conexion;
    }

    
    
    @Override
    public ArrayList<Existencia> obteerExistencia() {
        var resultado = new ArrayList<Existencia>();
        try {
                System.out.println("estamos aqui nueva");
                String sql = "Select a.nombre, a.tipoalmacen, p.idProducto, p.nombre, p.descripcion, c.nombre, p.precioCompra, p.precioVenta, p.tipoguardado, e.ubicacion, e.cantidad, a.idAlmacen from Existencia as e "
                        + "inner join Almacen as a "
                        + "on a.idAlmacen=e.idAlmacen "
                        + "inner join Producto as p "
                        + "on e.idProducto = p.idProducto "
                        + "inner join Categoria as c " 
                        + "on p.idCategoria=c.IdCategoria";
            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(sql);
            var resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                var p = new Producto();
                var e = new Existencia();
                var a = new Almacen();
                var c = new Categoria();
                
                a.setNombre(resultSet.getString(1));
                a.settAlmacen(resultSet.getString(2));
                p.setCodProducto(resultSet.getString(3));
                p.setNombre(resultSet.getString(4));
                p.setDescripcion(resultSet.getString(5));
                c.setNombre(resultSet.getString(6));
                p.setpCompra(resultSet.getDouble(7));
                p.setpVenta(resultSet.getDouble(8));
                p.settGuardado(resultSet.getString(9));
                e.setUbicacion(resultSet.getString(10));
                e.setCantidad(resultSet.getInt(11));
                a.setIdAlmacen(resultSet.getInt(12));
                p.setCategoria(c);
                e.setAlmacen(a);
                e.setProducto(p);
                resultado.add(e);

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();

        return resultado;
    }

    @Override
    public void registrarExistencia(Existencia e,ArrayList<Almacen> a) {

            try {
                System.out.println("estamos aqui nueva");
                String sql = "INSERT INTO Existencia(idAlmacen,idProducto,cantidad,ubicacion)" +
                        " VALUES(?,?,?,?)";
                var con = conexion.getConexion();
                var ps = con.prepareStatement(sql);

                for(Almacen item : a) {
                    ps.setInt(1, item.getIdAlmacen());
                    ps.setString(2, e.getProducto().getCodProducto());
                    ps.setInt(3, e.getCantidad());
                    ps.setString(4, e.getUbicacion());
                    ps.execute();
                }
                
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        conexion.cerrarConexion();
    }
    
    @Override
    public void registrarExistenciaAlmacen(Existencia e,ArrayList<Producto> p) {

            //registramos todos los productos en el almacen cuando se crea un almacen nuevo
            
            try {
                System.out.println("estamos aqui nueva");
                String sql = "INSERT INTO Existencia(idAlmacen,idProducto,cantidad,ubicacion)" +
                        " VALUES(?,?,?,?)";
                var con = conexion.getConexion();
                var ps = con.prepareStatement(sql);

                for(Producto item : p) {
                    ps.setInt(1, e.getAlmacen().getIdAlmacen());
                    ps.setString(2, item.getCodProducto());
                    ps.setInt(3, e.getCantidad());
                    ps.setString(4, e.getUbicacion());
                    ps.execute();
                }
                
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        conexion.cerrarConexion();
    }

    @Override
    public ArrayList<Existencia> buscarExistencia(String idProducto) {
        var resultado = new ArrayList<Existencia>();
        try {
               
                String sql = "Select a.nombre, a.tipoalmacen, p.idProducto, p.nombre, p.descripcion, c.nombre, p.precioCompra, p.precioVenta, p.tipoguardado, e.ubicacion, e.cantidad, a.idAlmacen from Existencia as e "
                        + "inner join Almacen as a "
                        + "on a.idAlmacen=e.idAlmacen "
                        + "inner join Producto as p "
                        + "on e.idProducto = p.idProducto "
                        + "inner join Categoria as c " 
                        + "on p.idCategoria=c.IdCategoria "
                        + "WHERE e.idProducto LIKE '%" +idProducto + "%'";
            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(sql);
            var resultSet = prepareStatement.executeQuery();
            System.out.println("estes es el result "+resultSet);
            
            while(resultSet.next()){
                var p = new Producto();
                var e = new Existencia();
                var a = new Almacen();
                var c = new Categoria();
                
                a.setNombre(resultSet.getString(1));
                a.settAlmacen(resultSet.getString(2));
                p.setCodProducto(resultSet.getString(3));
                p.setNombre(resultSet.getString(4));
                p.setDescripcion(resultSet.getString(5));
                c.setNombre(resultSet.getString(6));
                p.setpCompra(resultSet.getDouble(7));
                p.setpVenta(resultSet.getDouble(8));
                p.settGuardado(resultSet.getString(9));
                e.setUbicacion(resultSet.getString(10));
                e.setCantidad(resultSet.getInt(11));
                a.setIdAlmacen(resultSet.getInt(12));
                p.setCategoria(c);
                e.setAlmacen(a);
                e.setProducto(p);
                resultado.add(e);
            }         
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();

        return resultado;
    }

    @Override
    public Existencia buscarExistenciaByIds(int idAlmacen, String idProducto) {
        var e = new Existencia();
        try {
               
                String sql = "Select a.nombre, a.tipoalmacen, p.idProducto, p.nombre, p.descripcion, c.nombre, p.precioCompra, p.precioVenta, p.tipoguardado, e.ubicacion, e.cantidad, e.idExistencia  from Existencia as e "
                        + "inner join Almacen as a "
                        + "on a.idAlmacen=e.idAlmacen "
                        + "inner join Producto as p "
                        + "on e.idProducto = p.idProducto "
                        + "inner join Categoria as c " 
                        + "on p.idCategoria=c.IdCategoria "
                        + "Where e.idAlmacen = "+ idAlmacen +" and e.idProducto = "+idProducto;
            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(sql);
            var resultSet = prepareStatement.executeQuery();

            
                var p = new Producto();
                
                var a = new Almacen();
                var c = new Categoria();
                
                a.setNombre(resultSet.getString(1));
                a.settAlmacen(resultSet.getString(2));
                p.setCodProducto(resultSet.getString(3));
                p.setNombre(resultSet.getString(4));
                p.setDescripcion(resultSet.getString(5));
                c.setNombre(resultSet.getString(6));
                p.setpCompra(resultSet.getDouble(7));
                p.setpVenta(resultSet.getDouble(8));
                p.settGuardado(resultSet.getString(9));
                e.setUbicacion(resultSet.getString(10));
                e.setCantidad(resultSet.getInt(11));
                e.setIdExistencia(resultSet.getInt(12));
                p.setCategoria(c);
                e.setAlmacen(a);
                e.setProducto(p);
                e.setAlmacen(a);
                e.setProducto(p);
                
                System.out.println("este es el "+e.getIdExistencia());
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();

        return e;
    }
    
    public void actualizarExistencia(Existencia e){
        
        try {
            String SQL = "UPDATE Existencia "
                    + "SET cantidad = ? "
                    + "WHERE idExistencia = ?";

            var con = conexion.getConexion();
            
            System.out.println("este es el id "+ e.getIdExistencia() +"esta es la cantidad " + e.getCantidad());
            var ps = con.prepareStatement(SQL);
            ps.setInt(1, e.getCantidad());
            ps.setInt(2, e.getIdExistencia());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.print(ex.toString());
        }
        conexion.cerrarConexion();
    }

}
