package application;

import model.AparelhoTelefonicoImpl;
import model.NavegadorNaInternetImpl;
import model.ReprodutorMusicalImpl;
import model.interfaces.AparelhoTelefonico;
import model.interfaces.NavegadorNaInternet;
import model.interfaces.ReprodutorMusical;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        AparelhoTelefonico iPhoneFuncTel = new AparelhoTelefonicoImpl();
        NavegadorNaInternet iPhoneFuncNavegador = new NavegadorNaInternetImpl();
        ReprodutorMusical iPhoneFuncReprMus = new ReprodutorMusicalImpl();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inicializando o iPhone\n");
        System.out.println("Menu Principal - Informe a opção desejada:\n" +
                "1-Funções do aparelho telefônico\n" +
                "2-Funções do navegador na internet\n" +
                "3-Funções do reprodutor musical\n" +
                "4-Desligar o aparelho\n");
        System.out.print("Digite: ");
        int n = scanner.nextByte();

        if (n == 1) {
            System.out.println("Informe a opção desejada:\n" +
                    "1-Ligar\n" +
                    "2-Atender\n" +
                    "3-Iniciar correio de voz\n" +
                    "4-Sair\n");
            System.out.print("Digite: ");
            n = scanner.nextByte();
            switch (n) {
                case 1:
                    iPhoneFuncTel.ligar();
                    break;
                case 2:
                    iPhoneFuncTel.atender();
                    break;
                case 3:
                    iPhoneFuncTel.iniciarCorreioVoz();
                    break;
                default:
                    System.out.println("Saindo");
                    break;
            }
        } else if (n == 2) {
            System.out.println("Informe a opção desejada:\n" +
                    "1-Exibir página\n" +
                    "2-Adicionando nova aba\n" +
                    "3-Atualizar página\n" +
                    "4-Sair\n");
            System.out.print("Digite: ");
            n = scanner.nextByte();
            switch (n) {
                case 1:
                    iPhoneFuncNavegador.exibirPagina();
                    break;
                case 2:
                    iPhoneFuncNavegador.adicionarNovaAba();
                    break;
                case 3:
                    iPhoneFuncNavegador.atualizarPagina();
                    break;
                default:
                    System.out.println("Saindo");
                    break;
            }
        } else if (n == 3) {
            System.out.println("Informe a opção desejada:\n" +
                    "1-Tocar\n" +
                    "2-Pausar\n" +
                    "3-Selecionar música\n" +
                    "4-Sair\n");
            System.out.print("Digite: ");
            n = scanner.nextByte();
            switch (n) {
                case 1:
                    iPhoneFuncReprMus.tocar();
                    break;
                case 2:
                    iPhoneFuncReprMus.pausar();
                    break;
                case 3:
                    iPhoneFuncReprMus.selecionarMusica();
                    break;
                default:
                    System.out.println("Saindo");
                    break;
            }
        } else {
            System.out.println("Desligando...");
        }

        scanner.close();
    }
}