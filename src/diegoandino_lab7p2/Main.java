package diegoandino_lab7p2;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class Main extends javax.swing.JFrame {

    private Carpeta c = null;
    private ArrayList<Carpeta> folders = new ArrayList();
    private DefaultListModel ModL;
    private DefaultTreeModel ModT;
    private Aministraje ad;

    public Main() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        ModL = (DefaultListModel) jL_Lista.getModel();
        ModT = (DefaultTreeModel) jT_Screen.getModel();
        String road = "./files.dar";

        ModL.addElement("Mi Unidad");
        ModL.addElement("Destacados");
        ModL.addElement("Papeleria");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jF_CrearArchivo = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jTF_Nombre = new javax.swing.JTextField();
        jTF_Link = new javax.swing.JTextField();
        jTF_Tamaño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jF_CrearCarpeta = new javax.swing.JFrame();
        jTF_Nombre3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jB_CrearCarp = new javax.swing.JButton();
        jB_CrearArc = new javax.swing.JButton();
        crud = new javax.swing.JPopupMenu();
        CreaCarpeta = new javax.swing.JMenuItem();
        CreaArchivo = new javax.swing.JMenuItem();
        Favs = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        Descargar = new javax.swing.JMenuItem();
        Link = new javax.swing.JMenuItem();
        papelera = new javax.swing.JPopupMenu();
        Recuperar = new javax.swing.JMenuItem();
        Borrar = new javax.swing.JMenuItem();
        Limpiar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPB_Upload = new javax.swing.JProgressBar();
        jPB_FileCarp = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_Reporte = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jT_Screen = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        jL_Lista = new javax.swing.JList<>();

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jTF_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_NombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Link:");

        jLabel3.setText("Extencion;");

        jLabel4.setText("Tamaño;");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Crear");

        jLabel5.setText("ARCHIVOS");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".pdf", ".txt", ".docx", ".excel", ".dmaf" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_Link)
                            .addComponent(jTF_Nombre)
                            .addComponent(jTF_Tamaño, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jF_CrearArchivoLayout = new javax.swing.GroupLayout(jF_CrearArchivo.getContentPane());
        jF_CrearArchivo.getContentPane().setLayout(jF_CrearArchivoLayout);
        jF_CrearArchivoLayout.setHorizontalGroup(
            jF_CrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jF_CrearArchivoLayout.setVerticalGroup(
            jF_CrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTF_Nombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_Nombre3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre:");

        jB_CrearCarp.setText("Carpeta");

        jB_CrearArc.setText("Archivo");

        javax.swing.GroupLayout jF_CrearCarpetaLayout = new javax.swing.GroupLayout(jF_CrearCarpeta.getContentPane());
        jF_CrearCarpeta.getContentPane().setLayout(jF_CrearCarpetaLayout);
        jF_CrearCarpetaLayout.setHorizontalGroup(
            jF_CrearCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_CrearCarpetaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jF_CrearCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jF_CrearCarpetaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTF_Nombre3)
                        .addGap(59, 59, 59))
                    .addGroup(jF_CrearCarpetaLayout.createSequentialGroup()
                        .addComponent(jB_CrearCarp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(jB_CrearArc)
                        .addGap(56, 56, 56))))
        );
        jF_CrearCarpetaLayout.setVerticalGroup(
            jF_CrearCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_CrearCarpetaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jF_CrearCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTF_Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jF_CrearCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_CrearCarp)
                    .addComponent(jB_CrearArc))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        crud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crudMouseClicked(evt);
            }
        });

        CreaCarpeta.setText("nueva carpeta");
        CreaCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaCarpetaActionPerformed(evt);
            }
        });
        crud.add(CreaCarpeta);

        CreaArchivo.setText("crear archivo");
        CreaArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaArchivoActionPerformed(evt);
            }
        });
        crud.add(CreaArchivo);

        Favs.setText("favorito");
        Favs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavsActionPerformed(evt);
            }
        });
        crud.add(Favs);

        Eliminar.setText("eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        crud.add(Eliminar);

        Descargar.setText("Descargar");
        Descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescargarActionPerformed(evt);
            }
        });
        crud.add(Descargar);

        Link.setText("mostrar link");
        Link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkActionPerformed(evt);
            }
        });
        crud.add(Link);

        Recuperar.setText("recuperar");
        Recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecuperarActionPerformed(evt);
            }
        });
        papelera.add(Recuperar);

        Borrar.setText("borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        papelera.add(Borrar);

        Limpiar.setText("clear");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        papelera.add(Limpiar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jPB_Upload.setBackground(new java.awt.Color(102, 102, 102));
        jPB_Upload.setForeground(new java.awt.Color(255, 153, 51));

        jPB_FileCarp.setBackground(new java.awt.Color(102, 102, 102));
        jPB_FileCarp.setForeground(new java.awt.Color(255, 102, 102));

        jT_Reporte.setBackground(new java.awt.Color(102, 102, 102));
        jT_Reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tamaño", "Extencion"
            }
        ));
        jScrollPane3.setViewportView(jT_Reporte);

        jT_Screen.setBackground(new java.awt.Color(102, 102, 102));
        jT_Screen.setForeground(new java.awt.Color(0, 0, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Files");
        jT_Screen.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jT_Screen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_ScreenMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jT_Screen);

        jL_Lista.setBackground(new java.awt.Color(102, 102, 102));
        jL_Lista.setModel(new DefaultListModel());
        jL_Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_ListaMouseClicked(evt);
            }
        });
        jL_Lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jL_ListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jL_Lista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPB_Upload, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPB_FileCarp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPB_FileCarp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPB_Upload, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_NombreActionPerformed

    private void jTF_Nombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_Nombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_Nombre3ActionPerformed

    private void CreaCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaCarpetaActionPerformed
        Object obj = ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getUserObject();
        System.out.println(obj.getClass().toString());
        Carpeta folder = new Carpeta();
        if (obj instanceof Carpeta) {
            c = (Carpeta) obj;
            c.getListCarp().add(new Carpeta(JOptionPane.showInputDialog("nombre de carpeta?"), c));
        } else {
            c = null;
            ad.getCarpetas().add(new Carpeta(JOptionPane.showInputDialog("nombre de carpeta?")));
        }

        ad.escribir();

    }//GEN-LAST:event_CreaCarpetaActionPerformed

    private void CreaArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaArchivoActionPerformed
        Object obj = ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getUserObject();
        if (obj instanceof Carpeta) {
            c = (Carpeta) obj;
        } else {
            c = null;
        }

    }//GEN-LAST:event_CreaArchivoActionPerformed

    private void FavsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavsActionPerformed
        if (jT_Screen.getSelectionCount() > 0) {
            Object ob = ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getUserObject();
            DefaultMutableTreeNode raiz = ((DefaultMutableTreeNode) ModT.getRoot());
            if (((DefaultMutableTreeNode) ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getParent()).isRoot()) {
                if (ob instanceof Archivos) {
                    if (((Archivos) ob).isFavorito() == false) {
                        ((Archivos) ob).setFavorito(true);
                    } else {
                        ((Archivos) ob).setFavorito(false);
                    }
                } else if (ob instanceof Carpeta) {
                    if (((Carpeta) ob).isFavorito() == false) {
                        ((Carpeta) ob).setFavorito(true);
                    } else {
                        ((Carpeta) ob).setFavorito(false);
                    }
                }

                ad.escribir();
            } else {
                JOptionPane.showMessageDialog(this, "No es posible añadir a favoritos");
            }
        }
    }//GEN-LAST:event_FavsActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if (jT_Screen.getSelectionCount() > 0) {
            Object ob = ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getUserObject();
            DefaultMutableTreeNode raiz = ((DefaultMutableTreeNode) ModT.getRoot());
            if (((DefaultMutableTreeNode) ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getParent()).isRoot()) {
                if (ob instanceof Archivos) {

                    ((Archivos) ob).setTrash(true);

                } else if (ob instanceof Carpeta) {

                    ((Carpeta) ob).setTrash(true);

                }
                ad.escribir();
            } else {
                JOptionPane.showMessageDialog(this, "No es posible añadir a favoritos");
            }
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void DescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescargarActionPerformed
        Object obj = ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getUserObject();

        if (obj instanceof Archivos) {
            ProBar bar = new ProBar(jPB_Upload, ((Archivos) obj), jT_Reporte, jPB_FileCarp);
            bar.start();
        } else {
            ProBar bar = new ProBar(jPB_Upload, ((Carpeta) obj), jT_Reporte, jPB_FileCarp);
            bar.start();
        }
    }//GEN-LAST:event_DescargarActionPerformed

    private void LinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkActionPerformed
        Object obj = ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getUserObject();
        if (obj instanceof Archivos) {
            JOptionPane.showMessageDialog(this, ((Archivos) obj).getLink());
        } else if (obj instanceof Carpeta) {
            JOptionPane.showMessageDialog(this, ((Carpeta) obj).getLink());
        }
    }//GEN-LAST:event_LinkActionPerformed

    private void crudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crudMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crudMouseClicked

    private void jT_ScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_ScreenMouseClicked
        if (jL_Lista.getSelectedIndex() != -1) {
            String s = (String) ModL.getElementAt(jL_Lista.getSelectedIndex()) + "/";
            TreePath[] ss = jT_Screen.getSelectionPaths();
            
            }
            jPB_Upload.setStringPainted(true);
            jPB_Upload.setString(s);
            if (SwingUtilities.isRightMouseButton(evt)) {
                if (jL_Lista.getSelectedIndex() != -1) {

                    jT_Screen.setSelectionRow(jT_Screen.getClosestRowForLocation(evt.getX(), evt.getY()));
                    if (jL_Lista.getSelectedIndex() != 2) {
                        crud.show(jT_Screen, evt.getX(), evt.getY());
                    } else {
                        papelera.show(jT_Screen, evt.getX(), evt.getY());
                    }
                }
            }

        }
    }//GEN-LAST:event_jT_ScreenMouseClicked

    private void RecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecuperarActionPerformed
        if (jT_Screen.getSelectionCount() > 0) {
            Object obj = ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getUserObject();
            DefaultMutableTreeNode raiz = ((DefaultMutableTreeNode) ModT.getRoot());
            if (((DefaultMutableTreeNode) ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getParent()).isRoot()) {
                if (obj instanceof Archivos) {

                    ((Archivos) obj).setTrash(false);

                } else if (obj instanceof Carpeta) {

                    ((Carpeta) obj).setTrash(false);

                }
                ad.escribir();
            } else {
                JOptionPane.showMessageDialog(this, "No es posible añadir a favoritos");
            }
        }
    }//GEN-LAST:event_RecuperarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        if (jT_Screen.getSelectionCount() > 0) {
            Object obj = ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getUserObject();
            DefaultMutableTreeNode raiz = ((DefaultMutableTreeNode) ModT.getRoot());
            if (((DefaultMutableTreeNode) ((DefaultMutableTreeNode) jT_Screen.getSelectionPath().getLastPathComponent()).getParent()).isRoot()) {
                if (obj instanceof Archivos) {
                    ad.getArchivos().remove(obj);

                } else if (obj instanceof Carpeta) {
                    ad.getCarpetas().remove(obj);

                }
                ad.escribir();
            } else {
                JOptionPane.showMessageDialog(this, "No es posible añadir a favoritos");
            }
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) ModT.getRoot();
        for (int i = 0; i < raiz.getChildCount(); i++) {
            Object obj = ((DefaultMutableTreeNode) raiz.getChildAt(i)).getUserObject();
            if (obj instanceof Archivos) {
                ad.getArchivos().remove(obj);
            } else if (obj instanceof Carpeta) {
                ad.getCarpetas().remove(obj);

            }
        }
        ad.escribir();

    }//GEN-LAST:event_LimpiarActionPerformed

    private void jL_ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_ListaMouseClicked
        
    }//GEN-LAST:event_jL_ListaMouseClicked

    private void jL_ListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jL_ListaValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jL_ListaValueChanged

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Borrar;
    private javax.swing.JMenuItem CreaArchivo;
    private javax.swing.JMenuItem CreaCarpeta;
    private javax.swing.JMenuItem Descargar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Favs;
    private javax.swing.JMenuItem Limpiar;
    private javax.swing.JMenuItem Link;
    private javax.swing.JMenuItem Recuperar;
    private javax.swing.JPopupMenu crud;
    private javax.swing.JButton jB_CrearArc;
    private javax.swing.JButton jB_CrearCarp;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jF_CrearArchivo;
    private javax.swing.JFrame jF_CrearCarpeta;
    private javax.swing.JList<String> jL_Lista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jPB_FileCarp;
    private javax.swing.JProgressBar jPB_Upload;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTF_Link;
    private javax.swing.JTextField jTF_Nombre;
    private javax.swing.JTextField jTF_Nombre3;
    private javax.swing.JTextField jTF_Tamaño;
    private javax.swing.JTable jT_Reporte;
    private javax.swing.JTree jT_Screen;
    private javax.swing.JPopupMenu papelera;
    // End of variables declaration//GEN-END:variables
}
