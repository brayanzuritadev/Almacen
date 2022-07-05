/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package manejoProductos.transaccion.dao;

import java.util.ArrayList;
import manejoProductos.transaccion.Transaccion;

/**
 *
 * @author Brayan
 */
public interface ITransaccionDao {
    public void registrarTransaccion(Transaccion t);
    public ArrayList<Transaccion> obtenerTransaccion(String tipo);
    public ArrayList<Transaccion> buscarTransaccion(String valor, String tipo);
}
