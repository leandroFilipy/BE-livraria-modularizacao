package org.example.repository;

import org.example.infraestrutura.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmprestimoRepository {

    public boolean verficiarDisponibilidadeLivro(boolean disponivel) throws SQLException {

        String query = "SELECT COUNT(*) FROM emprestimos WHERE disponivel = true;";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){


            stmt.setBoolean(1, disponivel);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){

                return rs.getInt(1) > 0;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public void 
}
