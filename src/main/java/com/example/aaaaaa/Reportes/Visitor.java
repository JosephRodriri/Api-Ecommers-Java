package com.example.Reportes;

public interface Visitor {
    void visitarUsuario(Usuario usuario);
    void visitarCarrito(Carrito carrito);
    void visitarPedido(Pedido pedido);
    void visitarActividad(ActividadUsuario actividad);
}
