package com.example.Reportes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReportVisitor implements Visitor {
    private int usuariosFrecuentes = 0;
    private int carritosActivos = 0;
    private int pedidosCompletados = 0;
    private double totalVentas = 0;
    private int actividadesTotales = 0;

    private List<Carrito> carritosConItems = new ArrayList<>();
    private List<Pedido> pedidosCompletadosLista = new ArrayList<>();

    @Override
    public void visitarUsuario(Usuario usuario) {
        if (usuario.getComprasRealizadas() > 5) {
            usuariosFrecuentes++;
        }
    }

    @Override
    public void visitarCarrito(Carrito carrito) {
        if (carrito.getCantidadItems() > 0) {
            carritosActivos++;
            carritosConItems.add(carrito);
        }
    }

    @Override
    public void visitarPedido(Pedido pedido) {
        if ("completado".equalsIgnoreCase(pedido.getEstado())) {
            pedidosCompletados++;
            totalVentas += pedido.getMonto();
            pedidosCompletadosLista.add(pedido);
        }
    }

    @Override
    public void visitarActividad(ActividadUsuario actividad) {
        actividadesTotales++;
    }

    public int contarCarritosAbandonados() {
        List<Usuario> usuariosConPedidos = pedidosCompletadosLista.stream()
                .map(Pedido::getUsuario)
                .distinct()
                .collect(Collectors.toList());

        int abandonados = 0;
        for (Carrito c : carritosConItems) {
            if (!usuariosConPedidos.contains(c.getUsuario())) {
                abandonados++;
            }
        }
        return abandonados;
    }

    public String generarReporte() {
        return "Informe Ejecutivo:\n" +
                "Usuarios frecuentes (>5 compras): " + usuariosFrecuentes + "\n" +
                "Carritos activos: " + carritosActivos + "\n" +
                "Carritos abandonados: " + contarCarritosAbandonados() + "\n" +
                "Pedidos completados: " + pedidosCompletados + "\n" +
                "Total ventas: $" + String.format("%.2f", totalVentas) + "\n" +
                "Total actividades registradas: " + actividadesTotales;
    }
}
