package com.example.aaaaaa.pago.model;

public class DetallePago {
    private String clienteId;
    private double monto;
    private String moneda;
    private String pais;

    public DetallePago(String clienteId, double monto, String moneda, String pais) {
        this.clienteId = clienteId;
        this.monto = monto;
        this.moneda = moneda;
        this.pais = pais;
    }

    // Getters
    public String getClienteId() { return clienteId; }
    public double getMonto() { return monto; }
    public String getMoneda() { return moneda; }
    public String getPais() { return pais; }
}
