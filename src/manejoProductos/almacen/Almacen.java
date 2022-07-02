package manejoProductos.almacen;

public class Almacen {
    private int idAlmacen;
    private String Nombre;
    private String ubicacion;
    private String telefono;

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String gettAlmacen() {
        return tAlmacen;
    }

    public void settAlmacen(String tAlmacen) {
        this.tAlmacen = tAlmacen;
    }

    private String tAlmacen;
}
