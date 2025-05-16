package co.edu.ucc.jose.Estado;

import java.util.Date;

public class PedidoMemento {
    private final String estado;
    private final String detalles;
    private final Date fechaEstado;

    public PedidoMemento(String estado, String detalles, Date fechaEstado) {
        this.estado = estado;
        this.detalles = detalles;
        this.fechaEstado = fechaEstado;
    }

    public String getEstado() {
        return estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public Date getFechaEstado() {
        return fechaEstado;
    }
}
