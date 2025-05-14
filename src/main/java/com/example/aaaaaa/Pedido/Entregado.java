package com.example.aaaaaa.Pedido;

public class Entregado implements EstadoPedido {
    private Mediator mediator;

    public Entregado(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void avanzar() {
        System.out.println("El pedido ya está entregado y no puede avanzar más.");
    }

    @Override
    public void cancelar() {
        System.out.println("No se puede cancelar un pedido entregado.");
    }

    @Override
    public String getNombre() {
        return "Entregado";
    }
}
