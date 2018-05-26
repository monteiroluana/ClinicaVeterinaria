package ui;

import dao.DaoAnimal;
import dao.DaoCliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Animal;
import model.Cliente;

public class CadastrarAnimal extends javax.swing.JInternalFrame {

    public CadastrarAnimal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGpSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblDonoCpf = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtDonoCpf = new javax.swing.JTextField();
        jrbMacho = new javax.swing.JRadioButton();
        jrbFemea = new javax.swing.JRadioButton();
        btnCadastrar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Animal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNome.setText("Nome:");

        lblSexo.setText("Sexo:");

        lblEspecie.setText("Espécie:");

        lblIdade.setText("Idade:");

        lblDonoCpf.setText("Dono (CPF):");

        btnGpSexo.add(jrbMacho);
        jrbMacho.setText("Macho");

        btnGpSexo.add(jrbFemea);
        jrbFemea.setText("Fêmea");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDonoCpf)
                            .addComponent(lblIdade)
                            .addComponent(lblEspecie)
                            .addComponent(lblSexo)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbMacho)
                                .addGap(18, 18, 18)
                                .addComponent(jrbFemea))
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(jrbMacho)
                            .addComponent(jrbFemea))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecie)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblIdade))
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDonoCpf)
                    .addComponent(txtDonoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        DaoAnimal daoAnimal = new DaoAnimal();
        DaoCliente daoCliente = new DaoCliente();

        Animal animal = new Animal();
        Cliente cliente = new Cliente();

        //busca os dados do cliente atraves do cpf
        try {
            cliente = daoCliente.buscarPorCpf(txtDonoCpf.getText());

            if (cliente == null) {
                JOptionPane.showInternalMessageDialog(this, "Cliente/Dono não encontrado!");
                return;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastrarAnimal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }

        animal.setNome(txtNome.getText());
        animal.setEspecie(txtEspecie.getText());
        if (jrbMacho.isSelected()) {
            animal.setSexo("Macho");
        } else {
            animal.setSexo("Femea");
        }
        animal.setIdade(Integer.parseInt(txtIdade.getText()));
        animal.setIdCliente(cliente.getIdCliente());

        try {
            //insere os dados do animal no bd
            daoAnimal.inserir(animal);

        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAnimal.class.getName()).log(Level.SEVERE, null, ex);
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastrarAnimal.class.getName()).log(Level.SEVERE, null, ex);
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de Sucesso!
        JOptionPane.showMessageDialog(rootPane, "Animal inserido com sucesso.",
                "Cadastro efetuado!", JOptionPane.INFORMATION_MESSAGE);

        limparTela();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    public void limparTela() {
        txtNome.setText("");
        txtEspecie.setText("");
        txtIdade.setText("");
        txtDonoCpf.setText("");
        btnGpSexo.clearSelection();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup btnGpSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbFemea;
    private javax.swing.JRadioButton jrbMacho;
    private javax.swing.JLabel lblDonoCpf;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField txtDonoCpf;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
