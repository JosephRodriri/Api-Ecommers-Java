package com.example.Reportes;

import java.util.Date;

public class ActividadUsuario implements ElementoVisitante {
    private Usuario usuario;
    private String tipo;
    private Date fecha;

    public ActividadUsuario(Usuario usuario, String tipo, Date fecha) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public Usuario getUsuario() { return usuario; }
    public String getTipo() { return tipo; }
    public Date getFecha() { return fecha; }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitarActividad(this);
    }
}
