/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brayan
 */
public class ConexionSQLLite implements IConexionServicio{
    Connection conexion;
    
    @Override
    public Connection getConexion() {
        try{
            Class.forName("org.sqlite.JDBC");
            String url="jdbc:sqlite:AlmacenDB";
            conexion = DriverManager.getConnection(url);
        if(conexion!=null){
            System.out.println("Estamos conectados");
        }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSQLLite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

    @Override
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQLLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
