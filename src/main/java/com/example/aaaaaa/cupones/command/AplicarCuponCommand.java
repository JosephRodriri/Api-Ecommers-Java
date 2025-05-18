package com.example.aaaaaa.cupones.command;

import com.example.aaaaaa.catalogo.domain.Usuario;
import com.example.aaaaaa.cupones.chain.ReglaValidacion;
import com.example.aaaaaa.cupones.model.Cupon;

public class AplicarCuponCommand implements CarritoCommand{
    private Carrito carrito;
    private Cupon cupon;
    private Usuario usuario;
    private ReglaValidacion cadenaReglas;

    public AplicarCuponCommand(Carrito carrito, Cupon cupon, Usuario usuario, ReglaValidacion cadenaReglas) {
        this.carrito = carrito;
        this.cupon = cupon;
        this.usuario = usuario;
        this.cadenaReglas = cadenaReglas;
    }

    @Override
    public void ejecutar() {
        if (cadenaReglas.validar(cupon, carrito.getTotal(), usuario)) {
            double descuento = carrito.getTotal() * cupon.getDescuento() / 100;
            carrito.aplicarDescuento(descuento);
            System.out.println("✅ Cupón aplicado correctamente.");
        } else {
            System.out.println("❌ Cupón no válido.");
        }
    }

    @Override
    public void deshacer() {
        carrito.removerDescuento();
        System.out.println("⏪ Cupón revertido.");
    }
}
