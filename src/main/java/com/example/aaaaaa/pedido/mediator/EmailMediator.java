package com.example.aaaaaa.pedido.mediator;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailMediator implements Notificador {

    private final JavaMailSender mailSender;

    @Override
    public void notificar(String mensaje, String destino) {
        SimpleMailMessage correo = new SimpleMailMessage();
        correo.setTo(destino);
        correo.setSubject("Notificación de Pedido");
        correo.setText(mensaje);
        mailSender.send(correo);
    }
}
