package com.example.aaaaaa.categorias.composite;


import com.example.aaaaaa.catalogo.domain.Producto;

public class ItemProducto extends ComponenteCatalogo{
    private Producto producto;

    public ItemProducto(Producto producto) {
        super(producto.getNombre());
        this.producto = producto;
    }

    @Override
    public void mostrar(int nivel) {
        System.out.println("  ".repeat(nivel) + "- Producto: " + producto.getNombre());
    }

    public Producto getProducto() {
        return producto;
    }
}
