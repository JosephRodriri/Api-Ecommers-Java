package com.example.aaaaaa.pedido.service;

import com.example.aaaaaa.Usuario.Usuario;
import com.example.aaaaaa.pedido.dto.PedidoDTO;
import com.example.aaaaaa.pedido.mediator.Notificador;
import com.example.aaaaaa.pedido.model.Pedido;
import com.example.aaaaaa.pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepo;
    private final Notificador emailMediator;

    public PedidoDTO crearPedido(Pedido pedido, Usuario usuario) {
        pedido.setUsuario(usuario);
        pedido.setEstado("PENDIENTE");
        pedidoRepo.save(pedido);

        emailMediator.notificar(
                "Pedido creado con estado PENDIENTE",
                usuario.getUsername()
        );

        return new PedidoDTO(
                pedido.getId(),
                pedido.getDescripcion(),
                pedido.getEstado(),
                usuario.getUsername()
        );
    }

    public PedidoDTO avanzarEstado(Integer id) {
        Pedido pedido = pedidoRepo.findById(id).orElseThrow();
        pedido.avanzarEstado();
        pedidoRepo.save(pedido);

        emailMediator.notificar(
                "Estado actualizado a: " + pedido.getEstado(),
                pedido.getUsuario().getUsername()
        );

        return new PedidoDTO(
                pedido.getId(),
                pedido.getDescripcion(),
                pedido.getEstado(),
                pedido.getUsuario().getUsername()
        );
    }
}
