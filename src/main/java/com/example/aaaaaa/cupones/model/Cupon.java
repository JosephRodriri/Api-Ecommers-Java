package com.example.aaaaaa.cupones.model;

import java.time.LocalDate;

public class Cupon {
    private String codigo;
    private double descuento; // porcentaje
    private double montoMinimo;
    private LocalDate fechaExpiracion;
    private UsuarioTipo tipoUsuarioPermitido;

    public Cupon(String codigo, double descuento, double montoMinimo, LocalDate fechaExpiracion, UsuarioTipo tipoUsuarioPermitido) {
        this.codigo = codigo;
        this.descuento = descuento;
        this.montoMinimo = montoMinimo;
        this.fechaExpiracion = fechaExpiracion;
        this.tipoUsuarioPermitido = tipoUsuarioPermitido;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getMontoMinimo() {
        return montoMinimo;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public UsuarioTipo getTipoUsuarioPermitido() {
        return tipoUsuarioPermitido;
    }
}
