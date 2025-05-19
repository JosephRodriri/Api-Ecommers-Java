package com.example.aaaaaa.pedido.state;

import com.example.aaaaaa.pedido.model.EstadoPedido;

public class Cancelado implements EstadoPedido {
    public String avanzarEstado() { return "CANCELADO"; }
}
