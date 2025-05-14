package com.example.aaaaaa.Pedido;

import java.util.Date;

public class Pedido {
    private EstadoPedido estadoActual;
    private Mediator mediator;

    public Pedido() {
        mediator = new PedidoMediator();
        ((PedidoMediator) mediator).setPedido(this);
        estadoActual = new Pendiente(mediator);
        mostrarEstado();
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        estadoActual = nuevoEstado;
        mostrarEstado();
    }

    public void avanzar() {
        estadoActual.avanzar();
    }

    public void cancelar() {
        estadoActual.cancelar();
    }

    public String obtenerEstado() {
        return estadoActual.getNombre();
    }

    private void mostrarEstado() {
        String timestamp = new Date().toString();
        System.out.println("[" + timestamp + "] Estado actual del pedido: " + estadoActual.getNombre());
    }
}
