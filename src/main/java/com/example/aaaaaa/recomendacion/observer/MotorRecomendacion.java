package com.example.aaaaaa.recomendacion.observer;

import com.example.aaaaaa.catalogo.domain.Producto;
import com.example.aaaaaa.catalogo.domain.Usuario;

public class MotorRecomendacion implements ObservadorUsuario {
    @Override
    public void actualizar(EventoUsuario evento, Producto producto, Usuario usuario) {
        switch (evento) {
            case BUSQUEDA -> usuario.agregarABusquedas(producto);
            case COMPRA -> usuario.registrarCompra(producto);
            case VISITA_PRODUCTO -> usuario.agregarARecientes(producto);
        }
    }
}
