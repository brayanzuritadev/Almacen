package manejoProductos.existencia;

import java.util.ArrayList;

public interface IServicioExistencia {
    public ArrayList<Existencia> obteerExistencia();
    public void registraExistencia(Existencia e);
    public ArrayList<Existencia> buscarExistencia();
}
