/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package manejoProductos.validador;

import manejoProductos.usuario.Usuario;

/**
 *
 * @author Brayan
 */
public interface IServicioValidador {
    public boolean buscarUsuariologin(String email, String password);
    public boolean buscarAlmacenUsuario(int _idalmacen);
}
