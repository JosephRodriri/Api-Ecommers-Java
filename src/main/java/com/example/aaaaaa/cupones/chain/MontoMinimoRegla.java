package com.example.aaaaaa.cupones.chain;

import com.example.aaaaaa.catalogo.domain.Usuario;
import com.example.aaaaaa.cupones.model.Cupon;

public class MontoMinimoRegla extends ReglaValidacion{
    @Override
    protected boolean validarRegla(Cupon cupon, double montoCarrito, Usuario usuario) {
        return montoCarrito >= cupon.getMontoMinimo();
    }
}
