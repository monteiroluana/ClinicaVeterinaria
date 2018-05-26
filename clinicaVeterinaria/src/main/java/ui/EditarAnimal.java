package ui;

import dao.DaoAnimal;
import dao.DaoCliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Animal;
import model.Cliente;

public class EditarAnimal extends javax.swing.JInternalFrame {

    //Armazena o animal em edição
    Animal animal = new Animal();

    public EditarAnimal() {
        initComponents();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGpSexo = new javax.swing.ButtonGroup();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        jrbMacho = new javax.swing.JRadioButton();
        jrbFemea = new javax.swing.JRadioButton();
        txtEspecie = new javax.swing.JTextField();
        lblEspecie = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        txtDonoCpf = new javax.swing.JTextField();
        lblDonoCpf = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setTitle("Editar Animal");
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
                EditarAnimal.this.internalFrameOpened(evt);
            }
        });

        lblNome.setText("Nome:");

        lblSexo.setText("Sexo:");

        btnGpSexo.add(jrbMacho);
        jrbMacho.setText("Macho");

        btnGpSexo.add(jrbFemea);
        jrbFemea.setText("Fêmea");

        lblEspecie.setText("Espécie:");

        lblIdade.setText("Idade:");

        lblDonoCpf.setText("Dono (CPF):");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDonoCpf)
                    .addComponent(lblIdade)
                    .addComponent(lblEspecie)
                    .addComponent(lblSexo)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbMacho)
                        .addGap(18, 18, 18)
                        .addComponent(jrbFemea))
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(jrbMacho)
                            .addComponent(jrbFemea))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecie)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblIdade))
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDonoCpf)
                    .addComponent(txtDonoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
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
            daoAnimal.editar(animal);

        } catch (Exception e) {
            //Exibe alguma mensagem de erro
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Atualiza a tela de consulta de animais, caso possível. Para isso,
        //obtém o "top level ancestor" (ou seja, o componente pai mais acima
        //do formulário, no nosso caso, o desktop) para conseguir o frame
        //de consulta e daí solicitar a atualização da lista através da
        //chamada de seu método público de atualização
        try {
            if (this.getDesktopPane().getTopLevelAncestor() instanceof TelaPrincipal) {
                TelaPrincipal principal = (TelaPrincipal) this.
                        getDesktopPane().getTopLevelAncestor();
                if (principal != null) {
                    principal.getAnimalConsult().refreshList();
                }
            }
        } catch (Exception e) {
            //Exibe erros de atualização da lista no
            //console, mas esconde-os do usuário
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(rootPane, "Cliente atualizado com sucesso",
                "Cadastro atualizado", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_internalFrameOpened
        txtNome.setText(animal.getNome());
        txtEspecie.setText(animal.getEspecie());
        txtIdade.setText(animal.getIdade().toString());
        txtDonoCpf.setText(animal.getIdCliente().toString());
        if (animal.getSexo().equals("Macho")) {
            jrbMacho.setSelected(true);
        } else {
            jrbFemea.setSelected(true);
        }
    }//GEN-LAST:event_internalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGpSexo;
    private javax.swing.JButton btnSalvar;
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
