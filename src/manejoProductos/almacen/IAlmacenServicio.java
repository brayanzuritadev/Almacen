package manejoProductos.almacen;

import java.util.ArrayList;

public interface IAlmacenServicio {
    public void registrar(Almacen almacen);
    public void modificar(Almacen almacen);
    public ArrayList<Almacen> obtenerAlmacenes();
    public ArrayList<Almacen> buscarAlmacen(String nombre);
}
