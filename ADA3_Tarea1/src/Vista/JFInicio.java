/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ArchivoSalida;
import Modelo.Usuarios;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class JFInicio extends javax.swing.JFrame {

    /**
     * Creates new form JFInicio
     */
    public JFInicio() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btmRegresarLogin = new javax.swing.JButton();
        btmCapturar = new javax.swing.JButton();
        btmModificar = new javax.swing.JButton();
        lbTitulo2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 100));
        setResizable(false);

        lbTitulo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lbTitulo.setText("INICIO");

        btmRegresarLogin.setText("Cerrar sesión");
        btmRegresarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btmRegresarLoginMouseClicked(evt);
            }
        });

        btmCapturar.setText("Capturar");
        btmCapturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btmCapturarMouseClicked(evt);
            }
        });
        btmCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCapturarActionPerformed(evt);
            }
        });

        btmModificar.setText("Modificar");
        btmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmModificarActionPerformed(evt);
            }
        });

        lbTitulo2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lbTitulo2.setText("Calificaciones");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btmCapturar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btmModificar)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbTitulo)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btmRegresarLogin)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(lbTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmModificar)
                    .addComponent(btmCapturar))
                .addGap(74, 74, 74)
                .addComponent(btmRegresarLogin)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmRegresarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmRegresarLoginMouseClicked
        this.dispose();
        JFlogin login = new JFlogin();
        login.setVisible(true);
    }//GEN-LAST:event_btmRegresarLoginMouseClicked

    private void btmCapturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmCapturarMouseClicked
        this.dispose();
        JFRegistro_Calif rc = new JFRegistro_Calif();
        rc.setVisible(true);
    }//GEN-LAST:event_btmCapturarMouseClicked


    private void btmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmModificarActionPerformed
        this.dispose();
        JFModificar modificar = new JFModificar();
        modificar.setVisible(true);
    }//GEN-LAST:event_btmModificarActionPerformed

    private void btmCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCapturarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btmCapturarActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       /* JFlogin login = new JFlogin();
        List<Usuarios> usuariosList = login.readFile() ;
        txtNameUser.setText();*/
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
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCapturar;
    private javax.swing.JButton btmModificar;
    private javax.swing.JButton btmRegresarLogin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTitulo2;
    // End of variables declaration//GEN-END:variables
}
