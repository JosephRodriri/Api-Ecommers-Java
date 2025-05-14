package com.example.Reportes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacadeReportes {
    private List<Usuario> usuarios;
    private List<Carrito> carritos;
    private List<Pedido> pedidos;
    private List<ActividadUsuario> actividades;

    public FacadeReportes() {
        usuarios = new ArrayList<>();
        carritos = new ArrayList<>();
        pedidos = new ArrayList<>();
        actividades = new ArrayList<>();

        Usuario u1 = new Usuario("Ana Gómez", 3);
        Usuario u2 = new Usuario("Pedro Martínez", 12);
        Usuario u3 = new Usuario("Luisa Fernández", 8);
        Usuario u4 = new Usuario("Carlos Ruiz", 1);
        Usuario u5 = new Usuario("María López", 0);
        usuarios.add(u1); usuarios.add(u2); usuarios.add(u3); usuarios.add(u4); usuarios.add(u5);

        carritos.add(new Carrito(u1, 2, 45.50));
        carritos.add(new Carrito(u3, 0, 0));
        carritos.add(new Carrito(u4, 5, 98.90));
        carritos.add(new Carrito(u5, 3, 35.00));

        pedidos.add(new Pedido(u2, "completado", 560.30));
        pedidos.add(new Pedido(u1, "pendiente", 0));
        pedidos.add(new Pedido(u3, "completado", 120.80));

        actividades.add(new ActividadUsuario(u1, "Visita", new Date()));
        actividades.add(new ActividadUsuario(u2, "Busqueda", new Date()));
        actividades.add(new ActividadUsuario(u3, "Compra", new Date()));
        actividades.add(new ActividadUsuario(u2, "Visita", new Date()));
        actividades.add(new ActividadUsuario(u5, "Busqueda", new Date()));
        actividades.add(new ActividadUsuario(u5, "Visita", new Date()));
    }

    public String obtenerInformeEjecutivo() {
        ReportVisitor visitor = new ReportVisitor();
        usuarios.forEach(u -> u.aceptar(visitor));
        carritos.forEach(c -> c.aceptar(visitor));
        pedidos.forEach(p -> p.aceptar(visitor));
        actividades.forEach(a -> a.aceptar(visitor));
        return visitor.generarReporte();
    }
}
