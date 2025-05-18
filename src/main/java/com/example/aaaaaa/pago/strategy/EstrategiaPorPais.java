package com.example.aaaaaa.pago.strategy;

import com.example.aaaaaa.pago.adapter.MercadoPagoAdapter;
import com.example.aaaaaa.pago.adapter.PasarelaPago;
import com.example.aaaaaa.pago.adapter.PaypalAdapter;
import com.example.aaaaaa.pago.adapter.StripeAdapter;
import com.example.aaaaaa.pago.model.DetallePago;

public class EstrategiaPorPais implements EstrategiaSeleccionPago{
    @Override
    public PasarelaPago seleccionar(DetallePago pago) {
        switch (pago.getPais().toLowerCase()) {
            case "colombia": return new MercadoPagoAdapter();
            case "usa": return new PaypalAdapter();
            case "europa": return new StripeAdapter();
            default: return new PaypalAdapter(); // Por defecto
        }
    }
}
