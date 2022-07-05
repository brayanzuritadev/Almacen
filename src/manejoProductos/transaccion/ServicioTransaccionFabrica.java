package manejoProductos.transaccion;

public class ServicioTransaccionFabrica {
    public static IServicioTransaccion construir(){
        return new ServicioTransaccion();
    }
}
