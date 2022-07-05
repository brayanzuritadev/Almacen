package manejoProductos.usuario.dao;

import conexionDB.ConexionServicioFabrica;
import conexionDB.IConexionServicio;
import manejoProductos.almacen.Almacen;
import manejoProductos.usuario.Usuario;

import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDao implements IUsuarioDao{
    private IConexionServicio conexion;

    public UsuarioDao(IConexionServicio conexion) {
        this.conexion = conexion;
    }

    @Override
    public void guardarUsuario(Usuario u) {
        try{
            
            String sql = "INSERT INTO Usuario(nombre,direccion,ci,telefono,password,email,idAlmacen)" +
                    " VALUES(?,?,?,?,?,?,?)";
            var con = conexion.getConexion();
            var ps = con.prepareStatement(sql);
            ps.setString(1,u.getNombre());
            ps.setString(2,u.getDireccion());
            ps.setString(3,u.getCi());
            ps.setString(4,u.getTelefono());
            ps.setString(5,u.getPassword());
            ps.setString(6,u.getEmail());
            ps.setInt(7,u.getAlmacen().getIdAlmacen());
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
    }

    @Override
    public void modificarUsuario(Usuario u) {
        System.out.println("estamos aqui");
        try{
            String sql = "UPDATE Usuario " +
                    "SET nombre=?, " +
                    "direccion=?, " +
                    "ci = ?, " +
                    "telefono = ?, " +
                    "password = ?, " +
                    "email = ?, " +
                    "idAlmacen = ? " +
                    "WHERE idUsuario=?";
            var con = conexion.getConexion();
            var ps = con.prepareStatement(sql);
            ps.setString(1,u.getNombre());
            ps.setString(2,u.getDireccion());
            ps.setString(3,u.getCi());
            ps.setString(4,u.getTelefono());
            ps.setString(5,u.getPassword());
            ps.setString(6,u.getEmail());
            ps.setInt(7,u.getAlmacen().getIdAlmacen());
            ps.setInt(8,u.getIdUsuario());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
    }

    @Override
    public ArrayList<Usuario> obtenerUsuarios() {
            var resultado = new ArrayList<Usuario>();
        try{
            String sql = "SELECT idUsuario, u.nombre, direccion, ci, u.telefono, password, email, a.nombre " +
                    " FROM Usuario as u " +
                    " inner join Almacen as a " +
                    " on a.idAlmacen=u.idAlmacen";

                    var con =conexion.getConexion();
                    var ps = con.prepareStatement(sql);
                    var result = ps.executeQuery();

                    while(result.next()){
                        var a =new Almacen();
                        var u = new Usuario();
                        u.setIdUsuario(result.getInt(1));
                        u.setNombre(result.getString(2));
                        u.setDireccion(result.getString(3));
                        u.setCi(result.getString(4));
                        u.setTelefono(result.getString(5));
                        u.setPassword(result.getString(6));
                        u.setEmail(result.getString(7));
                        a.setNombre(result.getString(8));
                        u.setAlmacen(a);
                        resultado.add(u);
                    }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        conexion.cerrarConexion();
        return resultado;
    }
}
