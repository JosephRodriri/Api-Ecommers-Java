package com.example.aaaaaa.catalogo.factory;



import com.example.aaaaaa.catalogo.builder.ProductoBuilder;
import com.example.aaaaaa.catalogo.builder.ProductoConcretoBuilder;
import com.example.aaaaaa.catalogo.domain.Categoria;
import com.example.aaaaaa.catalogo.domain.Producto;
import com.example.aaaaaa.catalogo.domain.VarianteProducto;

import java.util.List;

public class ProductoLujoFactory implements AbstractProductoFactory{
    @Override
    public Producto crearProducto() {
        ProductoBuilder builder = new ProductoConcretoBuilder();
        builder.setNombre("Bolso de Lujo");
        builder.setDescripcion("Bolso exclusivo de cuero italiano");
        builder.setPrecio(450.00);
        builder.setCategoria(new Categoria("Lujo"));

        List<VarianteProducto> variantes = List.of(
                new VarianteProducto("Negro", "Única", "Cuero"),
                new VarianteProducto("Marrón", "Única", "Cuero")
        );
        builder.setVariantes(variantes);

        return builder.build();
    }
}
