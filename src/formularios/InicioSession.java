package formularios;

import javax.swing.JOptionPane;


public class InicioSession extends javax.swing.JFrame {
 
    public InicioSession() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtclave = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(280, 280));
        setMinimumSize(new java.awt.Dimension(280, 280));
        setPreferredSize(new java.awt.Dimension(280, 280));
        setResizable(false);
        getContentPane().setLayout(null);

        iniciar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        iniciar.setForeground(new java.awt.Color(0, 0, 0));
        iniciar.setText("Entrar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar);
        iniciar.setBounds(80, 190, 94, 42);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(" Usuario :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 120, 30);

        txtuser.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtuser);
        txtuser.setBounds(50, 50, 175, 33);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(" Contraseña :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 100, 150, 30);

        txtclave.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        txtclave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtclave);
        txtclave.setBounds(50, 140, 175, 33);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_fondo.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 280, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        if(txtuser.getText().equals("samy") && txtclave.getText().equals("19931017")){
        Menu men=new Menu();
        men.setVisible(true);
        }else{JOptionPane.showMessageDialog(null,"Usuario O Contraseña Incorrecta");
        }
    }//GEN-LAST:event_iniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
