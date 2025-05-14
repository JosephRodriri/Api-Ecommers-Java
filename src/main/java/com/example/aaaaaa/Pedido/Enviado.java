package com.example.aaaaaa.Pedido;

public class Enviado implements EstadoPedido {
    private Mediator mediator;

    public Enviado(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void avanzar() {
        mediator.notificar(this, "avanzar");
    }

    @Override
    public void cancelar() {
        mediator.notificar(this, "cancelar");
    }

    @Override
    public String getNombre() {
        return "Enviado";
    }
}
