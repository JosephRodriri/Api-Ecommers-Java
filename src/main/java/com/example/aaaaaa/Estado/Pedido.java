package com.example.aaaaaa.Estado;

import java.util.Date;

public class Pedido {
    private String estado;
    private String detalles;
    private Date fechaUltimaModificacion;

    public Pedido(String estadoInicial, String detalles) {
        this.estado = estadoInicial;
        this.detalles = detalles;
        this.fechaUltimaModificacion = new Date();
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        this.fechaUltimaModificacion = new Date();
        System.out.println("Pedido estado cambiado a: " + nuevoEstado);
    }

    public void actualizarDetalles(String nuevosDetalles) {
        this.detalles = nuevosDetalles;
        this.fechaUltimaModificacion = new Date();
        System.out.println("Detalles del pedido actualizados.");
    }

    public PedidoMemento guardarEstado() {
        System.out.println("Guardando estado del pedido...");
        return new PedidoMemento(estado, detalles, fechaUltimaModificacion);
    }

    public void restaurarEstado(PedidoMemento memento) {
        if (memento == null) {
            System.out.println("No hay estado guardado para restaurar.");
            return;
        }
        this.estado = memento.getEstado();
        this.detalles = memento.getDetalles();
        this.fechaUltimaModificacion = memento.getFechaEstado();
        System.out.println("Estado del pedido restaurado a:");
        imprimirEstado();
    }

    public void imprimirEstado() {
        System.out.println("Estado: " + estado);
        System.out.println("Detalles: " + detalles);
        System.out.println("Última modificación: " + fechaUltimaModificacion);
    }
}
