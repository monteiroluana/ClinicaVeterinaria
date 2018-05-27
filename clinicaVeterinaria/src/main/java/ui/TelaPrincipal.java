//cria JInternalFrame pra poder aparecer a "janela" dentro
package ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;

public class TelaPrincipal extends javax.swing.JFrame {

    private CadastrarCliente clienteAdd = null;
    private ConsultarCliente clienteConsult = null;
    private EditarCliente clienteEdit = null;

    private CadastrarAnimal animalAdd = null;
    private ConsultarAnimal animalConsult = null;
    private EditarAnimal animalEdit = null;

    private CadastroCirurgiao cirurgiaoAdd = null;

    private CadastroRadiologista radiologistaAdd = null;

    private CadastrarConsulta consultaAdd = null;

    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    //Métodos de acesso para os formulários abertos pela tela principal
    public CadastrarCliente getClienteAdd() {
        return clienteAdd;
    }

    public void setClienteAdd(CadastrarCliente clienteAdd) {
        this.clienteAdd = clienteAdd;
    }

    public ConsultarCliente getClienteConsult() {
        return clienteConsult;
    }

    public void setClienteConsult(ConsultarCliente clienteConsult) {
        this.clienteConsult = clienteConsult;
    }

    public EditarCliente getClienteEdit() {
        return clienteEdit;
    }

    public void setClienteEdit(EditarCliente clienteEdit) {
        this.clienteEdit = clienteEdit;
    }

    public CadastrarAnimal getAnimalAdd() {
        return animalAdd;
    }

    public void setAnimalAdd(CadastrarAnimal animalAdd) {
        this.animalAdd = animalAdd;
    }

    public ConsultarAnimal getAnimalConsult() {
        return animalConsult;
    }

    public void setAnimalConsult(ConsultarAnimal animalConsult) {
        this.animalConsult = animalConsult;
    }

    public EditarAnimal getAnimalEdit() {
        return animalEdit;
    }

    public void setAnimalEdit(EditarAnimal animalEdit) {
        this.animalEdit = animalEdit;
    }

    public CadastroCirurgiao getCirurgiaoAdd() {
        return cirurgiaoAdd;
    }

    public void setCirurgiaoAdd(CadastroCirurgiao cirurgiaoAdd) {
        this.cirurgiaoAdd = cirurgiaoAdd;
    }

    public CadastroRadiologista getRadiologistaAdd() {
        return radiologistaAdd;
    }

    public void setRadiologistaAdd(CadastroRadiologista radiologistaAdd) {
        this.radiologistaAdd = radiologistaAdd;
    }

    public CadastrarConsulta getConsultaAdd() {
        return consultaAdd;
    }

    public void setConsultaAdd(CadastrarConsulta consultaAdd) {
        this.consultaAdd = consultaAdd;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane() {
            private Image image;
            {
                try {
                    image = ImageIO.read(new File("src/resources.imgs/fundo.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        topo = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        navigation = new javax.swing.JPanel();
        jpClienteAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpClienteConsulta = new javax.swing.JPanel();
        lblCadastarCliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpAnimalConsulta = new javax.swing.JPanel();
        lblConsultarAnimal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpAnimalAdd = new javax.swing.JPanel();
        lblCadastrarAnimal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpCadastroCirurgiao = new javax.swing.JPanel();
        lblCadastro = new javax.swing.JLabel();
        jpCadastroRadiologista = new javax.swing.JPanel();
        lblCadastroRadio = new javax.swing.JLabel();
        jpCadastroConsulta = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja da Galerinha");
        setUndecorated(true);
        setResizable(false);

        desktop.setBackground(new java.awt.Color(255, 255, 255));
        desktop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        desktop.setDoubleBuffered(true);
        desktop.setPreferredSize(new java.awt.Dimension(1200, 800));

        topo.setBackground(new java.awt.Color(51, 51, 51));
        topo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topoMouseDragged(evt);
            }
        });
        topo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topoMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("| X ");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout topoLayout = new javax.swing.GroupLayout(topo);
        topo.setLayout(topoLayout);
        topoLayout.setHorizontalGroup(
            topoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topoLayout.createSequentialGroup()
                .addContainerGap(955, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        topoLayout.setVerticalGroup(
            topoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        navigation.setBackground(new java.awt.Color(51, 51, 51));
        navigation.setPreferredSize(new java.awt.Dimension(200, 500));

        jpClienteAdd.setBackground(new java.awt.Color(102, 102, 102));
        jpClienteAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpClienteAddMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luana\\Documents\\GitHub\\ClinicaVeterinaria\\clinicaVeterinaria\\src\\main\\java\\resources\\imgs\\userAdd1.png")); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("novo cliente");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jpClienteAddLayout = new javax.swing.GroupLayout(jpClienteAdd);
        jpClienteAdd.setLayout(jpClienteAddLayout);
        jpClienteAddLayout.setHorizontalGroup(
            jpClienteAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpClienteAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpClienteAddLayout.setVerticalGroup(
            jpClienteAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpClienteConsulta.setBackground(new java.awt.Color(102, 102, 102));
        jpClienteConsulta.setPreferredSize(new java.awt.Dimension(98, 50));
        jpClienteConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpClienteConsultaMouseClicked(evt);
            }
        });

        lblCadastarCliente.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblCadastarCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luana\\Documents\\GitHub\\ClinicaVeterinaria\\clinicaVeterinaria\\src\\main\\java\\resources\\imgs\\userSearch1.png")); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("buscar cliente");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jpClienteConsultaLayout = new javax.swing.GroupLayout(jpClienteConsulta);
        jpClienteConsulta.setLayout(jpClienteConsultaLayout);
        jpClienteConsultaLayout.setHorizontalGroup(
            jpClienteConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpClienteConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastarCliente)
                    .addComponent(jLabel4))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpClienteConsultaLayout.setVerticalGroup(
            jpClienteConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpAnimalConsulta.setBackground(new java.awt.Color(102, 102, 102));
        jpAnimalConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpAnimalConsultaMouseClicked(evt);
            }
        });

        lblConsultarAnimal.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblConsultarAnimal.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultarAnimal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luana\\Documents\\GitHub\\ClinicaVeterinaria\\clinicaVeterinaria\\src\\main\\java\\resources\\imgs\\petSearch1.png")); // NOI18N

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("buscar animal");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout jpAnimalConsultaLayout = new javax.swing.GroupLayout(jpAnimalConsulta);
        jpAnimalConsulta.setLayout(jpAnimalConsultaLayout);
        jpAnimalConsultaLayout.setHorizontalGroup(
            jpAnimalConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAnimalConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAnimalConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsultarAnimal)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAnimalConsultaLayout.setVerticalGroup(
            jpAnimalConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAnimalConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultarAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpAnimalAdd.setBackground(new java.awt.Color(102, 102, 102));
        jpAnimalAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpAnimalAddMouseClicked(evt);
            }
        });

