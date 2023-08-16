package model;

import model.interfaces.AparelhoTelefonico;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

}