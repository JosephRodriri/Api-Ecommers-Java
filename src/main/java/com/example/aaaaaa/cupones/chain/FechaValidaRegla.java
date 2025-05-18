package com.example.aaaaaa.cupones.chain;

import com.example.aaaaaa.catalogo.domain.Usuario;
import com.example.aaaaaa.cupones.model.Cupon;

import java.time.LocalDate;

public class FechaValidaRegla extends ReglaValidacion{
    @Override
    protected boolean validarRegla(Cupon cupon, double montoCarrito, Usuario usuario) {
        return LocalDate.now().isBefore(cupon.getFechaExpiracion());
    }
}
