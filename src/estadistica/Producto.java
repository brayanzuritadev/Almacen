/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estadistica.src.estadistica;

/**
 *
 * @author HP
 */
public class Producto {
    
    private int cantidad;
    private String categoria;
    
    public Producto(int cantidad,String categoria){
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public void setCantidad(int dato){
        cantidad = dato;
    }
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCategoria(String dato){
        categoria = dato;
    }
    public String getCategoria(){
        return categoria;
    }
    
}
