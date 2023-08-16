package model;

import model.interfaces.ReprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música...");
    }
}