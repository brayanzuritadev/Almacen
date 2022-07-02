package conexionDB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

import java.sql.Connection;
/**
 *
 * @author Brayan
 */
public interface IConexionServicio {
    public Connection getConexion();
    public void cerrarConexion();
}
