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
        String sql = "INSERT INTO CLIENTE(nome, cpf, endereco, telefone, enable) VALUES (?,?,?,?,?)";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getTelefone());
            stmt.setBoolean(5, true);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    //lista todos os clientes ou por nome (ou parte do nome) ou por cpf
    public List<Cliente> listar(String busca) throws ClassNotFoundException, SQLException {
        List<Cliente> lista = new ArrayList<Cliente>();

        String sql = "SELECT * FROM CLIENTE WHERE (UPPER(nome) LIKE UPPER(?) "
                + "OR UPPER(cpf) LIKE UPPER(?)) AND enable=?";
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

                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultados.getInt("idCliente"));
                cliente.setNome(resultados.getString("nome"));
                cliente.setCpf(resultados.getString("cpf"));
                cliente.setEndereco(resultados.getString("endereco"));
                cliente.setTelefone(resultados.getString("telefone"));
                lista.add(cliente);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conn.close();
        }
        return lista;
    }

    //exclusão lógica
    public void excluir(Integer idCliente) throws SQLException, ClassNotFoundException {

        String sql = "UPDATE cliente SET enable = ? WHERE idCliente = ?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setBoolean(1, false);
            stmt.setInt(2, idCliente);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    public void editar(Cliente cliente) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE CLIENTE SET nome=?, cpf=?, endereco=?, telefone=? WHERE idCliente=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getTelefone());
            stmt.setInt(5, cliente.getIdCliente());

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    public Cliente obter(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM cliente WHERE idCliente=? AND enable=?";

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

                Cliente cliente = new Cliente();
                cliente.setIdCliente(id);
                cliente.setNome(resultado.getString("nome"));
                cliente.setCpf(resultado.getString("cpf"));
                cliente.setEndereco(resultado.getString("endereco"));
                cliente.setTelefone(resultado.getString("telefone"));

                //Retorna o cliente
                return cliente;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }

        return null;
    }

    public Cliente buscarPorCpf(String cpf) throws ClassNotFoundException, SQLException {

        String sql = "SELECT * FROM CLIENTE WHERE cpf=? AND enable=?";

        Cliente cli = null;
        Connection conn;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cpf);
            stmt.setBoolean(2, true);
            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                cli = new Cliente();

                cli.setIdCliente(res.getInt("idCliente"));
                cli.setNome(res.getString("nome"));
                cli.setCpf(res.getString("cpf"));
                cli.setEndereco(res.getString("endereco"));
                cli.setTelefone(res.getString("telefone"));

            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return cli;
    }
    
     public Cliente buscarPorId(Integer idCliente) throws ClassNotFoundException, SQLException {

        String sql = "SELECT * FROM CLIENTE WHERE idCliente=? AND enable=?";

        Cliente cli = null;
        Connection conn;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idCliente);
            stmt.setBoolean(2, true);
            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                cli = new Cliente();

                cli.setIdCliente(res.getInt("idCliente"));
                cli.setNome(res.getString("nome"));
                cli.setCpf(res.getString("cpf"));
                cli.setEndereco(res.getString("endereco"));
                cli.setTelefone(res.getString("telefone"));

            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return cli;
    }

}
