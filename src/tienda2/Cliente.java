/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda2;

import java.awt.Color;
import java.sql.ResultSet;
import ConexionBD.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

/**
 *
 * @author Amauri
 */
public class Cliente extends javax.swing.JDialog {
    Conexion conexion = new Conexion();
    DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
    public static boolean opelim = false;
    boolean activar = true;
    boolean buscarb=false;
    int contador=0;
    int count = 0;
    String order="nombre";

    /**
     * Creates new form Cliente
     */
    public Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
         tabla.setBackground(Color.WHITE);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 1; i < 5; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(alinear);
        }
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        llenarTabla();
        usuario.setText(usu());
    }
    public String usu(){
        ResultSet datos = conexion.consultas("select * from portillito.usuarioactivo");
        String nombre="";
        try {
            while(datos.next()){
                nombre=datos.getString("nombre");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
    }
    
    
    public void llenarTabla() {
        contador=0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
            mm.removeRow(i);
            i -= 1;
        }

        ResultSet datos = conexion.consultas("select * from portillito.cliente");

        count = 0;
        try {
            while (datos.next()) {
                count++;
            }
        } catch (Exception e) {
        }
        
        datos = conexion.consultas("select * from portillito.cliente order by "+order);
        if (count <= 10) {
            jButton9.setVisible(false);
            jButton10.setVisible(false);
            try {
                while (datos.next()) {
                    String id = datos.getString("idcliente");
                    String nombre = datos.getString("nombre");
                    String telf = datos.getString("telefono");
                    String direc = datos.getString("direccion");

                    DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
                    mm.addRow(new Object[]{false, id, nombre, telf, direc});
                }
            } catch (Exception e) {
            }
        } else {
            jButton9.setVisible(true);
            jButton10.setVisible(true);
            try {
                while (datos.next()) {
                    String id = datos.getString("idcliente");
                    String nombre = datos.getString("nombre");
                    String telf = datos.getString("telefono");
                    String direc = datos.getString("direccion");

                    DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
                    mm.addRow(new Object[]{false, id, nombre, telf, direc});

                    contador++;
                    if (contador == 10) {
                        break;
                    }
                }
            } catch (Exception e) {
            }
        }

    }
    
    public void buscarregistros(String str) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
            mm.removeRow(i);
            i -= 1;
        }
                                                
                                            
          ResultSet datos = conexion.consultas("select * from portillito.cliente where nombre like "+"'"+str+"%"+"'");
        try {
            while (datos.next()) {
                String id = datos.getString("idcliente");
                String nombre = datos.getString("nombre");
                String telf = datos.getString("telefono");
                String direc = datos.getString("direccion");

                DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
                mm.addRow(new Object[]{false, id, nombre, telf, direc});
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(102, 204, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setOpaque(false);

        tabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabla.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1", "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        tabla.setRequestFocusEnabled(false);
        tabla.setRowHeight(30);
        tabla.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla.setSurrendersFocusOnKeystroke(true);
        tabla.setTableHeader(null);
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 170, 968, 310));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/linea.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(966, 1));
        jLabel3.setMinimumSize(new java.awt.Dimension(966, 21));
        jLabel3.setPreferredSize(new java.awt.Dimension(966, 1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 970, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ID");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nombre");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Direccion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/eliminar.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/subeliminar.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 100, 40));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/agregar.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusable(false);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/subagregar.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 100, 40));

        buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(204, 204, 204));
        buscar.setText("Ingrese código o nombre");
        buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscarFocusLost(evt);
            }
        });
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 210, -1));

        jPanel2.setBackground(new java.awt.Color(64, 75, 105));
        jPanel2.setPreferredSize(new java.awt.Dimension(50, 650));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/003-phone-call.png"))); // NOI18N
        jButton1.setToolTipText("Recargas");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/subrecarga.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 50, 42));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/006-coin.png"))); // NOI18N
        jButton3.setToolTipText("Venta");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/subventa.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 50, 42));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/008-menu.png"))); // NOI18N
        jButton4.setToolTipText("Productos");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/subprod.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 50, 42));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/005-magic.png"))); // NOI18N
        jButton5.setToolTipText("Proveedores");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/subprov.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 50, 42));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/cliente.png"))); // NOI18N
        jButton6.setToolTipText("Clientes");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/subcliente.png"))); // NOI18N
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 50, 42));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/011-home.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/home2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 42));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        jButton9.setText("<<");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        jButton10.setText(">>");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        jPanel3.setBackground(new java.awt.Color(231, 239, 243));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("Nombre");
        jPanel3.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 80, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Cliente");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/user.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, -1, -1));

        jButton11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(102, 102, 102));
        jButton11.setText("Cerrar sesión");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 120, 20));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Portillo |");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 1100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        order="idcliente";
        llenarTabla();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        order="nombre";
        llenarTabla();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(activar) {
            tabla.getColumnModel().getColumn(0).setMaxWidth(30);
            tabla.getColumnModel().getColumn(0).setMinWidth(30);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            activar = false;
            jLabel4.setLocation(jLabel4.getX()+30, jLabel4.getY());
            jLabel5.setLocation(jLabel5.getX()+20, jLabel5.getY());
            jLabel6.setLocation(jLabel6.getX()+10, jLabel6.getY());
            jLabel8.setLocation(jLabel8.getX()+3, jLabel8.getY());
        }
        else {
            int cont=0;
            DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
            int fils = mm.getRowCount();
            for (int i = 0; i < fils; i++) {
                if(mm.getValueAt(i, 0).toString().equals("true")){
                    cont++;
                }
            }
            if(cont!=0){
                Advertencia ad = new Advertencia(new javax.swing.JFrame(), true, cont,mm,"cliente","idcliente");
                ad.setVisible(true);
                activar = true;
                tabla.getColumnModel().getColumn(0).setMaxWidth(0);
                tabla.getColumnModel().getColumn(0).setMinWidth(0);
                tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
                llenarTabla();
                jLabel4.setLocation(jLabel4.getX()-30, jLabel4.getY());
                jLabel5.setLocation(jLabel5.getX()-20, jLabel5.getY());
                jLabel6.setLocation(jLabel6.getX()-10, jLabel6.getY());
                jLabel8.setLocation(jLabel8.getX()-3, jLabel8.getY());
            }
            else{
                activar = true;
                tabla.getColumnModel().getColumn(0).setMaxWidth(0);
                tabla.getColumnModel().getColumn(0).setMinWidth(0);
                tabla.getColumnModel().getColumn(0).setPreferredWidth(0);

                jLabel4.setLocation(jLabel4.getX()-30, jLabel4.getY());
                jLabel5.setLocation(jLabel5.getX()-20, jLabel5.getY());
                jLabel6.setLocation(jLabel6.getX()-10, jLabel6.getY());
                jLabel8.setLocation(jLabel8.getX()-3, jLabel8.getY());
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        AgregarCliente ag = new AgregarCliente(new javax.swing.JFrame(), true);
        ag.setVisible(true);
        llenarTabla();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarFocusLost
        // TODO add your handling code here:
        if(!buscarb) buscar.setText("Ingrese código o nombre");
        if(buscar.getText().equals("")){
            buscar.setText("Ingrese código o nombre");
            buscarb=false;
        }
    }//GEN-LAST:event_buscarFocusLost

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        // TODO add your handling code here:
        if(!buscarb) buscar.setText("");
    }//GEN-LAST:event_buscarMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed
        // TODO add your handling code here:
        buscarb=true;
    }//GEN-LAST:event_buscarKeyPressed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        buscarregistros(buscar.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Recarga p= new Recarga(new javax.swing.JFrame(),true);
        p.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        venta v= new venta(new javax.swing.JFrame(),true);
        v.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Producto p= new Producto(new javax.swing.JFrame(),true);
        p.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        Proveedor p= new Proveedor(new javax.swing.JFrame(),true);
        p.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (contador>=0) {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
                mm.removeRow(i);
                i -= 1;
            }
            int aux = contador-10;
            ResultSet datos = conexion.consultas("select * from portillito.cliente order by "+order);
            contador-=20;

            try {
                int x = 1;
                int xx = contador;
                while (datos.next() && contador < aux) {
                    if (x >= xx) {
                        String id = datos.getString("idcliente");
                        String nombre = datos.getString("nombre");
                        String telef = datos.getString("telefono");
                        String direc = datos.getString("direccion");

                        DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
                        mm.addRow(new Object[]{false, id, nombre, telef, direc});
                        contador++;

                    } else {
                        x++;
                    }
                }
                System.out.println(contador);
            }
            catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        contador=10;
        if (contador <= count) {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
                mm.removeRow(i);
                i -= 1;
            }
            int aux = contador + 10;
            ResultSet datos = conexion.consultas("select * from portillito.cliente order by "+order);
            contador++;

            try {
                int x = 1;
                int xx = contador;
                while (datos.next() && contador <= aux) {
                    if (x >= xx) {
                        String id = datos.getString("idcliente");
                        String nombre = datos.getString("nombre");
                        String telef = datos.getString("telefono");
                        String direc = datos.getString("direccion");

                        DefaultTableModel mm = (DefaultTableModel) tabla.getModel();
                        mm.addRow(new Object[]{false, id, nombre, telef, direc});
                        contador++;

                    } else {
                        x++;
                    }

                }
                System.out.println(contador);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Principal p = new Principal(new javax.swing.JFrame(),true);
        p.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
          AdvertenciaC c= new AdvertenciaC(new javax.swing.JFrame(), true,this);
        c.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x+evt.getX()-x,this.getLocation().y+evt.getY()-y);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
        // TODO add your handling code here:
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jPanel3MouseMoved

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cliente dialog = new Cliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
int x,y;
}
