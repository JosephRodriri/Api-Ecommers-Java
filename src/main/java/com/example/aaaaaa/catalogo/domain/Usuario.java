package com.example.aaaaaa.catalogo.domain;

import com.example.aaaaaa.cupones.model.UsuarioTipo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String id;
    private UsuarioTipo tipo;
    private List<Producto> historialBusqueda = new ArrayList<>();
    private List<Producto> productosRecientes = new ArrayList<>();
    private List<Producto> historialCompras = new ArrayList<>();

    public Usuario(String id) {
        this.id = id;
    }

    public void agregarABusquedas(Producto p) {
        historialBusqueda.add(p);
    }

    public void registrarCompra(Producto p) {
        historialCompras.add(p);
    }

    public void agregarARecientes(Producto p) {
        productosRecientes.add(p);
    }

    public List<Producto> getHistorialBusqueda() {
        return historialBusqueda;
    }

    public List<Producto> getCompras() {
        return historialCompras;
    }

    public String getId() {
        return id;
    }
    public UsuarioTipo getTipo() {
        return tipo;
    }
}
