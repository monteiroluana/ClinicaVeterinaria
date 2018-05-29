package ui;

import dao.DaoCirurgiao;
import dao.DaoRadiologista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.CirurgiaoGeral;
import model.Radiologista;

public class EditarVeterinario extends javax.swing.JInternalFrame {

    CirurgiaoGeral cirurgiao = new CirurgiaoGeral();
    Radiologista radiologista = new Radiologista();

    public EditarVeterinario() {
        initComponents();
    }


    public CirurgiaoGeral getCirurgiao() {
        return cirurgiao;
    }

    public void setCirurgiao(CirurgiaoGeral cirurgiao) {
        this.cirurgiao = cirurgiao;
    }
    
     public Radiologista getRadiologista() {
        return radiologista;
    }

    public void setRadiologista(Radiologista radiologista) {
        this.radiologista = radiologista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEspecialidade = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Editar Veterinário");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                EditarVeterinario.this.internalFrameOpened(evt);
            }
        });

        lblNome.setText("Nome:");

        lblEndereco.setText("Endereço:");

        lblTelefone.setText("Telefone:");

        btnCadastrar.setText("Salvar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        jLabel1.setText("Registro:");

        txtRegistro.setEditable(false);
        txtRegistro.setToolTipText("não editável");

        jLabel2.setText("Especialidade:");

        txtEspecialidade.setEditable(false);
        txtEspecialidade.setToolTipText("não editável");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(lblNome)
                    .addComponent(lblEndereco)
                    .addComponent(lblTelefone)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNome)
                        .addComponent(txtEndereco)
                        .addComponent(txtTelefone)
                        .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked

        DaoCirurgiao daoCirurgiao = new DaoCirurgiao();
        DaoRadiologista daoRadiologista = new DaoRadiologista();

        //Se for Cirurgião Geral
        if (cirurgiao != null) {
            cirurgiao.setNome(txtNome.getText());
            cirurgiao.setEndereco(txtEndereco.getText());
            cirurgiao.setTelefone(txtTelefone.getText());

            try {
                daoCirurgiao.editar(cirurgiao);
                //Exibe mensagem de Sucesso!
                JOptionPane.showMessageDialog(rootPane, "Veterinário atualizado com sucesso.",
                        "Cadastro atualizado!", JOptionPane.INFORMATION_MESSAGE);

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
        } else {
            radiologista.setNome(txtNome.getText());
            radiologista.setEndereco(txtEndereco.getText());
            radiologista.setTelefone(txtTelefone.getText());

            try {
                daoRadiologista.editar(radiologista);
                //Exibe mensagem de Sucesso!
                JOptionPane.showMessageDialog(rootPane, "Veterinário atualizado com sucesso.",
                        "Cadastro atualizado!", JOptionPane.INFORMATION_MESSAGE);

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

        this.dispose();

    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_internalFrameOpened
        System.out.println("radio " + radiologista.getNome());
        System.out.println(radiologista.getEndereco());
        System.out.println(radiologista.getTelefone());
        System.out.println(radiologista.getConter());
        System.out.println("cirurgiao " + cirurgiao.getNome());
        System.out.println("~~~~~FIM~~~~~");

        if (cirurgiao == null) {
            txtNome.setText(radiologista.getNome());
            txtEndereco.setText(radiologista.getEndereco());
            txtTelefone.setText(radiologista.getTelefone());
            txtRegistro.setText(radiologista.getConter());
            txtEspecialidade.setText("Radiologista");
        } else {
            txtNome.setText(cirurgiao.getNome());
            txtEndereco.setText(cirurgiao.getEndereco());
            txtTelefone.setText(cirurgiao.getTelefone());
            txtRegistro.setText(cirurgiao.getCrm());
            txtEspecialidade.setText("Cirurgião Geral");
        }
    }//GEN-LAST:event_internalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegistro;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
