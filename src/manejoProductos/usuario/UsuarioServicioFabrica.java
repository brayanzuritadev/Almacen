package manejoProductos.usuario;

public class UsuarioServicioFabrica {
    public static IUsuarioServicio construir(){
        return new UsuarioServicio();
    }
}
