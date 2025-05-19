package com.example.aaaaaa.pedido.Factory;

import com.example.aaaaaa.pedido.model.EstadoPedido;
import com.example.aaaaaa.pedido.state.*;

public class EstadoFactory {
    public static EstadoPedido obtenerEstado(String estado) {
        return switch (estado.toUpperCase()) {
            case "PENDIENTE" -> new Pendiente();
            case "CONFIRMADO" -> new Confirmado();
            case "ENVIADO" -> new Enviado();
            case "ENTREGADO" -> new Entregado();
            case "CANCELADO" -> new Cancelado();
            default -> throw new IllegalArgumentException("Estado no válido: " + estado);
        };
    }
}
