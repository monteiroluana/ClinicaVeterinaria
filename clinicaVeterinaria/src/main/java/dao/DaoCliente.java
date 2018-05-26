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
        String sql = "INSERT INTO CLIENTE(nome, endereco, telefone, enable) VALUES (?,?,?,?)";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getTelefone());
            stmt.setBoolean(4, true);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    //lista todos os clientes ou por nome (ou parte do nome)
    public List<Cliente> listar(String busca) throws ClassNotFoundException, SQLException {
        List<Cliente> lista = new ArrayList<Cliente>();

        String sql = "SELECT * FROM CLIENTE WHERE UPPER(nome) LIKE UPPER(?) AND enable=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + busca + "%");
            stmt.setBoolean(2, true);

            //Armazenará os resultados do banco de dados
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {
//                Integer id = resultados.getInt("idCliente");
//                String nome = resultados.getString("nome");
//                String endereco = resultados.getString("endereco");
//                String telefone = resultados.getString("telefone");

                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultados.getInt("idCliente"));
                cliente.setNome(resultados.getString("nome"));
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
    
    public void editar (Cliente cliente) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE CLIENTE SET nome=?, endereco=?, telefone=? WHERE idCliente=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getIdCliente());

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
}
