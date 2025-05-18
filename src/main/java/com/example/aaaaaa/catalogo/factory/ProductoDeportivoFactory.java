package com.example.aaaaaa.catalogo.factory;


import com.example.aaaaaa.catalogo.builder.ProductoBuilder;
import com.example.aaaaaa.catalogo.builder.ProductoConcretoBuilder;
import com.example.aaaaaa.catalogo.builder.ProductoDirector;
import com.example.aaaaaa.catalogo.domain.Producto;

public class ProductoDeportivoFactory implements AbstractProductoFactory {
    @Override
    public Producto crearProducto() {
        ProductoBuilder builder = new ProductoConcretoBuilder();
        ProductoDirector director = new ProductoDirector(builder);
        return director.construirProductoDeportivo();
    }
}
