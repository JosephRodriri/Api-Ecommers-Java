package com.example.aaaaaa.recomendacion.contexto;



import com.example.aaaaaa.catalogo.domain.Producto;
import com.example.aaaaaa.catalogo.domain.Usuario;
import com.example.aaaaaa.recomendacion.strategy.EstrategiaRecomendacion;

import java.util.List;

public class RecomendadorContexto {
    private EstrategiaRecomendacion estrategia;

    public RecomendadorContexto(EstrategiaRecomendacion estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaRecomendacion estrategia) {
        this.estrategia = estrategia;
    }

    public List<Producto> obtenerRecomendaciones(Usuario usuario) {
        return estrategia.recomendar(usuario);
    }
}
