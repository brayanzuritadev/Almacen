package manejoProductos.categoria;

import manejoProductos.categoria.dao.CategoriaDaoFabrica;
import manejoProductos.categoria.dao.ICategoriaDao;

import java.util.ArrayList;

public class CategoriaServicio implements ICategoriaServicio{
    ICategoriaDao categoriaDao = CategoriaDaoFabrica.construir();
    @Override
    public void registrar(Categoria c) {
        categoriaDao.guardar(c);
    }

    @Override
    public void modificar(Categoria c) {
        categoriaDao.modificar(c);
    }

    @Override
    public ArrayList<Categoria> obtenerCategorias() {
        return categoriaDao.obtener();
    }

    @Override
    public ArrayList<Categoria> buscarCategoria(String valor) {
        return categoriaDao.buscar(valor);
    }
}
