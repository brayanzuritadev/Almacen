
package manejoProductos.categoria;

import java.util.ArrayList;

/**
 *
 * @author Brayan
 */
public interface ICategoriaServicio {
    
    public void registrar(Categoria c);
    public void modificar(Categoria c);
    public ArrayList<Categoria> obtenerCategorias();
    public ArrayList<Categoria> buscarCategoria(String nom);
}
