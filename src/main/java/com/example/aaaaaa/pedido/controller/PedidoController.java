package com.example.aaaaaa.pedido.controller;

import com.example.aaaaaa.Usuario.UserRepository;
import com.example.aaaaaa.Usuario.Usuario;
import com.example.aaaaaa.pedido.dto.PedidoDTO;
import com.example.aaaaaa.pedido.model.Pedido;
import com.example.aaaaaa.pedido.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;
    private final UserRepository userRepository;


    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<PedidoDTO> crearPedido(@RequestBody Pedido pedido, Principal principal) {
        Usuario usuario = obtenerUsuarioAutenticado(principal); // implementar
        return ResponseEntity.ok(pedidoService.crearPedido(pedido, usuario));
    }

    @PutMapping("/{id}/avanzar")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<PedidoDTO> avanzarEstado(@PathVariable Integer id) {
        return ResponseEntity.ok(pedidoService.avanzarEstado(id));
    }
    private Usuario obtenerUsuarioAutenticado(Principal principal) {
        return userRepository.findByUsername(principal.getName())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }
}
