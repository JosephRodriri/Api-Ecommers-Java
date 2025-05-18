package com.example.aaaaaa.cupones.chain;

import com.example.aaaaaa.catalogo.domain.Usuario;
import com.example.aaaaaa.cupones.model.Cupon;

public class TipoUsuarioRegla extends ReglaValidacion{
    @Override
    protected boolean validarRegla(Cupon cupon, double montoCarrito, Usuario usuario) {
        return usuario.getTipo().equals(cupon.getTipoUsuarioPermitido());
    }
}
