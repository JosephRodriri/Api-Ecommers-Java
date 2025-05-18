package com.example.aaaaaa.catalogo.builder;

import co.edu.ucc.proyecto_final_eCommerce.catalogo.domain.Categoria;
import co.edu.ucc.proyecto_final_eCommerce.catalogo.domain.Producto;
import co.edu.ucc.proyecto_final_eCommerce.catalogo.domain.VarianteProducto;

import java.util.List;

public interface ProductoBuilder {
    void setNombre(String nombre);
    void setDescripcion(String descripcion);
    void setPrecio(double precio);
    void setCategoria(Categoria categoria);
    void setVariantes(List<VarianteProducto> variantes);
    Producto build();
}
