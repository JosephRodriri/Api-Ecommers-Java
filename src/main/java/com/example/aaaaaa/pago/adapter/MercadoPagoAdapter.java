package com.example.aaaaaa.pago.adapter;

import co.edu.ucc.proyecto_final_eCommerce.pago.model.DetallePago;

public class MercadoPagoAdapter implements PasarelaPago{
    private final MercadoPagoServicio servicio = new MercadoPagoServicio();

    @Override
    public boolean procesarPago(DetallePago pago) {
        return servicio.procesar(pago.getClienteId(), pago.getPais(), pago.getMonto());
    }
}
