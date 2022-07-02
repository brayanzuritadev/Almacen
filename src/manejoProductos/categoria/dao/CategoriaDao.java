/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.categoria.dao;


import conexionDB.IConexionServicio;
import java.sql.SQLException;
import java.util.ArrayList;
import manejoProductos.categoria.Categoria;


/**
 *
 * @author Brayan
 */
public class CategoriaDao implements ICategoriaDao {

    private IConexionServicio conexion;

    public CategoriaDao(IConexionServicio conexion) {
        this.conexion = conexion;
    }

    @Override
    public void guardar(Categoria c) {

        try {
            String SQL = "INSERT INTO Categoria (nombre)"
                    + "VALUES(?)";

            var con = conexion.getConexion();

            var ps = con.prepareStatement(SQL);
            ps.setString(1, c.getNombre());
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        conexion.cerrarConexion();
    }

    @Override
    public void modificar(Categoria c) {
        try {
            String SQL = "UPDATE Categoria "
                    + "SET nombre = ? "
                    + "WHERE idCategoria = ?";

            var con = conexion.getConexion();

            var ps = con.prepareStatement(SQL);
            ps.setString(1, c.getNombre());
            ps.setInt(2, c.getId());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.print(ex.toString());
        }
        conexion.cerrarConexion();
    }

    @Override
    public ArrayList<Categoria> buscar(String nom) {
        var resultado = new ArrayList<Categoria>();

        try {
            String SQL = "SELECT * "
                    + "FROM Categoria "
                    + "WHERE nombre LIKE '%" + nom + "%'";

            var con = conexion.getConexion();
            var ps = con.prepareStatement(SQL);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getInt("idCategoria");
                var nombre = resultSet.getString("nombre");
                var categoria = new Categoria();
                categoria.setNombre(nombre);
                categoria.setId(id);
                resultado.add(categoria);
            }

        } catch (SQLException ex) {
            System.out.print(ex.toString());
        }
        conexion.cerrarConexion();
        return resultado;
    }

    @Override
    public ArrayList<Categoria> obtener() {
        var resultado = new ArrayList<Categoria>();

        try {
            String SQL = "SELECT idCategoria, nombre FROM Categoria";

            var con = conexion.getConexion();
            var prepareStatement = con.prepareStatement(SQL);
            var resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getInt("idCategoria");
                var nombre = resultSet.getString("nombre");
                var categoria = new Categoria();
                categoria.setNombre(nombre);
                categoria.setId(id);
                resultado.add(categoria);
            }
        } catch (SQLException ex) {
            System.out.print(ex.toString());
        }
        conexion.cerrarConexion();
        return resultado;
    }
}
