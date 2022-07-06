package manejoProductos.transaccion;

import java.util.ArrayList;
import manejoProductos.transaccion.dao.ITransaccionDao;
import manejoProductos.transaccion.dao.TransaccionDaoFabrica;

public class ServicioTransaccion implements IServicioTransaccion {
    
    private ITransaccionDao atd = TransaccionDaoFabrica.construir();
    @Override
    public void registrarTransaccion(Transaccion t) {
        atd.registrarTransaccion(t);
    }

    @Override
    public ArrayList<Transaccion> obtener(String Tipo) {
        return null;
    }

    @Override
    public ArrayList<Transaccion> buscarTransaccion(String valor, String Tipo) {
        return null;
    }
}
