package com.example.aaaaaa.pago.strategy;

import com.example.aaaaaa.pago.adapter.MercadoPagoAdapter;
import com.example.aaaaaa.pago.adapter.PasarelaPago;
import com.example.aaaaaa.pago.adapter.StripeAdapter;
import com.example.aaaaaa.pago.model.DetallePago;

public class EstrategiaPorMonto implements EstrategiaSeleccionPago{
    @Override
    public PasarelaPago seleccionar(DetallePago pago) {
        if (pago.getMonto() < 100) {
            return new MercadoPagoAdapter();
        } else {
            return new StripeAdapter();
        }
    }
}
