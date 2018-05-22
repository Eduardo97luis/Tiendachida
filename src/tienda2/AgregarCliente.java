/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda2;
import ConexionBD.Conexion;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;

/**
 *
 * @author Amauri
 */
public class AgregarCliente extends javax.swing.JDialog {
    
    boolean idb=false;
    boolean nombreb=false;
    boolean telb=false;
    boolean direcb=false;
    Conexion conexion = new Conexion();
   

 
     /* Creates new form AgregarCliente
     */
    public AgregarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        vercodigo();
    }

    public void vercodigo(){
                                             
        ResultSet datos = conexion.consultas("select idcliente from portillito.cliente order by idcliente DESC LIMIT 1");
        try {
            while (datos.next()) {
                String idp = datos.getString("idcliente");
                int cod=Integer.parseInt(idp);
                cod++;
                jLabel9.setText(""+cod);
            }
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        lineanombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lineatelefono = new javax.swing.JLabel();
        telef = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        lineadir = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(735, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 60, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 150, -1, -1));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        nombre.setForeground(new java.awt.Color(153, 153, 153));
        nombre.setText("Nombre del Cliente");
        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 180, 410, -1));

        lineanombre.setForeground(new java.awt.Color(153, 153, 153));
        lineanombre.setText("____________________________________________________________________");
        jPanel1.add(lineanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 190, 410, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 240, -1, -1));

        lineatelefono.setForeground(new java.awt.Color(153, 153, 153));
        lineatelefono.setText("___________________");
        jPanel1.add(lineatelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 280, -1, -1));

        telef.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        telef.setForeground(new java.awt.Color(153, 153, 153));
        telef.setText("000-000-0000");
        telef.setBorder(null);
        telef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefMouseClicked(evt);
            }
        });
        telef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefFocusLost(evt);
            }
        });
        telef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefKeyTyped(evt);
            }
        });
        jPanel1.add(telef, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 270, 110, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Dirección");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 330, -1, -1));

        direccion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        direccion.setForeground(new java.awt.Color(153, 153, 153));
        direccion.setText("Direccion del Cliente");
        direccion.setBorder(null);
        direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccionMouseClicked(evt);
            }
        });
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                direccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionFocusLost(evt);
            }
        });
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 360, 410, -1));

        lineadir.setForeground(new java.awt.Color(153, 153, 153));
        lineadir.setText("_____________________________________________________________________");
        lineadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lineadirMouseClicked(evt);
            }
        });
        jPanel1.add(lineadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 370, 430, -1));

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/boton.png"))); // NOI18N
        aceptar.setBorderPainted(false);
        aceptar.setContentAreaFilled(false);
        aceptar.setEnabled(false);
        aceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/boton2.png"))); // NOI18N
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 100, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/cancelar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/cancelar2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 100, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        if(nombre.getText().equals(""))
            nombre.setText("Nombre del Cliente");
    }//GEN-LAST:event_nombreFocusLost

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked

    }//GEN-LAST:event_nombreMouseClicked

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
      
    }//GEN-LAST:event_nombreKeyPressed

    private void telefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefFocusLost
        // TODO add your handling code here:
        
        if(telef.getText().equals(""))
            telef.setText("000-000-0000");
    }//GEN-LAST:event_telefFocusLost

    private void telefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefMouseClicked
        // TODO add your handling code here:
        if(!telb) telef.setText("");
    }//GEN-LAST:event_telefMouseClicked

    private void telefKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefKeyPressed
        // TODO add your handling code here:
        telb=true;
    }//GEN-LAST:event_telefKeyPressed

    private void telefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefKeyReleased
        // TODO add your handling code here:
         if(evt.getKeyCode()!=8){
        if(telef.getText().length()==3) telef.setText(telef.getText()+"-");
        if(telef.getText().length()==7) telef.setText(telef.getText()+"-");}
    }//GEN-LAST:event_telefKeyReleased

    private void telefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if(c<'0' || c>'9' || telef.getText().length()>11) evt.consume();
        if(telef.getText().length()<12){lineatelefono.setForeground(f);telef.setForeground(f);telb=false;}
        else {lineatelefono.setForeground(t);telef.setForeground(l);telb=true;}
        validar();
    }//GEN-LAST:event_telefKeyTyped

    private void direccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionFocusLost
        
        if(direccion.getText().equals(""))
            direccion.setText("Direccion del Cliente");
        
        
    }//GEN-LAST:event_direccionFocusLost

    private void direccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionMouseClicked
      
    }//GEN-LAST:event_direccionMouseClicked

    private void direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyPressed

    }//GEN-LAST:event_direccionKeyPressed

    private void lineadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineadirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lineadirMouseClicked

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        String cad = jLabel9.getText()+",'"+nombre.getText()+"','"+telef.getText()+"','"+direccion.getText()+"'";
        conexion.consultas("insert into portillito.cliente values("+cad+")");
        
        if(conexion.getConsulta()){
            Correcto p= new Correcto(new javax.swing.JFrame(),true);
            p.setVisible(true);
            this.dispose();
        }
        else{
            Error p= new Error(new javax.swing.JFrame(),true,"Cliente no agregado");
            p.setVisible(true);
        }
        
    }//GEN-LAST:event_aceptarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusGained
        // TODO add your handling code here:
        if(nombre.getText().equals("Nombre del Cliente")) nombre.setText("");
    }//GEN-LAST:event_nombreFocusGained

    private void telefFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefFocusGained
        // TODO add your handling code here:
        if(telef.getText().equals("000-000-0000")) telef.setText("");
    }//GEN-LAST:event_telefFocusGained

    private void direccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionFocusGained
        // TODO add your handling code here:
        if(direccion.getText().equals("Direccion del Cliente"))direccion.setText("");
    }//GEN-LAST:event_direccionFocusGained

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
        if(nombre.getText().length()>30)evt.consume();
        if(nombre.getText().length()<5){lineanombre.setForeground(f);nombre.setForeground(f);nombreb=false;}
        else {lineanombre.setForeground(t);nombre.setForeground(l);nombreb=true;}
        validar();
    }//GEN-LAST:event_nombreKeyTyped

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped
        // TODO add your handling code here:
        if(direccion.getText().length()>30)evt.consume();
        if(direccion.getText().length()<5){lineadir.setForeground(f);direccion.setForeground(f);direcb=false;}
        else{lineadir.setForeground(t);direccion.setForeground(l);direcb=true;}
        validar();
    }//GEN-LAST:event_direccionKeyTyped
public void validar(){
   if(nombreb && direcb && telb)aceptar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarCliente dialog = new AgregarCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lineadir;
    private javax.swing.JLabel lineanombre;
    private javax.swing.JLabel lineatelefono;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telef;
    // End of variables declaration//GEN-END:variables
 Color t= new Color(116,219,239);
 Color f=new Color(246,84,84);
 Color l=new Color(2,117,216);
}
