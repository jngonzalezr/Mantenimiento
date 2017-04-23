package formularios;


public class Menu extends javax.swing.JFrame {

  
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        reportar = new javax.swing.JMenu();
        solicitudes = new javax.swing.JMenu();
        salir1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setExtendedState(6);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        reportar.setBorder(null);
        reportar.setForeground(new java.awt.Color(0, 0, 0));
        reportar.setText("Reportar");
        reportar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        reportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportarMouseClicked(evt);
            }
        });
        jMenuBar1.add(reportar);

        solicitudes.setBorder(null);
        solicitudes.setForeground(new java.awt.Color(0, 0, 0));
        solicitudes.setText("Solicitudes");
        solicitudes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solicitudesMouseClicked(evt);
            }
        });
        solicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudesActionPerformed(evt);
            }
        });
        jMenuBar1.add(solicitudes);

        salir1.setBorder(null);
        salir1.setForeground(new java.awt.Color(0, 0, 0));
        salir1.setText("Salir");
        salir1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir1MouseClicked(evt);
            }
        });
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(salir1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudesActionPerformed

    }//GEN-LAST:event_solicitudesActionPerformed

    private void solicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitudesMouseClicked
       Consulta con=new Consulta();
       con.setVisible(true);
    }//GEN-LAST:event_solicitudesMouseClicked

    private void salir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseClicked
         System.exit(0);
    }//GEN-LAST:event_salir1MouseClicked

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salir1ActionPerformed

    private void reportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportarMouseClicked
        Reportar report=new Reportar();
        report.setVisible(true);
    }//GEN-LAST:event_reportarMouseClicked

   
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu reportar;
    private javax.swing.JMenu salir1;
    private javax.swing.JMenu solicitudes;
    // End of variables declaration//GEN-END:variables
}
