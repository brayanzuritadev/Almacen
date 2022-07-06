package manejoProductos.validador;

import javax.swing.JOptionPane;

import manejoProductos.almacen.Almacen;
import manejoProductos.almacen.IAlmacenServicio;
import manejoProductos.usuario.IUsuarioServicio;
import manejoProductos.usuario.Usuario;
import manejoProductos.usuario.UsuarioServicioFabrica;

public class ServicioValidador implements IServicioValidador{
    private IUsuarioServicio su = UsuarioServicioFabrica.construir();
   // private IAlmacenServicio as = UsuarioServicioFabrica.construir();
    
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

    /*@Override
    public <Producto> buscarProductoUsuario(int _idproducto) {
       /* var resultados = su.obtenerAlmacenes();

        for(Almacen item : resultados){
            if(Validador.getUsuario().getAlmacen().getIdAlmacen()==item.getIdAlmacen()){
                if(Validador.getUsuario().getAlmacen().gettAlmacen().equals("Principal"))
                    return true;
            }
        }
        return false;
    }*/

    @Override
    public boolean buscarAlmacenUsuario(int _idalmacen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
