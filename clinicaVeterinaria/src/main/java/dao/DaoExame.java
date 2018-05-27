package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Exame;

public class DaoExame {

    public void inserir(Exame exame) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO EXAME (descricao) VALUES (?)";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, exame.getDescricao());
            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }
}
