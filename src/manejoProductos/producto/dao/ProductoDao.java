package manejoProductos.producto.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import conexionDB.ConexionServicioFabrica;
import conexionDB.IConexionServicio;
import manejoProductos.producto.Producto;

public class ProductoDao implements IProductoDao{
    private IConexionServicio conexion;

    public ProductoDao(IConexionServicio conexion) {
        this.conexion = conexion;
    }

    @Override
    public void guardar(Producto p) {
        try {
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

        conexion.cerrarConexion();
    }

    @Override
    public void modificar(Producto p) {
        try {
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
        conexion.cerrarConexion();
    }

    @Override
    public ArrayList<Object[]> obtener() {
        var resultado = new ArrayList<Object[]>();
        try {
            String sql = "SELECT idProducto, p.nombre, descripcion, c.nombre, precioCompra, precioVenta, tipoGuardado"
                    + " FROM Producto as p"
                    + " inner join Categoria as c"
                    + " on p.idCategoria=c.Idcategoria";

            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(sql);
            var resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                var p = new Object[7];

                p[0]=(resultSet.getString(1));
                p[1]=(resultSet.getString(2));
                p[2]=(resultSet.getString(3));
                p[3]=(resultSet.getString(4));
                p[4]=(resultSet.getDouble(5));
                p[5]=(resultSet.getDouble(6));
                p[6]=(resultSet.getString(7));
                resultado.add(p);

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();

        return resultado;
    }

    @Override
    public ArrayList<Object[]> buscar(String nombre) {
        var resultado = new ArrayList<Object[]>();
        try{
            String sql = "SELECT idProducto, p.nombre, descripcion, c.nombre, precioCompra, precioVenta, tipoGuardado "
                    + "FROM Producto as p "
                    + "inner join Categoria as c "
                    + "on c.idCategoria=p.idCategoria "
                    +"WHERE (p.nombre LIKE '%"+ nombre + "%') OR (idProducto LIKE '%"+ nombre + "%')" ;
            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(sql);
            var resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                var p = new Object[7];
                p[0]=(resultSet.getString(1));
                p[1]=(resultSet.getString(2));
                p[2]=(resultSet.getString(3));
                p[3]=(resultSet.getString(4));
                p[4]=(resultSet.getDouble(5));
                p[5]=(resultSet.getDouble(6));
                p[6]=(resultSet.getString(7));
                resultado.add(p);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
        return resultado;
    }
}
