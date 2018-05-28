package ui;

import dao.DaoCliente;
import dao.DaoConsulta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Animal;
import model.Cliente;
import model.Consulta;
import model.Exame;

public class CadastrarConsulta extends javax.swing.JInternalFrame {

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
        btnExame = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableExame = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        lblVeterinario = new javax.swing.JLabel();
        txtVeterinario = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblDono = new javax.swing.JLabel();
        txtDono = new javax.swing.JTextField();
        txtNomeAnimal = new javax.swing.JTextField();

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

        btnExame.setText("Adicionar Exame");
        btnExame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExameMouseClicked(evt);
            }
        });

        tableExame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Exame"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableExame);

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        lblVeterinario.setText("Veterinário:");

        lblCpf.setText("CPF:");
        lblCpf.setToolTipText("CPF do dono");

        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyEnterPressedCPF(evt);
            }
        });

        lblDono.setText("Dono(a):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCadastrar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExame, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVeterinario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCpf)
                            .addComponent(txtVeterinario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtNomeAnimal, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDono)))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVeterinario)
                    .addComponent(txtVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDono)
                    .addComponent(txtDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    List<Exame> lista = new ArrayList<Exame>();
    private void btnExameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExameMouseClicked
        Exame exame = new Exame();
        exame.setDescricao(JOptionPane.showInputDialog("Exame: "));
        lista.add(exame);

        DefaultTableModel model = (DefaultTableModel) tableExame.getModel();
        model.setRowCount(0);

        for (int i = 0; i < lista.size(); i++) {
            exame = lista.get(i);

            Object[] row = new Object[1];
            row[0] = exame.getDescricao();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnExameMouseClicked

    private void keyEnterPressedCPF(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyEnterPressedCPF
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            DaoCliente daoCliente = new DaoCliente();
//            try {
//                //busca o cliente por cpf, preenche o campo com o nome do dono                
//                Cliente cliente = daoCliente.buscarPorCpf(txtCpf.getText());
//                txtDono.setText(cliente.getNome());
//
//                //pesquisa os animais que o cliente tem
//                DaoAnimal daoAnimal = new DaoAnimal();
//                List<Animal> listaAnimais = daoAnimal.listarPorDono(cliente.getIdCliente());
//
//                //preenche o comboBox com os animais que o cliente tem
//                if (listaAnimais != null || listaAnimais.size() >= 0) {
//                    for (int i = 0; i < listaAnimais.size(); i++) {
//                        Animal animal = listaAnimais.get(i);
//                        
//                        if (animal != null) {
//                            comboAnimal.addItem(animal.getNome());
//                        }
//                    }
//                } else {
//                    JOptionPane.showInternalMessageDialog(this, "Resultado null");
//                }
//                
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(CadastrarConsulta.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }//GEN-LAST:event_keyEnterPressedCPF

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
        txtCpf.setText(cliente.getCpf());
        txtDono.setText(cliente.getNome());
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        Consulta consulta = new Consulta();
        consulta.setDataConsulta(txtDataConsulta.getText());
        consulta.setIdAnimal(animal.getIdAnimal());
        consulta.setRelatoConsulta(txtRelato.getText());

        DaoConsulta daoConsulta = new DaoConsulta();

        try {
            daoConsulta.inserir(consulta);
            //Exibe mensagem de Sucesso!
            JOptionPane.showMessageDialog(rootPane, "Consulta inserida com sucesso.",
                    "Cadastro efetuado!", JOptionPane.INFORMATION_MESSAGE);

            limparTela();

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

    public void limparTela() {
        txtDataConsulta.setText("");
        txtCpf.setText("");
        txtDono.setText("");
        txtNomeAnimal.setText("");
        txtRelato.setText("");
        txtNomeAnimal.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDono;
    private javax.swing.JLabel lblVeterinario;
    private javax.swing.JTable tableExame;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataConsulta;
    private javax.swing.JTextField txtDono;
    private javax.swing.JTextField txtNomeAnimal;
    private javax.swing.JTextArea txtRelato;
    private javax.swing.JTextField txtVeterinario;
    // End of variables declaration//GEN-END:variables
}
