package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Radiologista;

public class DaoRadiologista {

    public void inserir(Radiologista radiologista) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO radiologista(nome, endereco, telefone, conter, enable) VALUES (?,?,?,?,?)";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, radiologista.getNome());
            stmt.setString(2, radiologista.getEndereco());
            stmt.setString(3, radiologista.getTelefone());
            stmt.setString(4, radiologista.getConter());
            stmt.setBoolean(5, true);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    //lista todos os veterinários ou por nome (ou parte do nome)
    public List<Radiologista> listar(String busca) throws ClassNotFoundException, SQLException {
        List<Radiologista> lista = new ArrayList<Radiologista>();

        String sql = "SELECT * FROM radiologista WHERE (UPPER(nome) LIKE UPPER(?) "
                + "OR UPPER(conter) LIKE UPPER(?)) AND enable=?";
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
                Radiologista radiologista = new Radiologista();
                radiologista.setIdVeterinario(resultados.getInt("idRadiologista"));
                radiologista.setNome(resultados.getString("nome"));
                radiologista.setEndereco(resultados.getString("endereco"));
                radiologista.setTelefone(resultados.getString("telefone"));
                radiologista.setConter(resultados.getString("conter"));
                lista.add(radiologista);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conn.close();
        }
        return lista;
    }

    //exclusão lógica
    public void excluir(Integer idRadiologista) throws SQLException, ClassNotFoundException {

        String sql = "UPDATE radiologista SET enable = ? WHERE idRadiologista = ?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setBoolean(1, false);
            stmt.setInt(2, idRadiologista);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    public void editar(Radiologista radiologista) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE radiologista SET nome=?, endereco=?, telefone=?, conter=? WHERE idRadiologista=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, radiologista.getNome());
            stmt.setString(2, radiologista.getEndereco());
            stmt.setString(3, radiologista.getTelefone());
            stmt.setString(4, radiologista.getConter());
            stmt.setInt(5, radiologista.getIdVeterinario());

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    public Radiologista obter(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM radiologista WHERE idRadiologista=? AND enable=?";

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

                Radiologista radiologista = new Radiologista();
                radiologista.setIdVeterinario(id);
                radiologista.setNome(resultado.getString("nome"));
                radiologista.setConter(resultado.getString("conter"));
                radiologista.setEndereco(resultado.getString("endereco"));
                radiologista.setTelefone(resultado.getString("telefone"));

                //Retorna o radiologista
                return radiologista;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }

        return null;
    }
    
    public Radiologista buscarPorRegistro(String registro) throws ClassNotFoundException, SQLException {

        String sql = "SELECT * FROM radiologista WHERE conter=? AND enable=?";

        Radiologista radiologista = null;
        Connection conn;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, registro);
            stmt.setBoolean(2, true);
            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                radiologista = new Radiologista();

                radiologista.setIdVeterinario(res.getInt("idCirurgiao"));
                radiologista.setNome(res.getString("nome"));
                radiologista.setConter(res.getString("conter"));
                radiologista.setEndereco(res.getString("endereco"));
                radiologista.setTelefone(res.getString("telefone"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return radiologista;
    }
}
