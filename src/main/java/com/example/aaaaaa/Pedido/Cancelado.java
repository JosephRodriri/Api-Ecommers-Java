package com.example.aaaaaa.Pedido;

public class Cancelado implements EstadoPedido {
    private Mediator mediator;

    public Cancelado(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void avanzar() {
        System.out.println("Pedido cancelado, no puede avanzar.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido ya está cancelado.");
    }

    @Override
    public String getNombre() {
        return "Cancelado";
    }
}
