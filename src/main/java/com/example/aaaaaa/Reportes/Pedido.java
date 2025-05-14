package com.example.Reportes;

public class Pedido implements ElementoVisitante {
    private Usuario usuario;
    private String estado;
    private double monto;

    public Pedido(Usuario usuario, String estado, double monto) {
        this.usuario = usuario;
        this.estado = estado;
        this.monto = monto;
    }

    public Usuario getUsuario() { return usuario; }
    public String getEstado() { return estado; }
    public double getMonto() { return monto; }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitarPedido(this);
    }
}
