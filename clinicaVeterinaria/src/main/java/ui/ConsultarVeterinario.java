package ui;

import dao.DaoCirurgiao;
import dao.DaoRadiologista;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CirurgiaoGeral;
import model.Radiologista;

public class ConsultarVeterinario extends javax.swing.JInternalFrame {

    private String busca = "";
    private DaoRadiologista daoRadiologista = new DaoRadiologista();
    private DaoCirurgiao daoCirurgiao = new DaoCirurgiao();

    //Instância do form de edição de cliente
    EditarVeterinario EditarVeterinario = new EditarVeterinario();

    public ConsultarVeterinario() {
        initComponents();

        //faz com que a coluna do ID não seja mostrada ao usuário
        tableConsultaVeterinario.getColumnModel().getColumn(0).setMinWidth(0);
        tableConsultaVeterinario.getColumnModel().getColumn(0).setMaxWidth(0);
        tableConsultaVeterinario.getColumnModel().getColumn(0).setWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPesquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultaVeterinario = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        comboEspecialidade = new javax.swing.JComboBox<>();
        lblEspecialidade = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Veterinario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblPesquisa.setText("Pesquisar:");

        txtPesquisa.setToolTipText("Deixe vazio para listar todos ou digite um nome/registro");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tableConsultaVeterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Registro", "Nome", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableConsultaVeterinario);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        comboEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Cirurgião Geral", "Radiologista" }));

        lblEspecialidade.setText("Especialidade:");
        lblEspecialidade.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEspecialidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEspecialidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEspecialidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPesquisa)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnPesquisar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //verifica se foi selecionado uma especialidade
        if (comboEspecialidade.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhuma especialidade selecionada", "Erro!",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        //Inicializa o sucesso da pesquisa com valor negativo, indicando que
        //a pesquisa de veterinarios não obteve resultados (situação padrão)
        boolean resultSearch = false;

        busca = txtPesquisa.getText();

        try {
            if (comboEspecialidade.getSelectedItem().equals("Cirurgião Geral")) {
                //Solicita a atualização da lista de cirurgioes
                resultSearch = refreshListCirurgioes();
            } else {
                //Solicita a atualização da lista de radiologistas
                resultSearch = refreshListRadiologistas();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de erro caso a pesquisa não tenha resultados
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //Verifica se foi selecionado um veterinario p/ exclusão
        if (tableConsultaVeterinario.getSelectedRow() >= 0) {

            //Obtém a linha do item selecionado
            final int row = tableConsultaVeterinario.getSelectedRow();

            //Obtém o nome do veterinario da linha selecionada p/ confirmar a exclusão
            String nome = (String) tableConsultaVeterinario.getValueAt(row, 2);

            //Mostra o diálogo de confirmação de exclusão
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o veterinário \"" + nome + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

            //Se o valor de resposta for "Sim" para a exclusão
            if (resposta == JOptionPane.YES_OPTION) {
                try {

                    //Obtém o ID do veterinário
                    Integer idVet = (Integer) tableConsultaVeterinario.getValueAt(row, 0);

                    if (comboEspecialidade.getSelectedItem().equals("Cirurgião Geral")) {
                        daoCirurgiao.excluir(idVet);
                        //Atualiza a lista após a "exclusão"
                        this.refreshListCirurgioes();

                    } else {
                        daoRadiologista.excluir(idVet);
                        this.refreshListRadiologistas();
                    }

                } catch (Exception e) {
                    //Se ocorrer algum erro técnico, mostra-o no console,
                    //mas esconde-o do usuário
                    e.printStackTrace();

                    //Exibe uma mensagem de erro genérica ao usuário
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            //Obtém a linha selecionada da tabela de resultados
            final int row = tableConsultaVeterinario.getSelectedRow();

            //Obtém o valor do ID da coluna "ID" da tabela de resultados
            Integer id = (Integer) tableConsultaVeterinario.getValueAt(row, 0);

            CirurgiaoGeral cirurgiao = null;
            Radiologista radiologista = null;

            if (comboEspecialidade.getSelectedItem().equals("Cirurgião Geral")) {
                cirurgiao = daoCirurgiao.obter(id);

            } else if (comboEspecialidade.getSelectedItem().equals("Radiologista")) {
                radiologista = daoRadiologista.obter(id);

            }

            //Cria uma nova instância da tela de edição,
            //configura o veterinário selecionado como elemento a
            //ser editado e mostra a tela de edição.
            //Para exibir a tela, é necessário adicioná-la ao
            //componente de desktop, o "pai" da janela corrente
            EditarVeterinario.dispose();
            EditarVeterinario = new EditarVeterinario();
            if (comboEspecialidade.getSelectedItem().equals("Cirurgião Geral")) {
                EditarVeterinario.setCirurgiao(cirurgiao);
                EditarVeterinario.setTitle("Editar Cirurgião " + cirurgiao.getNome());
            } else if(comboEspecialidade.getSelectedItem().equals("Radiologista")){
                EditarVeterinario.setRadiologista(radiologista);
                EditarVeterinario.setTitle("Editar Radiologista " + radiologista.getNome());
            }
            this.getParent().add(EditarVeterinario);
            this.openFrameInCenter(EditarVeterinario);
            EditarVeterinario.toFront();

        } catch (Exception e) {
            //Se ocorrer algum erro técnico, mostra-o no console,
            //mas esconde-o do usuário
            e.printStackTrace();

            //Exibe uma mensagem de erro genérica ao usuário
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste veterinário.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

//Atualiza a lista de cirurgioes
    public boolean refreshListCirurgioes() throws Exception {

        //lista os cirurgioes de acordo com a ultima pesquisa
        List<CirurgiaoGeral> resultado = daoCirurgiao.listar(busca);

        //Obtém o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tableConsultaVeterinario.getModel();

        //limpa a tabela
        model.setRowCount(0);

        //Verifica se não existiram resultados. Caso afirmativo, encerra a
        //atualização e indica ao elemento acionador o não sucesso da pesquisa
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        //Percorre a lista de resultados e os adiciona na tabela
        for (int i = 0; i < resultado.size(); i++) {
            CirurgiaoGeral cirurgiao = resultado.get(i);
            if (cirurgiao != null) {
                Object[] row = new Object[5];
                row[0] = cirurgiao.getIdVeterinario();
                row[1] = cirurgiao.getCrm();
                row[2] = cirurgiao.getNome();
                row[3] = cirurgiao.getEndereco();
                row[4] = cirurgiao.getTelefone();
                model.addRow(row);
            }
        }

        return true;
    }

    //Atualiza a lista de radiologistas
    public boolean refreshListRadiologistas() throws Exception {

        //lista os radiologistas de acordo com a ultima pesquisa
        List<Radiologista> resultado = daoRadiologista.listar(busca);

        //Obtém o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tableConsultaVeterinario.getModel();

        //limpa a tabela
        model.setRowCount(0);

        //Verifica se não existiram resultados. Caso afirmativo, encerra a
        //atualização e indica ao elemento acionador o não sucesso da pesquisa
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        //Percorre a lista de resultados e os adiciona na tabela
        for (int i = 0; i < resultado.size(); i++) {
            Radiologista radiologista = resultado.get(i);
            if (radiologista != null) {
                Object[] row = new Object[5];
                row[0] = radiologista.getIdVeterinario();
                row[1] = radiologista.getConter();
                row[2] = radiologista.getNome();
                row[3] = radiologista.getEndereco();
                row[4] = radiologista.getTelefone();
                model.addRow(row);
            }
        }

        return true;
    }

    //Abre um internal frame centralizado na tela
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> comboEspecialidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JTable tableConsultaVeterinario;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
