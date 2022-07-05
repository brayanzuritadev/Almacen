package manejoProductos.validador;

import manejoProductos.usuario.Usuario;

public class Validador {
    private static Usuario usuario;

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        Validador.usuario = usuario;
    }
}
