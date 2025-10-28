package org.example.repository;

import org.example.infraestrutura.Conexao;
import org.example.model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

    public void inserirLivro(Livro livro)throws SQLException{

        String query = "INSERT INTO livros (titulo, autor, ano, disponibilidade) VALUES (?,?,?,?);";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());
            stmt.setBoolean(4, true);
            stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Livro> listarLivro(Livro livro) throws SQLException{
        List<Livro> livros = new ArrayList<>();

        String query = "SELECT id, titulo, autor, ano, disponivel FROM livros;";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){

                Livro livro2 = new Livro(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getInt("ano"),
                        rs.getBoolean("disponibilidade")
                );

                System.out.println("ID: " + livro2.getId());
                System.out.println("Título: " + livro2.getTitulo());
                System.out.println("Autor: " + livro2.getAutor());
                System.out.println("Ano: " + livro2.getAno());
                System.out.println("Disponibilidade: " + livro2.getDisponivel());
                livros.add(livro2);
            }

        }
        return livros;
    }

    public void atualizarDisponibilidade (Livro livro, boolean disponibilidade, int id) throws SQLException {

        String query = "UPDATE livros SET disponibilidade = ? WHERE id = ?;";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){


            stmt.setBoolean(1, disponibilidade);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
