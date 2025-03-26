package kauanrod.arquiteturaspring.montadora.configuration;

import kauanrod.arquiteturaspring.montadora.Motor;
import kauanrod.arquiteturaspring.montadora.TipoMotor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(@Value("${app.montadora.motor-padrao}") Integer cavalos) {
        var motor = new Motor();
        motor.setCavalos(cavalos);
        motor.setCilindros(4);
        motor.setLitragem(1.6);
        motor.setModelo("XPTO-01");
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

    @Primary
    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO-0");
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setLitragem(1.4);
        motor.setModelo("TH-40");
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
