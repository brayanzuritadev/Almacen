package manejoProductos.usuario;

import java.util.ArrayList;
import manejoProductos.usuario.dao.IUsuarioDao;
import manejoProductos.usuario.dao.UsuarioDao;
import manejoProductos.usuario.dao.UsuarioDaoFabrica;

public class UsuarioServicio implements IUsuarioServicio {
    IUsuarioDao usuarioDao = UsuarioDaoFabrica.construir();

    @Override
    public void RegistrarUsuario(Usuario u) {
        usuarioDao.guardarUsuario(u);
        System.out.println("estamos en registrar");
    }

    @Override
    public void modificarUsuario(Usuario u) {
        usuarioDao.modificarUsuario(u);
    }

    @Override
    public ArrayList<Usuario> obtenerUsuarios() {
        return usuarioDao.obtenerUsuarios();
    }
}
