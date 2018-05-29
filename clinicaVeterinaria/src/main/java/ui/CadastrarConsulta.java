package ui;

import dao.DaoCirurgiao;
import dao.DaoCliente;
import dao.DaoConsulta;
import dao.DaoRadiologista;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Animal;
import model.CirurgiaoGeral;
import model.Cliente;
import model.Consulta;
import model.Radiologista;

public class CadastrarConsulta extends javax.swing.JInternalFrame {

    private Consulta consulta = new Consulta();

    //Armazena o animal para consulta
    Animal animal = new Animal();

    public CadastrarConsulta() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRelato = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDataConsulta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblVeterinario = new javax.swing.JLabel();
        txtVeterinario = new javax.swing.JTextField();
        lblDono = new javax.swing.JLabel();
        txtDono = new javax.swing.JTextField();
        txtNomeAnimal = new javax.swing.JTextField();
        lblNomeVet = new javax.swing.JLabel();
        txtNomeVet = new javax.swing.JTextField();
        comboEspecialidade = new javax.swing.JComboBox<>();
        lblEspecialidade = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar Consulta");
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
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtRelato.setColumns(20);
        txtRelato.setRows(5);
        jScrollPane1.setViewportView(txtRelato);

        jLabel1.setText("Relato:");

        jLabel2.setText("Data Consulta:");

        jLabel3.setText("Animal:");

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        lblVeterinario.setText("Registro:");

        txtVeterinario.setToolTipText("Digite o registro do veterinário e aperte enter");
        txtVeterinario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kerEnterPressed(evt);
            }
        });

        lblDono.setText("Dono(a):");

        lblNomeVet.setText("Nome Vet.:");

        txtNomeVet.setEditable(false);

        comboEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Cirurgião Geral", "Radiologista" }));

        lblEspecialidade.setText("Especialidade:");
        lblEspecialidade.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEspecialidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVeterinario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVeterinario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblDono)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDono))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNomeVet)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNomeVet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspecialidade))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeVet)
                    .addComponent(txtNomeVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVeterinario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDono)
                    .addComponent(txtDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtNomeAnimal.setText(animal.getNome());
        DaoCliente daoCliente = new DaoCliente();
        Cliente cliente = new Cliente();
        try {
            cliente = daoCliente.buscarPorId(animal.getIdCliente());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtDono.setText(cliente.getNome());
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        //verifica se foi inserido um veterinario
        if (txtNomeVet.getText() == null) {
            JOptionPane.showMessageDialog(this, "Veterinário não informado", "Ops!",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //verifica se foi inserido a data
        if (txtDataConsulta.getText() == null) {
            JOptionPane.showMessageDialog(this, "Data não informada", "Ops!",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        consulta.setDataConsulta(txtDataConsulta.getText());
        consulta.setIdAnimal(animal.getIdAnimal());
        consulta.setRelatoConsulta(txtRelato.getText());

        DaoConsulta daoConsulta = new DaoConsulta();

        try {
            daoConsulta.inserir(consulta);
            //Exibe mensagem de Sucesso!
            JOptionPane.showMessageDialog(rootPane, "Consulta inserida com sucesso.",
                    "Cadastro efetuado!", JOptionPane.INFORMATION_MESSAGE);

            //após cadastrar, fecha a janela
            this.dispose();

        } catch (SQLException ex) {
            Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);

            //Exibe mensagens de erro 
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);

            //Exibe mensagens de erro 
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }


    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void kerEnterPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kerEnterPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //verifica se foi selecionado uma especialidade
            if (comboEspecialidade.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione uma especialidade", "Ops!",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (comboEspecialidade.getSelectedItem().equals("Cirurgião Geral")) {
                DaoCirurgiao daoCirurgiao = new DaoCirurgiao();

                try {
                    CirurgiaoGeral cirurgiao = daoCirurgiao.buscarPorRegistro(txtVeterinario.getText());
                    consulta.setNomeVet(cirurgiao.getNome());
                    txtNomeVet.setText(cirurgiao.getNome());

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                DaoRadiologista daoRadiologista = new DaoRadiologista();

                try {
                    Radiologista radiologista = daoRadiologista.buscarPorRegistro(txtVeterinario.getText());
                    consulta.setNomeVet(radiologista.getNome());
                    txtNomeVet.setText(radiologista.getNome());

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //verifica se foi inserido um registro de veterinario valido e existente no bd
            if (consulta.getNomeVet() == null) {
                JOptionPane.showMessageDialog(this, "Registro inválido", "Erro!",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_kerEnterPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> comboEspecialidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDono;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblNomeVet;
    private javax.swing.JLabel lblVeterinario;
    private javax.swing.JTextField txtDataConsulta;
    private javax.swing.JTextField txtDono;
    private javax.swing.JTextField txtNomeAnimal;
    private javax.swing.JTextField txtNomeVet;
    private javax.swing.JTextArea txtRelato;
    private javax.swing.JTextField txtVeterinario;
    // End of variables declaration//GEN-END:variables
}
