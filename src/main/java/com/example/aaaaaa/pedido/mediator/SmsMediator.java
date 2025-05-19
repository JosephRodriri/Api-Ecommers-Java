package com.example.aaaaaa.pedido.mediator;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SmsMediator implements Notificador {

    @Override
    public void notificar(String mensaje,String destino) {
        System.out.println("SMS a " + destino + ": " + mensaje);
    }
}
