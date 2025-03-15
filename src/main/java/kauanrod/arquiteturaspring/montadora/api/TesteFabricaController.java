package kauanrod.arquiteturaspring.montadora.api;

import kauanrod.arquiteturaspring.montadora.CarroStatus;
import kauanrod.arquiteturaspring.montadora.Chave;
import kauanrod.arquiteturaspring.montadora.HondaHRV;
import kauanrod.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {
    @Autowired
    @Turbo
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