        lblCadastrarAnimal.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblCadastrarAnimal.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrarAnimal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luana\\Documents\\GitHub\\ClinicaVeterinaria\\clinicaVeterinaria\\src\\main\\java\\resources\\imgs\\petAdd1.png")); // NOI18N

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("novo animal");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jpAnimalAddLayout = new javax.swing.GroupLayout(jpAnimalAdd);
        jpAnimalAdd.setLayout(jpAnimalAddLayout);
        jpAnimalAddLayout.setHorizontalGroup(
            jpAnimalAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAnimalAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAnimalAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAnimalAddLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(lblCadastrarAnimal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAnimalAddLayout.setVerticalGroup(
            jpAnimalAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAnimalAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrarAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24))
        );

        jpCadastroCirurgiao.setBackground(new java.awt.Color(102, 102, 102));
        jpCadastroCirurgiao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCadastroCirurgiaoMouseClicked(evt);
            }
        });

        lblCadastro.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastro.setText("CIRURGIAO ADD");

        javax.swing.GroupLayout jpCadastroCirurgiaoLayout = new javax.swing.GroupLayout(jpCadastroCirurgiao);
        jpCadastroCirurgiao.setLayout(jpCadastroCirurgiaoLayout);
        jpCadastroCirurgiaoLayout.setHorizontalGroup(
            jpCadastroCirurgiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroCirurgiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCadastroCirurgiaoLayout.setVerticalGroup(
            jpCadastroCirurgiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroCirurgiaoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpCadastroRadiologista.setBackground(new java.awt.Color(102, 102, 102));
        jpCadastroRadiologista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCadastroRadiologistaMouseClicked(evt);
            }
        });

        lblCadastroRadio.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblCadastroRadio.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroRadio.setText("RADIOLOGISTA ADD");

        javax.swing.GroupLayout jpCadastroRadiologistaLayout = new javax.swing.GroupLayout(jpCadastroRadiologista);
        jpCadastroRadiologista.setLayout(jpCadastroRadiologistaLayout);
        jpCadastroRadiologistaLayout.setHorizontalGroup(
            jpCadastroRadiologistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroRadiologistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCadastroRadiologistaLayout.setVerticalGroup(
            jpCadastroRadiologistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroRadiologistaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCadastroRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpCadastroConsulta.setBackground(new java.awt.Color(102, 102, 102));
        jpCadastroConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCadastroConsultaMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luana\\Documents\\GitHub\\ClinicaVeterinaria\\clinicaVeterinaria\\src\\main\\java\\resources\\imgs\\consultAdd.png")); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("nova consulta");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout jpCadastroConsultaLayout = new javax.swing.GroupLayout(jpCadastroConsulta);
        jpCadastroConsulta.setLayout(jpCadastroConsultaLayout);
        jpCadastroConsultaLayout.setHorizontalGroup(
            jpCadastroConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jpCadastroConsultaLayout.setVerticalGroup(
            jpCadastroConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout navigationLayout = new javax.swing.GroupLayout(navigation);
        navigation.setLayout(navigationLayout);
        navigationLayout.setHorizontalGroup(
            navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCadastroCirurgiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCadastroRadiologista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navigationLayout.createSequentialGroup()
                .addGroup(navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpAnimalAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCadastroConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpClienteAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpAnimalConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpClienteConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        navigationLayout.setVerticalGroup(
            navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpClienteConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpClienteAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpAnimalConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpAnimalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpCadastroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jpCadastroCirurgiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpCadastroRadiologista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        desktop.setLayer(topo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(navigation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(navigation, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(topo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topoMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_topoMousePressed

    private void topoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_topoMouseDragged

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void jpClienteAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpClienteAddMouseClicked
        if (clienteAdd == null || !clienteAdd.isDisplayable()) {
            clienteAdd = new CadastrarCliente();
            desktop.add(clienteAdd);
            //centraliza
            this.openFrameInCenter(clienteAdd);
        }
        clienteAdd.toFront();

    }//GEN-LAST:event_jpClienteAddMouseClicked

    private void jpClienteConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpClienteConsultaMouseClicked
        if (clienteConsult == null || !clienteConsult.isDisplayable()) {
            try {
                clienteConsult = new ConsultarCliente();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            desktop.add(clienteConsult);
            //centraliza
            this.openFrameInCenter(clienteConsult);
        }
        clienteConsult.toFront();

    }//GEN-LAST:event_jpClienteConsultaMouseClicked

    private void jpAnimalAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAnimalAddMouseClicked
        if (animalAdd == null || !animalAdd.isDisplayable()) {
            animalAdd = new CadastrarAnimal();
            desktop.add(animalAdd);
            //centraliza
            this.openFrameInCenter(animalAdd);
        }
        animalAdd.toFront();
    }//GEN-LAST:event_jpAnimalAddMouseClicked

    private void jpAnimalConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAnimalConsultaMouseClicked
        if (animalConsult == null || !animalConsult.isDisplayable()) {
            try {
                animalConsult = new ConsultarAnimal();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            desktop.add(animalConsult);
            //centraliza
            this.openFrameInCenter(animalConsult);
        }
        animalConsult.toFront();
    }//GEN-LAST:event_jpAnimalConsultaMouseClicked

    private void jpCadastroCirurgiaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCadastroCirurgiaoMouseClicked
        if (cirurgiaoAdd == null || !cirurgiaoAdd.isDisplayable()) {
            cirurgiaoAdd = new CadastroCirurgiao();
            desktop.add(cirurgiaoAdd);
            //centraliza
            this.openFrameInCenter(cirurgiaoAdd);
        }
        cirurgiaoAdd.toFront();
    }//GEN-LAST:event_jpCadastroCirurgiaoMouseClicked

    private void jpCadastroRadiologistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCadastroRadiologistaMouseClicked
        if (radiologistaAdd == null || !radiologistaAdd.isDisplayable()) {
            radiologistaAdd = new CadastroRadiologista();
            desktop.add(radiologistaAdd);
            //centraliza
            this.openFrameInCenter(radiologistaAdd);
        }
        radiologistaAdd.toFront();
    }//GEN-LAST:event_jpCadastroRadiologistaMouseClicked

    private void jpCadastroConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCadastroConsultaMouseClicked
        if (consultaAdd == null || !consultaAdd.isDisplayable()) {
            consultaAdd = new CadastrarConsulta();
            desktop.add(consultaAdd);
            this.openFrameInCenter(consultaAdd);
        }
        consultaAdd.toFront();
    }//GEN-LAST:event_jpCadastroConsultaMouseClicked

    /*Inicio Movimentando a tela --------*/
    int xx;
    int xy;

    /*Fim Movimentando a tela --------*/
    //Abre um internal frame centralizado na tela
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = desktop.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jpAnimalAdd;
    private javax.swing.JPanel jpAnimalConsulta;
    private javax.swing.JPanel jpCadastroCirurgiao;
    private javax.swing.JPanel jpCadastroConsulta;
    private javax.swing.JPanel jpCadastroRadiologista;
    private javax.swing.JPanel jpClienteAdd;
    private javax.swing.JPanel jpClienteConsulta;
    private javax.swing.JLabel lblCadastarCliente;
    private javax.swing.JLabel lblCadastrarAnimal;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCadastroRadio;
    private javax.swing.JLabel lblConsultarAnimal;
    private javax.swing.JPanel navigation;
    private javax.swing.JPanel topo;
    // End of variables declaration//GEN-END:variables
}
