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
public class ConexionH2 implements IConexionServicio {
    Connection conexion;
    @Override
    public Connection getConexion() {
        try{
            Class.forName("org.h2.Driver");
            String url="jdbc:h2:file:C:/Users/Brayan/Desktop/AlmacenDB";
            conexion = DriverManager.getConnection(url,"sa","");
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
        try{
            if(conexion != null) {
                conexion.close();
                System.out.println("se esta cerrando la concexion");
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
}
