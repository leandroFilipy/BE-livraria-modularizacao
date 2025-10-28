package org.example.view;

import java.util.Scanner;

public class EmprestimoView {

    Scanner read = new Scanner(System.in);


    public int pedirIdLivro(){

        System.out.println("===================================================================");
        System.out.println("                       Insira o ID do livro                        ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" Insira aqui: ");
        int idLivro = read.nextInt();
        read.nextLine();

        return idLivro;
    }
    public String pedirNomeUsuario(){

        System.out.println("===================================================================");
        System.out.println("                   Insira o Seu nome de Usuário                    ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" Insira aqui: ");
        String nomeUsuario = read.nextLine();

        return nomeUsuario;
    }
}
