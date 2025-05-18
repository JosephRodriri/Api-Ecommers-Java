package com.example.aaaaaa.pago.adapter;

import co.edu.ucc.proyecto_final_eCommerce.pago.model.DetallePago;

public class PaypalAdapter implements PasarelaPago{
    private final PaypalAPI api = new PaypalAPI();

    @Override
    public boolean procesarPago(DetallePago pago) {
        return api.enviarPago(pago.getClienteId(), pago.getMonto(), pago.getMoneda());
    }

}
