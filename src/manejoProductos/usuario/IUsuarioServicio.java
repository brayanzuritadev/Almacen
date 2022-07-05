package manejoProductos.usuario;

import java.util.ArrayList;

public interface IUsuarioServicio {
    public void RegistrarUsuario(Usuario u);
    public void modificarUsuario(Usuario u);
    public ArrayList<Usuario> obtenerUsuarios();
}
