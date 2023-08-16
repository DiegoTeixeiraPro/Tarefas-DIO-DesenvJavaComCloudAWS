package model;

import model.interfaces.NavegadorNaInternet;

public class NavegadorNaInternetImpl implements NavegadorNaInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}