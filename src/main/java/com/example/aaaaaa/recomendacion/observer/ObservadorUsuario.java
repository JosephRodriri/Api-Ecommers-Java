package com.example.aaaaaa.recomendacion.observer;

import com.example.aaaaaa.catalogo.domain.Producto;
import com.example.aaaaaa.catalogo.domain.Usuario;

public interface ObservadorUsuario {
    void actualizar(EventoUsuario evento, Producto producto, Usuario usuario);
}
