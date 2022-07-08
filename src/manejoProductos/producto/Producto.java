package manejoProductos.producto;

import manejoProductos.categoria.Categoria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Brayan
 */
public class Producto {
    private String codProducto;
    private String nombre;
    private String Descripcion;
    private Categoria categoria;
    private double pCompra;
    private double pVenta;
    private String tGuardado;
    private int prioridad;

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String gettGuardado() {
        return tGuardado;
    }

    public void settGuardado(String tGuardado) {
        this.tGuardado = tGuardado;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getpCompra() {
        return pCompra;
    }

    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    public double getpVenta() {
        return pVenta;
    }

    public void setpVenta(double PVenta) {
        this.pVenta = PVenta;
    }
}
