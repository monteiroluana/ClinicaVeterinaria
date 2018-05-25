package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class DaoCliente {

    public void inserir(Cliente cliente) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO CLIENTE(nome, endereco, telefone, cpf, enable) VALUES (?,?,?,?,?)";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getCpf());
            stmt.setBoolean(5, true);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    public List<Cliente> listar() throws ClassNotFoundException, SQLException {
        List<Cliente> lista = new ArrayList<Cliente>();

        String sql = "SELECT * FROM CLIENTE WHERE enable=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setBoolean(1, true);

            //Armazenará os resultados do banco de dados
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {
                Integer id = resultados.getInt("idCliente");
                String nome = resultados.getString("nome");
                String endereco = resultados.getString("endereco");
                String telefone = resultados.getString("telefone");
                String cpf = resultados.getString("cpf");

                Cliente cliente = new Cliente();
                cliente.setIdCliente(id);
                cliente.setNome(nome);
                cliente.setEndereco(endereco);
                cliente.setTelefone(telefone);
                cliente.setCpf(cpf);
                lista.add(cliente);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conn.close();
        }
        return lista;
    }

    public Cliente buscarPorCpf(String cpf) throws ClassNotFoundException, SQLException {

        String sql = "SELECT * FROM CLIENTE WHERE cpf=? AND enable=?";

        Cliente cliente = null;
        Connection conn;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cpf);
            stmt.setBoolean(2, true);
            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(resultado.getInt("idCliente"));
                cliente.setNome(resultado.getString("nome"));
                cliente.setEndereco(resultado.getString("endereco"));
                cliente.setTelefone(resultado.getString("telefone"));
                cliente.setCpf(resultado.getString("cpf"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return cliente;
    }
}
