package kauanrod.arquiteturaspring.montadora;

import java.awt.*;

public class Carro {
    private String modelo;
    private Color cor;
    private Motor Motor;
    private Montadora montadora;

    public Carro(Motor motor) {
        Motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return Motor;
    }

    public void setMotor(Motor motor) {
        Motor = motor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
}
