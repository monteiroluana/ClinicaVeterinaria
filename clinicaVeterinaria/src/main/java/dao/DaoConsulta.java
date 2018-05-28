package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import model.Consulta;

public class DaoConsulta {

    public void inserir(Consulta consulta) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO CONSULTA (dataConsulta,relato,idAnimal,enable) VALUES (?,?,?,?)";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            Timestamp tData = new Timestamp(consulta.getDataConsulta().getTime());
            stmt.setTimestamp(1, tData);
            stmt.setString(2, consulta.getRelatoConsulta());
            stmt.setInt(3, consulta.getIdAnimal());
            stmt.setBoolean(4, true);
            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }
    //lista todos os clientes ou por nome (ou parte do nome) ou por cpf

    public List<Consulta> listar() throws ClassNotFoundException, SQLException {

        List<Consulta> lista = new ArrayList<Consulta>();
        String sql = "SELECT * FROM CONSULTA WHERE enable=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setBoolean(1, true);

            //Armazenará os resultados do banco de dados
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {

                Consulta consulta = new Consulta();

                consulta.setDataConsulta(resultados.getString("dataConsulta"));
                consulta.setIdConsulta(resultados.getInt("idConsulta"));
                consulta.setIdAnimal(resultados.getInt("idAnimal"));
                consulta.setRelatoConsulta(resultados.getString("relato"));

                lista.add(consulta);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conn.close();
        }
        return lista;
    }
}
