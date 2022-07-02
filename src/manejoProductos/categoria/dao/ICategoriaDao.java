package manejoProductos.categoria.dao;

import manejoProductos.categoria.Categoria;
import java.util.ArrayList;
public interface ICategoriaDao {
    public void guardar(Categoria c);
    public void modificar(Categoria c);
    public ArrayList<Categoria> obtener();

    public ArrayList<Categoria> buscar(String valor);
}
