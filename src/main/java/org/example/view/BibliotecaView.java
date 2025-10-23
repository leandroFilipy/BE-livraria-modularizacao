package org.example.view;

import java.util.Scanner;

public class BibliotecaView {

    Scanner read = new Scanner(System.in);

    public void mostrarMenu(){

        System.out.println("===================================================================");
        System.out.println("                        Welcome to LeaBrary                        ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" 1 - Opção1");
        System.out.println(" 2 - Opção2");
        System.out.println(" 3 - Opção3");
        capturaOpcao();

    }

    public int capturaOpcao(){

        int opcao = read.nextInt();

        return opcao;
    }

}
