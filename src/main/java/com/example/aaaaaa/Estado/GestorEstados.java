package com.example.aaaaaa.Estado;

public class GestorEstados {
    private PedidoMemento estadoGuardado;

    public void guardar(PedidoMemento memento) {
        this.estadoGuardado = memento;
    }

    public PedidoMemento recuperar() {
        return estadoGuardado;
    }
}
