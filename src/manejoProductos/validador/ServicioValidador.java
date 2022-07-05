package manejoProductos.validador;

import javax.swing.JOptionPane;
import manejoProductos.usuario.IUsuarioServicio;
import manejoProductos.usuario.Usuario;
import manejoProductos.usuario.UsuarioServicioFabrica;

public class ServicioValidador implements IServicioValidador{
    private IUsuarioServicio su = UsuarioServicioFabrica.construir();
    
    @Override
    public boolean buscarUsuariologin(String email, String password) {
            var resultados = su.obtenerUsuarios();
            
            for(Usuario item : resultados){
                if(item.getEmail().equals(email) && item.getPassword().equals(password)){
                    JOptionPane.showMessageDialog(null, "Bienvenido " + item.getNombre());
                    Validador.setUsuario(item);
                    return true;
                }
            }
            JOptionPane.showMessageDialog(null, "El usuario no esta dentro de la base de datos");
        return false;
    }
    
}
