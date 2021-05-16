/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.odontologico;

import Fuentes.fuentes;
import java.awt.Color;

/**
 *
 * @author patty
 */
public class PrincipalDoctor extends javax.swing.JDialog {

    /**
     * Creates new form PrincipalDoctor
     */
    fuentes tipofuentes;
    public PrincipalDoctor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tipofuentes = new fuentes();
        //bRegistrarPaciente.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        Informe.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        Paciente.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel4.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 20));
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel3, "src/Imagenes/Informe.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/Imagenes/paciente 2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/Imagenes/iconu.png");
        Paciente.setBackground(new Color(246,245,244));
        Informe.setBackground(new Color(246,245,244));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Paciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Informe = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Paciente.setBackground(new java.awt.Color(246, 245, 244));
        Paciente.setText("Paciente");
        Paciente.setBorderPainted(false);
        Paciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Paciente.setPreferredSize(new java.awt.Dimension(111, 23));
        Paciente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Paciente.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteActionPerformed(evt);
            }
        });
        getContentPane().add(Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 210, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 60, 60));

        jLabel4.setText("Doctor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 60, 20));

        jPanel1.setBackground(new java.awt.Color(246, 245, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Informe.setBackground(new java.awt.Color(246, 245, 244));
        Informe.setText("Informe");
        Informe.setBorderPainted(false);
        Informe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Informe.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Informe.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformeActionPerformed(evt);
            }
        });
        jPanel1.add(Informe, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 210, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 160, 160));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 160, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformeActionPerformed

    private void PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PacienteActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrincipalDoctor dialog = new PrincipalDoctor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Informe;
    private javax.swing.JButton Paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
