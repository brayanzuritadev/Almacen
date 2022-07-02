/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionDB;

import conexionDB.ConexionH2;
import conexionDB.ConexionSQLServer;
import conexionDB.IConexionServicio;

/**
 *
 * @author Brayan
 */
public class ConexionServicioFabrica {
    public static IConexionServicio construir(){
        return new ConexionSQLLite();
    }
}
