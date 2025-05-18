package com.example.aaaaaa.categorias.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ComponenteCatalogo{
    private List<ComponenteCatalogo> elementos = new ArrayList<>();

    public Categoria(String nombre) {
        super(nombre);
    }

    public void agregarElemento(ComponenteCatalogo elemento) {
        elementos.add(elemento);
    }

    public void removerElemento(ComponenteCatalogo elemento) {
        elementos.remove(elemento);
    }

    @Override
    public void mostrar(int nivel) {
        System.out.println("  ".repeat(nivel) + "- Categoria: " + nombre);
        for (ComponenteCatalogo c : elementos) {
            c.mostrar(nivel + 1);
        }
    }
}
