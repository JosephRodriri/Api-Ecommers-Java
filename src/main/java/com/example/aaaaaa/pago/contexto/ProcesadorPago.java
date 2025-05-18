package com.example.aaaaaa.pago.contexto;

import com.example.aaaaaa.pago.adapter.PasarelaPago;
import com.example.aaaaaa.pago.model.DetallePago;
import com.example.aaaaaa.pago.strategy.EstrategiaSeleccionPago;

public class ProcesadorPago {
    private EstrategiaSeleccionPago estrategia;

    public ProcesadorPago(EstrategiaSeleccionPago estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaSeleccionPago estrategia) {
        this.estrategia = estrategia;
    }

    public boolean procesar(DetallePago pago) {
        PasarelaPago pasarela = estrategia.seleccionar(pago);
        return pasarela.procesarPago(pago);
    }
}
