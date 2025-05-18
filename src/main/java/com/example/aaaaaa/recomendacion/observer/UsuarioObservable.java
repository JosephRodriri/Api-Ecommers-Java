package com.example.aaaaaa.recomendacion.observer;

import com.example.aaaaaa.catalogo.domain.Producto;

public interface UsuarioObservable {
    void registrarObservador(ObservadorUsuario observador);
    void eliminarObservador(ObservadorUsuario observador);
    void notificarObservadores(EventoUsuario evento, Producto producto);
}
