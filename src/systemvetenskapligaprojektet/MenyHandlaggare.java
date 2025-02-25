/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemvetenskapligaprojektet;
import oru.inf.InfDB; //importeras i alla klasser som vi ska använda
import oru.inf.InfException; //importeras i alla klasser som vi ska använda
/**
 *
 * @author limme
 */
public class MenyHandlaggare extends javax.swing.JFrame {

    private static InfDB idb;
    private String inloggadAnvandare;
    /**
     * Creates new form Meny
     */
    public MenyHandlaggare(InfDB idb, String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
        lblInloggadAnvandare.setText(inloggadAnvandare);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMinaSidor = new javax.swing.JButton();
        btnMinaProjekt = new javax.swing.JButton();
        btnMinAvdelning = new javax.swing.JButton();
        btnHallbarhetsmal = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        lblInloggadAnvandare = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMinaSidor.setText("Mina Sidor");
        btnMinaSidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinaSidorActionPerformed(evt);
            }
        });

        btnMinaProjekt.setText("Mina Projekt");
        btnMinaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinaProjektActionPerformed(evt);
            }
        });

        btnMinAvdelning.setText("Min avdelning");
        btnMinAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinAvdelningActionPerformed(evt);
            }
        });

        btnHallbarhetsmal.setText("Hållbarhetsmål");
        btnHallbarhetsmal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallbarhetsmalActionPerformed(evt);
            }
        });

        btnLoggaUt.setText("Logga Ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInloggadAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnHallbarhetsmal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMinaSidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMinaProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMinAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLoggaUt)))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblInloggadAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMinaSidor)
                .addGap(18, 18, 18)
                .addComponent(btnMinaProjekt)
                .addGap(18, 18, 18)
                .addComponent(btnMinAvdelning)
                .addGap(18, 18, 18)
                .addComponent(btnHallbarhetsmal)
                .addGap(18, 18, 18)
                .addComponent(btnLoggaUt)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinaSidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinaSidorActionPerformed
        new MinaSidor(idb,inloggadAnvandare).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMinaSidorActionPerformed

    private void btnMinaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinaProjektActionPerformed
        new MinaProjekt(idb, inloggadAnvandare).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMinaProjektActionPerformed

    private void btnMinAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinAvdelningActionPerformed
        new MinAvdelning(idb, inloggadAnvandare).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMinAvdelningActionPerformed

    private void btnHallbarhetsmalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallbarhetsmalActionPerformed
        new Hallbarhetsmal(idb).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHallbarhetsmalActionPerformed

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        new Inloggning(idb).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoggaUtActionPerformed

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
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenyHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MenyHandlaggare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHallbarhetsmal;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnMinAvdelning;
    private javax.swing.JButton btnMinaProjekt;
    private javax.swing.JButton btnMinaSidor;
    private javax.swing.JLabel lblInloggadAnvandare;
    // End of variables declaration//GEN-END:variables
}
