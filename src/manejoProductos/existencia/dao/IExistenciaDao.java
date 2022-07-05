package manejoProductos.existencia.dao;

import manejoProductos.existencia.Existencia;

import java.util.ArrayList;

public interface IExistenciaDao {
    public ArrayList<Existencia> obteerExistencia();
    public void registraExistencia(Existencia e);
    public ArrayList<Existencia> buscarExistencia();
}
