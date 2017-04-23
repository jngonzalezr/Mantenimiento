package formularios;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import poo.Conectar;
import poo.Prioridad;
import poo.TipoTarea;

public class Reportar extends javax.swing.JFrame {
 int t_tarea,estado,prioridad;
 String fecha;
          
    public Reportar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
 
    void limpiar(){
      tipo_tarea.setSelectedItem("Limpieza");
      cbxprd.setSelectedItem("Normal");
      area.setText("");
      zona.setText("");
      lugar.setText("");
      detalle.setText("");
      txtfecha.setText(null);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        area = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lugar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        zona = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalle = new javax.swing.JTextArea();
        cbxprd = new javax.swing.JComboBox<>();
        tipo_tarea = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfecha = new datechooser.beans.DateChooserCombo();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportar Problema");
        setMaximumSize(new java.awt.Dimension(665, 515));
        setMinimumSize(new java.awt.Dimension(665, 515));
        setPreferredSize(new java.awt.Dimension(665, 515));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipo De Tarea");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 120, 30);

        cancel.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(400, 410, 130, 40);

        guardar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar);
        guardar.setBounds(160, 410, 130, 40);

        area.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        area.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaActionPerformed(evt);
            }
        });
        getContentPane().add(area);
        area.setBounds(150, 90, 160, 30);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Area");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 90, 77, 30);

        lugar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lugar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(lugar);
        lugar.setBounds(150, 210, 160, 30);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lugar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 210, 77, 30);

        zona.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        zona.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(zona);
        zona.setBounds(150, 150, 160, 30);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Prioridad");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 210, 90, 30);

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Detalle");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 280, 77, 30);

        detalle.setColumns(20);
        detalle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        detalle.setRows(5);
        jScrollPane1.setViewportView(detalle);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 270, 440, 90);

        cbxprd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxprd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Importante", "Urgente" }));
        cbxprd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbxprdFocusLost(evt);
            }
        });
        getContentPane().add(cbxprd);
        cbxprd.setBounds(430, 210, 160, 30);

        tipo_tarea.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tipo_tarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpieza", "Electrico", "Mecanico", "Plomeria", "Refrigeracion", "Carpinteria", "Area Verde", "Preventivo", "Pintura", "TI", "" }));
        tipo_tarea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tipo_tareaFocusLost(evt);
            }
        });
        getContentPane().add(tipo_tarea);
        tipo_tarea.setBounds(150, 30, 160, 30);

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Zona");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 150, 77, 30);

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 150, 77, 30);

        txtfecha.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    txtfecha.setFormat(2);
    try {
        txtfecha.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2017, 3, 22),
            new java.util.GregorianCalendar(2017, 3, 22))));
} catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
    e1.printStackTrace();
    }
    txtfecha.setLocale(new java.util.Locale("es", "DO", ""));
    txtfecha.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    getContentPane().add(txtfecha);
    txtfecha.setBounds(430, 150, 160, 30);

    jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu_fondo.png"))); // NOI18N
    getContentPane().add(jLabel2);
    jLabel2.setBounds(0, 0, 1020, 500);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       limpiar();
    }//GEN-LAST:event_cancelActionPerformed

    private void tipo_tareaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tipo_tareaFocusLost
        TipoTarea tt=new TipoTarea();
        t_tarea=tt.numerico((String) tipo_tarea.getSelectedItem());
       
    }//GEN-LAST:event_tipo_tareaFocusLost

    private void cbxprdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxprdFocusLost
        Prioridad prd=new Prioridad();
        prioridad=prd.numerico((String)cbxprd.getSelectedItem());
         
    }//GEN-LAST:event_cbxprdFocusLost

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        try {
            String sql="insert into solicitudes(user,tipo_tarea,area,detalle,fecha)values(1,'"+t_tarea+"',5,'"+detalle.getText()+"','"+txtfecha.getText()+"')";
            String sql1="insert into areas(area,zona,lugar)values('"+area.getText()+"','"+zona.getText()+"','"+lugar.getText()+"')";
            
            PreparedStatement pst=con.prepareStatement(sql);
            PreparedStatement pst1=con.prepareStatement(sql1);
            
            int x,y;
            
            x=pst.executeUpdate();
            y=pst1.executeUpdate();
             if(x>0 && y>0){
               JOptionPane.showMessageDialog(null,"Solicitudad Completada");
               limpiar();
             }
        } catch (SQLException e) {
          System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_guardarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Reportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> cbxprd;
    private javax.swing.JTextArea detalle;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lugar;
    private javax.swing.JComboBox<String> tipo_tarea;
    private datechooser.beans.DateChooserCombo txtfecha;
    private javax.swing.JTextField zona;
    // End of variables declaration//GEN-END:variables
Conectar cn=new Conectar();
Connection con=cn.conexion();
}
