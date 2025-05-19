package com.example.aaaaaa.pedido.state;

import com.example.aaaaaa.pedido.model.EstadoPedido;

public class Entregado implements EstadoPedido {
    public String avanzarEstado() { return "ENTREGADO"; }
}