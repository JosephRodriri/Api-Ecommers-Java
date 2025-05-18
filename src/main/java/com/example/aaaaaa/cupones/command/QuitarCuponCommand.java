package com.example.aaaaaa.cupones.command;

public class QuitarCuponCommand implements CarritoCommand{
    private Carrito carrito;

    public QuitarCuponCommand(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void ejecutar() {
        carrito.removerDescuento();
        System.out.println("❌ Cupón eliminado del carrito.");
    }

    @Override
    public void deshacer() {
        // Aquí podrías tener lógica para restaurar descuento anterior
    }
}
