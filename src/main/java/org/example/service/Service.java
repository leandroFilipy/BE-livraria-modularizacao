package org.example.service;

import java.sql.SQLException;

public class Service {

    public void gerenciar(int opcao2, LivroService livroService) throws SQLException {

        switch(opcao2){


            case 1 ->{

                livroService.cadastrarLivro();

            }
        }

    }
}
