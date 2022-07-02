/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Brayan
 */
public class ConexionSQLServer implements IConexionServicio {

    Connection con;
    ResultSet rs;
    public PreparedStatement ps;
    Statement st;

    @Override
    public Connection getConexion() {
        String connectionUrl = "jdbc:sqlserver://SQL8002.site4now.net;DatabaseName=db_a894b0_brava;user=db_a894b0_brava_admin;password=brava123;encrypt=true;trustServerCertificate=true;";

        try {

            con = DriverManager.getConnection(connectionUrl);
            return con;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void cerrarConexion() {

        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                System.out.println("cerramos el prepared staten");
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error cerrando la conexion!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
