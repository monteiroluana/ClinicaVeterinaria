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

    public List<Animal> listar() throws ClassNotFoundException, SQLException {
        List<Animal> lista = new ArrayList<Animal>();

        String sql = "SELECT * FROM ANIMAL WHERE enable=?";
        Connection conn = null;

        try {
            conn = Conexao.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setBoolean(1, true);

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
}
