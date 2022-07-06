/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.transaccion;

import manejoProductos.transaccion.IServicioTransaccion;
import manejoProductos.transaccion.ServicioTransaccionFabrica;
import manejoProductos.transaccion.Transaccion;


/**
 *
 * @author Brayan
 */
public class ServicioEstadistica {
    
    public void obtenerDatos(){
        
    IServicioTransaccion e = ServicioTransaccionFabrica.construir();
        /*var resultado = e.obtener("Entrada");
        for(Transaccion item : resultado){
            Dato p = new Dato(item.getCantidad(),item.getProdcuto().getCodProducto());
        }*/
    }
}