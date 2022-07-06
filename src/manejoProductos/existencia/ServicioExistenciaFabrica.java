package manejoProductos.existencia;

public class ServicioExistenciaFabrica {
    public static IServicioExistencia construir(){
        return new ServicioExistencia();
    }
}
