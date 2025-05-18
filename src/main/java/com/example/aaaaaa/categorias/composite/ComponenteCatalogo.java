package com.example.aaaaaa.categorias.composite;

public abstract class ComponenteCatalogo {
    protected String nombre;

    public ComponenteCatalogo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrar(int nivel);
}
