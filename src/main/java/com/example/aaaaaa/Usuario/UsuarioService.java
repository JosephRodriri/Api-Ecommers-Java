package com.example.aaaaaa.Usuario;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public void createUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
