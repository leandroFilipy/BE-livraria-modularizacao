package org.example.view;

import java.util.Scanner;

public class BibliotecaView {

    Scanner read = new Scanner(System.in);

    public int mostrarMenu(){

        System.out.println("===================================================================");
        System.out.println("                        BemVindo a LeaBrary                        ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" 1 - Cadastrar Livro");
        System.out.println(" 2 - Fazer Empréstimo");
        System.out.println(" 3 - Opção3");


        return capturaOpcao();
    }

    public int capturaOpcao(){

        int opcao = read.nextInt();

        read.nextLine();

        return opcao;
    }
    public String pedirTitulo(){

        System.out.println("===================================================================");
        System.out.println("                     Insira o Título do livro                      ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" Insira aqui: ");
        String tituloLivro = read.nextLine();

        return tituloLivro;
    }
    public String pedirAutor(){

        System.out.println("===================================================================");
        System.out.println("                      Insira o Autor do livro                      ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" Insira aqui: ");
        String autorLivro = read.nextLine();

        return autorLivro;
    }
    public int anoLivro(){

        System.out.println("===================================================================");
        System.out.println("                       Insira o Ano do livro                       ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" Insira aqui: ");
        int anoLivro = read.nextInt();

        read.nextLine();

        return anoLivro;
    }

}
