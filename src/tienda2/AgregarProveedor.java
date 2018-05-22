/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda2;
import ConexionBD.Conexion;
import java.awt.Color;
import static java.lang.Character.isDigit;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author Amauri
 */
public class AgregarProveedor extends javax.swing.JDialog {
    
    
    boolean idb=false;
    boolean razonb=false;
    boolean telb=false;
    boolean emailb=false;
    Conexion conexion = new Conexion();

    /**
     * Creates new form AgregarProveedor
     */
    public AgregarProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        vercodigo();
    }

     public void vercodigo(){
                                             
        ResultSet datos = conexion.consultas("select idproveedor from portillito.proveedor order by idproveedor DESC LIMIT 1");
        try {
            while (datos.next()) {
                String idp = datos.getString("idproveedor");
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
        razon = new javax.swing.JTextField();
        lineanombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lineatelefono = new javax.swing.JLabel();
        telef = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        lineaemail = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        valemail = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(735, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("_________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre de la empresa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        razon.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        razon.setForeground(new java.awt.Color(153, 153, 153));
        razon.setText("Nombre de la empresa");
        razon.setBorder(null);
        razon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                razonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                razonFocusLost(evt);
            }
        });
        razon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                razonMouseClicked(evt);
            }
        });
        razon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                razonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                razonKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                razonKeyTyped(evt);
            }
        });
        jPanel1.add(razon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 280, -1));

        lineanombre.setForeground(new java.awt.Color(153, 153, 153));
        lineanombre.setText("_________________________________________");
        jPanel1.add(lineanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 290, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lineatelefono.setForeground(new java.awt.Color(153, 153, 153));
        lineatelefono.setText("___________________");
        jPanel1.add(lineatelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        telef.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        telef.setForeground(new java.awt.Color(153, 153, 153));
        telef.setText("000-000-0000");
        telef.setBorder(null);
        telef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefFocusLost(evt);
            }
        });
        telef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefMouseClicked(evt);
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
        jPanel1.add(telef, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        email.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("correo_electronico@email.com");
        email.setBorder(null);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 230, -1));

        lineaemail.setForeground(new java.awt.Color(153, 153, 153));
        lineaemail.setText("__________________________________________");
        lineaemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lineaemailMouseClicked(evt);
            }
        });
        jPanel1.add(lineaemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 330, -1));

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
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 104, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/cancelar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda2/imagenes/cancelar2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 100, -1));

        valemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valemail.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(valemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void razonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_razonFocusGained
        // TODO add your handling code here:
        if(razon.getText().equals("Nombre de la empresa"))
        razon.setText("");
    }//GEN-LAST:event_razonFocusGained

    private void razonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_razonFocusLost
        // TODO add your handling code here:

        if(razon.getText().equals("")){
            razon.setText("Nombre de la empresa");
        }
    }//GEN-LAST:event_razonFocusLost

    private void razonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_razonMouseClicked

    }//GEN-LAST:event_razonMouseClicked

    private void razonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_razonKeyPressed

    }//GEN-LAST:event_razonKeyPressed

    private void razonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_razonKeyReleased
        // TODO add your handling code here:
        if(razon.getText().length()>50) evt.consume();
        if(razon.getText().length()>3){lineanombre.setForeground(t);razon.setForeground(l);razonb=true;}
        else {lineanombre.setForeground(f);razon.setForeground(f);razonb=false;}
    }//GEN-LAST:event_razonKeyReleased

    private void razonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_razonKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_razonKeyTyped

    private void telefFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefFocusGained
        // TODO add your handling code here:
        if(telef.getText().equals("000-000-0000"))
        telef.setText("");
    }//GEN-LAST:event_telefFocusGained

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

    }//GEN-LAST:event_telefKeyPressed

    private void telefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() != 8) {
            if (telef.getText().length() == 3) {
                telef.setText(telef.getText() + "-");
            }
            if (telef.getText().length() == 7) {
                telef.setText(telef.getText() + "-");
            }
        }

        if (telef.getText().length() < 12) {
            lineatelefono.setForeground(f);
            telef.setForeground(f);
            telb = false;
        } else {
            lineatelefono.setForeground(t);
            telef.setForeground(l);
            telb = true;
        }
        validar();
    }//GEN-LAST:event_telefKeyReleased

    private void telefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if(c<'0' || c>'9' || telef.getText().length()>11) evt.consume();

    }//GEN-LAST:event_telefKeyTyped

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        // TODO add your handling code here:
        if(!emailb) email.setText("");
    }//GEN-LAST:event_emailMouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
        if(email.getText().equals("correo_electronico@email.com"))
        email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
        if(!emailb) email.setText("correo_electronico@email.com");
        if(email.getText().equals("")){
            email.setText("correo_electronico@email.com");
            emailb=false;
        }
    }//GEN-LAST:event_emailFocusLost

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed

        if(email.getText().equals("correo_electronico@email.com"))email.setText("");

    }//GEN-LAST:event_emailKeyPressed

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        Pattern p1=Pattern.compile("[A-Z]");
        Pattern p4=Pattern.compile("([.][a-z]{3,})");
        String s=email.getText().trim();
        Matcher letras = p1.matcher(s);
        Matcher dominio=p4.matcher(s);
        valemail.setForeground(f);

        if(letras.find())
        valemail.setText("Incorrecto: Solo letras minúscula");
        else if(email.getText().indexOf("@")==-1){
            valemail.setText("Incorrecto: Debe incluir @");
            lineaemail.setForeground(f);
            email.setForeground(f);
            emailb=false;
        }
        else if(!dominio.find()){
            valemail.setText("Incorrecto: Debe incluir un dominio(.com)");
            lineaemail.setForeground(f);
            email.setForeground(f);
            emailb=false;}
        else {
            valemail.setText("");
            lineaemail.setForeground(t);
            email.setForeground(l);
            emailb=true;

        }
        validar();
    }//GEN-LAST:event_emailKeyReleased

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped

        //          // TODO add your handling code here:
        //         // TODO add your handling code here:
        //        Pattern p1=Pattern.compile("[A-Z]");
        //      Pattern p2= Pattern.compile("@");
        //      Pattern p3=Pattern.compile("[à-ùÀ-Ù]");
        //      Pattern p4=Pattern.compile("([.][a-z]{3,})");
        //
        //        String s=email.getText().trim();
        //      Matcher letras = p1.matcher(s);
        //      Matcher arro= p2.matcher(s);
        //      Matcher acento=p3.matcher(s);
        //      Matcher dominio=p4.matcher(s);
        //      valemail.setForeground(e);
        //      if(letras.find() || !arro.find()||!dominio.find()){
            //        if(letras.find())
            //            valemail.setText("Incorrecto:Solo letras minúscula");
            //        else if(!arro.find())
            //            valemail.setText("Incorrecto: Hace falta el @");
            //        else
            //           valemail.setText("Incorrecto: Falta dominio");
            //      }
        //      else {
            //          valemail.setForeground(r);
            //          valemail.setText("Correcto");}
        ////     if(letras.find() || !arro.find() || acento.find() || !dominio.find() ){
            ////            valemail.setText("Incorrecto");
            ////            valemail.setForeground(Color.RED);
            ////            lineaemail.setForeground(Color.RED);}
        ////     else{
            ////           valemail.setText("Correcto");
            ////           valemail.setForeground(new Color(0,190,0));
            ////           lineaemail.setForeground(new Color(0,190,0));
            ////     }
    }//GEN-LAST:event_emailKeyTyped

    private void lineaemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineaemailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lineaemailMouseClicked

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        String cad = jLabel9.getText()+",'"+razon.getText()+"','"+telef.getText()+"','"+email.getText()+"'";
        conexion.consultas("insert into portillito.proveedor values("+cad+")");

        Correcto c;
        Error e;
        if(conexion.getConsulta()){
            c= new Correcto(new javax.swing.JFrame(),true);
            c.setVisible(true);
            this.dispose();
        }
        else{
            e=new Error(new javax.swing.JFrame(),true,"Proveedor no agregado");
            e.setVisible(true);
        }
        

    }//GEN-LAST:event_aceptarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void validar(){
     if (razonb && telb && emailb)aceptar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarProveedor dialog = new AgregarProveedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lineaemail;
    private javax.swing.JLabel lineanombre;
    private javax.swing.JLabel lineatelefono;
    private javax.swing.JTextField razon;
    private javax.swing.JTextField telef;
    private javax.swing.JLabel valemail;
    // End of variables declaration//GEN-END:variables
 Color t= new Color(116,219,239);
 Color f=new Color(246,84,84);
 Color l=new Color(2,117,216);
}
