package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Animal;

public class DaoAnimal {

    public void inserir(Animal animal) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO ANIMAL (nome, especie, sexo, idade, idCliente, enable) VALUES (?, ?, ?, ?, ?, ?)";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setString(3, animal.getSexo());
            stmt.setInt(4, animal.getIdade());
            stmt.setInt(5, animal.getIdCliente());
            stmt.setBoolean(6, true);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }

    public List<Animal> listar(String busca) throws ClassNotFoundException, SQLException {
        List<Animal> lista = new ArrayList<Animal>();

        String sql = "SELECT * FROM ANIMAL WHERE UPPER(nome) LIKE UPPER(?) AND enable=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, "%" + busca + "%");
            stmt.setBoolean(2, true);

            //Armazenará os resultados do banco de dados
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {
                Integer idAnimal = resultados.getInt("idAnimal");
                String nome = resultados.getString("nome");
                String especie = resultados.getString("especie");
                String sexo = resultados.getString("sexo");
                Integer idCliente = resultados.getInt("idCliente");
                Integer idade = resultados.getInt("idade");

                Animal animal = new Animal();
                animal.setIdAnimal(idAnimal);
                animal.setIdCliente(idCliente);
                animal.setNome(nome);
                animal.setEspecie(especie);
                animal.setSexo(sexo);
                animal.setIdade(idade);
                lista.add(animal);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            conn.close();
        }
        return lista;
    }
    
    //exclusão lógica
    public void excluir(Integer idAnimal) throws SQLException, ClassNotFoundException {

        String sql = "UPDATE animal SET enable = ? WHERE idAnimal = ?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setBoolean(1, false);
            stmt.setInt(2, idAnimal);

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }
    
    public void editar(Animal animal) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE animal SET nome=?, especie=?, sexo=?, idade=?, idCliente=? "
                + "WHERE idAnimal=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setString(3, animal.getSexo());
            stmt.setInt(4, animal.getIdade());
            stmt.setInt(5, animal.getIdCliente());
            stmt.setInt(6, animal.getIdAnimal());

            stmt.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }
    }
    
    public Animal obter(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM animal WHERE idAnimal=? AND enable=?";

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

                Animal animal = new Animal();
                animal.setIdAnimal(id);
                animal.setNome(resultado.getString("nome"));
                animal.setEspecie(resultado.getString("especie"));
                animal.setSexo(resultado.getString("sexo"));
                animal.setIdade(resultado.getInt("idade"));
                animal.setIdCliente(resultado.getInt("idCliente"));

                //Retorna o cliente
                return animal;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        } finally {
            conn.close();
        }

        return null;
    }

}
