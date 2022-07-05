package manejoProductos.usuario.dao;

import manejoProductos.usuario.Usuario;

import java.util.ArrayList;

public interface IUsuarioDao {
    public void guardarUsuario(Usuario u);
    public void modificarUsuario(Usuario u);
    public ArrayList<Usuario> obtenerUsuarios();
}
