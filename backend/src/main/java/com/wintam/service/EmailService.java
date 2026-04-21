package com.wintam.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    public void sendVerificationEmail(String email, String code){
        SimpleMailMessage message= new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Wintam- Verifica tu cuenta");
        message.setText("Tu código de verificación es: "+code+
                "\n\n Introdúcelo en la app para activar tu cuenta." +
                "\n Este código expirará en 24 horas.");
        mailSender.send(message);
    }
}
