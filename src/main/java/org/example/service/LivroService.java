package org.example.service;

import org.example.model.Livro;
import org.example.repository.LivroRepository;

import java.sql.SQLException;

public class LivroService {

    public void cadastrarLivro() throws SQLException {

        var livro = new Livro();
        var livroRepository = new LivroRepository();

        livroRepository.inserirLivro(livro);
    }
    public void listarLivro() throws SQLException {

        var livro = new Livro();
        var livroRepository = new LivroRepository();

        livroRepository.listarLivro(livro);
    }

    public void atualzarDisponibilidade() throws SQLException {

        var livro = new Livro();
        var livroRepository = new LivroRepository();

        livroRepository.listarLivro(livro);
    }


}
