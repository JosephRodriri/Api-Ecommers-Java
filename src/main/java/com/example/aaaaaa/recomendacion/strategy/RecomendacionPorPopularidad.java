package com.example.aaaaaa.recomendacion.strategy;

import com.example.aaaaaa.catalogo.domain.Producto;
import com.example.aaaaaa.catalogo.domain.Usuario;

import java.util.List;

public class RecomendacionPorPopularidad implements EstrategiaRecomendacion{
    @Override
    public List<Producto> recomendar(Usuario usuario) {

        return List.of(new Producto("Zapatillas"), new Producto("Camisa"));
    }
}
