package kauanrod.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
    public void enviar(String mensagem) {
        System.out.printf("Enviado e-mail: %s", mensagem);
//        System.out.println("Enviado e-mail: " + mensagem);
    }
}
