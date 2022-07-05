package manejoProductos.existencia;

public class ServicioexistenciaFabrica {
    public static IServicioExistencia construir(){
        return new ServicioExistencia();
    }
}
