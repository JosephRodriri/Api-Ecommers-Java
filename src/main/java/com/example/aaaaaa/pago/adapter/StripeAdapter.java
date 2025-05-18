package com.example.aaaaaa.pago.adapter;

import co.edu.ucc.proyecto_final_eCommerce.pago.model.DetallePago;

public class StripeAdapter  implements PasarelaPago{
    private final StripeSDK stripe = new StripeSDK();

    @Override
    public boolean procesarPago(DetallePago pago) {
        return stripe.realizarPago(pago.getMonto(), pago.getMoneda(), pago.getClienteId());
    }
}
