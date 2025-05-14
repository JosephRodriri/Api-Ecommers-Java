package com.example.Reportes;

public class Carrito implements ElementoVisitante {
    private Usuario usuario;
    private int cantidadItems;
    private double montoTotal;

    public Carrito(Usuario usuario, int cantidadItems, double montoTotal) {
        this.usuario = usuario;
        this.cantidadItems = cantidadItems;
        this.montoTotal = montoTotal;
    }

    public Usuario getUsuario() { return usuario; }
    public int getCantidadItems() { return cantidadItems; }
    public double getMontoTotal() { return montoTotal; }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitarCarrito(this);
    }
}
