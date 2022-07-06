package manejoProductos.usuario;

import manejoProductos.almacen.IAlmacenServicio;

import java.util.ArrayList;

public interface IUsuarioServicio{
    public void RegistrarUsuario(Usuario u);
    public void modificarUsuario(Usuario u);
    public ArrayList<Usuario> obtenerUsuarios();
}
