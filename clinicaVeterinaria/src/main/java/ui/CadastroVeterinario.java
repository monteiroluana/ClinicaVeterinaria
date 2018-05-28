package ui;

import dao.DaoCirurgiao;
import dao.DaoRadiologista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.CirurgiaoGeral;
import model.Radiologista;

public class CadastroVeterinario extends javax.swing.JInternalFrame {

    public CadastroVeterinario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Veterinário");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        lblTelefone.setText("Telefone:");

        lblEndereco.setText("Endereço:");

        lblNome.setText("Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lblTelefone)
                            .addComponent(lblEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnCadastrar)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addComponent(btnCadastrar)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        CirurgiaoGeral cirurgiao = new CirurgiaoGeral();
        DaoCirurgiao daoCirurgiao = new DaoCirurgiao();

        Radiologista radiologista = new Radiologista();
        DaoRadiologista daoRadiologista = new DaoRadiologista();

        
        //Escolhendo a área de atuação do veterinario
        Object opcoes[] = {"Cirurgião Geral", "Radiologista"};
        int area = JOptionPane.showOptionDialog(rootPane, "Qual área de especialização ?", "Especialização", WIDTH, HEIGHT, frameIcon, opcoes, "");

        //Se for Cirurgião Geral
        if (area == 0) {
            cirurgiao.setCrm(Integer.parseInt(JOptionPane.showInputDialog("Registro CRM do Médico Cirurgião")));
            cirurgiao.setNome(txtNome.getText());
            cirurgiao.setEndereco(txtEndereco.getText());
            cirurgiao.setTelefone(txtTelefone.getText());

            try {
                daoCirurgiao.inserir(cirurgiao);
                //Exibe mensagem de Sucesso!
                JOptionPane.showMessageDialog(rootPane, "Veterinário inserido com sucesso.",
                        "Cadastro efetuado!", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                Logger.getLogger(CadastroVeterinario.class.getName()).log(Level.SEVERE, null, ex);

                //Exibe mensagens de erro para o usuário
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastroVeterinario.class.getName()).log(Level.SEVERE, null, ex);

                //Exibe mensagens de erro para o usuário
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }

            //Se for Radiologista
        } else if (area == 1) {
            radiologista.setConter(Integer.parseInt(JOptionPane.showInputDialog("Registro CONTER do Radiologista")));
            radiologista.setNome(txtNome.getText());
            radiologista.setEndereco(txtEndereco.getText());
            radiologista.setTelefone(txtTelefone.getText());

            try {
                daoRadiologista.inserir(radiologista);
                //Exibe mensagem de Sucesso!
                JOptionPane.showMessageDialog(rootPane, "Veterinário inserido com sucesso.",
                        "Cadastro efetuado!", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                Logger.getLogger(CadastroVeterinario.class.getName()).log(Level.SEVERE, null, ex);

                //Exibe mensagens de erro para o usuário
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastroVeterinario.class.getName()).log(Level.SEVERE, null, ex);

                //Exibe mensagens de erro para o usuário
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }

        limparTela();
    }//GEN-LAST:event_btnCadastrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    public void limparTela() {
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
    }

}
