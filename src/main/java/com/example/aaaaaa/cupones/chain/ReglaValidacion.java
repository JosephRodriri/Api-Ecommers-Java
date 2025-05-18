package com.example.aaaaaa.cupones.chain;

import com.example.aaaaaa.catalogo.domain.Usuario;
import com.example.aaaaaa.cupones.model.Cupon;

public abstract class ReglaValidacion {
    protected ReglaValidacion siguiente;

    public ReglaValidacion enlazarCon(ReglaValidacion siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    public boolean validar(Cupon cupon, double montoCarrito, Usuario usuario) {
        if (!validarRegla(cupon, montoCarrito, usuario)) {
            return false;
        }
        return siguiente == null || siguiente.validar(cupon, montoCarrito, usuario);
    }

    protected abstract boolean validarRegla(Cupon cupon, double montoCarrito, Usuario usuario);
}
