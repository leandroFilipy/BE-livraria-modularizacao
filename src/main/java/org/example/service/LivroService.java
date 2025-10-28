package org.example.service;

import org.example.model.Livro;
import org.example.repository.LivroRepository;
import org.example.view.BibliotecaView;

import java.sql.SQLException;

public class LivroService {

    BibliotecaView bibliotecaView = new BibliotecaView();

    public void cadastrarLivro() throws SQLException {


        var livroRepository = new LivroRepository();

        String tituloLivro = bibliotecaView.pedirTitulo();
        String autorLivro = bibliotecaView.pedirAutor();
        int anoLivro = bibliotecaView.anoLivro();
        var livro = new Livro(tituloLivro, autorLivro, anoLivro);

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
