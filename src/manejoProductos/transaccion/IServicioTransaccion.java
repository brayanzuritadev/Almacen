package manejoProductos.transaccion;

import java.util.ArrayList;

public interface IServicioTransaccion {
    public void registrarTransaccion(Transaccion t);
    public ArrayList<Transaccion> obtener(String Tipo);
    public ArrayList<Transaccion> buscarTransaccion(String valor,String Tipo);
}
