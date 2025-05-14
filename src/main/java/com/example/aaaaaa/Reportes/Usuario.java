package com.example.Reportes;

public class Usuario implements ElementoVisitante {
    private String nombre;
    private int comprasRealizadas;

    public Usuario(String nombre, int comprasRealizadas) {
        this.nombre = nombre;
        this.comprasRealizadas = comprasRealizadas;
    }

    public String getNombre() { return nombre; }
    public int getComprasRealizadas() { return comprasRealizadas; }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitarUsuario(this);
    }
}
