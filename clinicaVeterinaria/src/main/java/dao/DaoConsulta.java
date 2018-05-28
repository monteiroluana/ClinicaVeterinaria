package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import model.Consulta;

public class DaoConsulta {

    public void inserir(Consulta consulta) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO CONSULTA (dataConsulta,relato,idAnimal) VALUES (?,?,?)";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            Timestamp tData = new Timestamp(consulta.getDataConsulta().getTime());
            stmt.setTimestamp(1, tData);
            stmt.setString(2, consulta.getRelatoConsulta());
            stmt.setInt(3, consulta.getIdAnimal());
            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }
}
