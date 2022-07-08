package manejoProductos.transaccion;

import manejoProductos.almacen.Almacen;
import manejoProductos.producto.Producto;
import manejoProductos.usuario.Usuario;
import vistas.VUsuario;

public class Transaccion {
    private int idTransaccion;
    private Almacen almacen;
    private Producto prodcuto;
    private Usuario usuario;
    private int cantidad;
    private double totalTransaccion;
    private String destino;
    private String tTransaccion;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Producto getProdcuto() {
        return prodcuto;
    }

    public void setProdcuto(Producto prodcuto) {
        this.prodcuto = prodcuto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalTransaccion() {
        return totalTransaccion;
    }

    public void setTotalTransaccion(double totalTransaccion) {
        this.totalTransaccion = totalTransaccion;
    }

    public String gettTransaccion() {
        return tTransaccion;
    }

    public void settTransaccion(String tTransaccion) {
        this.tTransaccion = tTransaccion;
    }
}
