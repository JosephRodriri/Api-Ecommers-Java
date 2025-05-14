package com.example.aaaaaa.Pedido;

public class PedidoMediator implements Mediator {
    private Pedido pedido;
    private ModuleLogistica logistica = new ModuleLogistica();
    private ModuleMensajeria mensajeria = new ModuleMensajeria();

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void notificar(EstadoPedido estado, String evento) {
        switch(evento) {
            case "avanzar":
                switch(estado.getNombre()) {
                    case "Pendiente":
                        pedido.cambiarEstado(new Confirmado(this));
                        logistica.enviarConfirmacion();
                        mensajeria.enviarSMS("Pedido confirmado");
                        break;
                    case "Confirmado":
                        pedido.cambiarEstado(new Enviado(this));
                        logistica.prepararEnvio();
                        mensajeria.enviarEmail("Pedido en camino");
                        break;
                    case "Enviado":
                        pedido.cambiarEstado(new Entregado(this));
                        logistica.confirmarEntrega();
                        mensajeria.enviarSMS("Pedido entregado");
                        break;
                    case "Entregado":
                        System.out.println("El pedido ya está entregado y no puede avanzar más.");
                        break;
                    case "Cancelado":
                        System.out.println("Pedido cancelado, no puede avanzar.");
                        break;
                }
                break;
            case "cancelar":
                if ("Entregado".equals(estado.getNombre())) {
                    System.out.println("No se puede cancelar un pedido entregado.");
                } else if ("Cancelado".equals(estado.getNombre())) {
                    System.out.println("Pedido ya está cancelado.");
                } else {
                    pedido.cambiarEstado(new Cancelado(this));
                    logistica.cancelarEnvio();
                    mensajeria.enviarEmail("Pedido cancelado");
                }
                break;
            default:
                System.out.println("Evento desconocido: " + evento);
        }
    }
}
