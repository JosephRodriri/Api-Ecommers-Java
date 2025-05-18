package com.example.aaaaaa.recomendacion.strategy;

import com.example.aaaaaa.catalogo.domain.Producto;
import com.example.aaaaaa.catalogo.domain.Usuario;

import java.util.List;

public interface EstrategiaRecomendacion {
    List<Producto> recomendar(Usuario usuario);
}
