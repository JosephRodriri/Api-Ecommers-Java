package com.example.aaaaaa.pago.strategy;

import com.example.aaaaaa.pago.adapter.PasarelaPago;
import com.example.aaaaaa.pago.model.DetallePago;

public interface EstrategiaSeleccionPago {
    PasarelaPago seleccionar(DetallePago pago);
}
