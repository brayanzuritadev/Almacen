/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoProductos.validador;

/**
 *
 * @author Brayan
 */
public class ServicioValidadorFabrica {
    public static IServicioValidador construir(){
        return new ServicioValidador();
    }
}
