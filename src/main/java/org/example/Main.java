package org.example;


import org.example.service.LivroService;
import org.example.service.Service;
import org.example.view.BibliotecaView;

import java.sql.SQLException;
import java.util.BitSet;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        var bibliotecaView = new BibliotecaView();
        var service = new Service();
        var livroService = new LivroService();

        while(true){


            try{

            int opcao2 = bibliotecaView.mostrarMenu();

            service.gerenciar(opcao2, livroService);

            }catch (InputMismatchException | SQLException e){
                e.printStackTrace();
            }
        }

    }
}