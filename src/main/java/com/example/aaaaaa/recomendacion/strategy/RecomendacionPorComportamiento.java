package com.example.aaaaaa.recomendacion.strategy;

import com.example.aaaaaa.catalogo.domain.Producto;
import com.example.aaaaaa.catalogo.domain.Usuario;

import java.util.List;

public class RecomendacionPorComportamiento implements EstrategiaRecomendacion{
    @Override
    public List<Producto> recomendar(Usuario usuario) {
        // Analizar historial de navegación
        return usuario.getHistorialBusqueda();
    }
}
