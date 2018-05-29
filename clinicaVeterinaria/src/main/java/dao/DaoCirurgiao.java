package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CirurgiaoGeral;

public class DaoCirurgiao {

    public void inserir(CirurgiaoGeral cirurgiao) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO cirurgiaoGeral(nome, endereco, telefone, crm, enable) VALUES (?,?,?,?,?)";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cirurgiao.getNome());
            stmt.setString(2, cirurgiao.getEndereco());
            stmt.setString(3, cirurgiao.getTelefone());
            stmt.setString(4, cirurgiao.getCrm());
            stmt.setBoolean(5, true);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    //lista todos os veterinários por nome (ou parte do nome) ou registro
    public List<CirurgiaoGeral> listar(String busca) throws ClassNotFoundException, SQLException {
        List<CirurgiaoGeral> lista = new ArrayList<CirurgiaoGeral>();

        String sql = "SELECT * FROM cirurgiaoGeral WHERE (UPPER(nome) LIKE UPPER(?) "
                + "OR UPPER(crm) LIKE UPPER(?)) AND enable=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + busca + "%");
            stmt.setString(2, busca);
            stmt.setBoolean(3, true);

            //Armazenará os resultados do banco de dados
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {
                CirurgiaoGeral cirurgiao = new CirurgiaoGeral();
                cirurgiao.setIdVeterinario(resultados.getInt("idCirurgiao"));
                cirurgiao.setNome(resultados.getString("nome"));
                cirurgiao.setEndereco(resultados.getString("endereco"));
                cirurgiao.setTelefone(resultados.getString("telefone"));
                cirurgiao.setCrm(resultados.getString("crm"));
                lista.add(cirurgiao);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conn.close();
        }
        return lista;
    }

    //exclusão lógica
    public void excluir(Integer idCirurgiao) throws SQLException, ClassNotFoundException {

        String sql = "UPDATE cirurgiaoGeral SET enable = ? WHERE idCirurgiao = ?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setBoolean(1, false);
            stmt.setInt(2, idCirurgiao);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    public void editar(CirurgiaoGeral cirurgiao) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE cirurgiaoGeral SET nome=?, endereco=?, telefone=?, crm=? WHERE idCirurgiao=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cirurgiao.getNome());
            stmt.setString(2, cirurgiao.getEndereco());
            stmt.setString(3, cirurgiao.getTelefone());
            stmt.setString(4, cirurgiao.getCrm());
            stmt.setInt(5, cirurgiao.getIdVeterinario());

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    public CirurgiaoGeral obter(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM cirurgiaoGeral WHERE idCirurgiao=? AND enable=?";

        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.setBoolean(2, true);
            stmt.execute();

            //Armazenará os resultados do banco de dados
            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {

                CirurgiaoGeral cirurgiao = new CirurgiaoGeral();
                cirurgiao.setIdVeterinario(id);
                cirurgiao.setNome(resultado.getString("nome"));
                cirurgiao.setCrm(resultado.getString("crm"));
                cirurgiao.setEndereco(resultado.getString("endereco"));
                cirurgiao.setTelefone(resultado.getString("telefone"));

                //Retorna o radiologista
                return cirurgiao;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }

        return null;
    }

    public CirurgiaoGeral buscarPorRegistro(String registro) throws ClassNotFoundException, SQLException {

        String sql = "SELECT * FROM cirurgiaoGeral WHERE crm=? AND enable=?";

        CirurgiaoGeral cirurgiao = null;
        Connection conn;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, registro);
            stmt.setBoolean(2, true);
            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                cirurgiao = new CirurgiaoGeral();

                cirurgiao.setIdVeterinario(res.getInt("idCirurgiao"));
                cirurgiao.setNome(res.getString("nome"));
                cirurgiao.setCrm(res.getString("crm"));
                cirurgiao.setEndereco(res.getString("endereco"));
                cirurgiao.setTelefone(res.getString("telefone"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return cirurgiao;
    }

}
