/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author MarkLester
 */
public class EarnXP extends javax.swing.JFrame {

    /**
     * Creates new form EarnXP
     */
    public EarnXP() {
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

        NI1 = new javax.swing.JLabel();
        NI2 = new javax.swing.JLabel();
        CollectButton = new javax.swing.JPanel();
        NI3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NI1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NI1.setText("CONGRATULATIONS!");

        NI2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NI2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/star.png"))); // NOI18N
        NI2.setText("You've earned 50 XP Points!");

        CollectButton.setBackground(new java.awt.Color(0, 102, 51));
        CollectButton.setForeground(new java.awt.Color(204, 255, 204));
        CollectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CollectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CollectButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CollectButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CollectButtonMouseExited(evt);
            }
        });

        NI3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        NI3.setForeground(new java.awt.Color(255, 255, 255));
        NI3.setText("COLLECT");
        NI3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NI3FocusGained(evt);
            }
        });

        javax.swing.GroupLayout CollectButtonLayout = new javax.swing.GroupLayout(CollectButton);
        CollectButton.setLayout(CollectButtonLayout);
        CollectButtonLayout.setHorizontalGroup(
            CollectButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CollectButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(NI3)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        CollectButtonLayout.setVerticalGroup(
            CollectButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NI3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NI2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(NI1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(CollectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(NI1)
                .addGap(18, 18, 18)
                .addComponent(NI2)
                .addGap(18, 18, 18)
                .addComponent(CollectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NI3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NI3FocusGained

    }//GEN-LAST:event_NI3FocusGained

    private void CollectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CollectButtonMouseClicked
           this.setVisible(false);
    }//GEN-LAST:event_CollectButtonMouseClicked

    private void CollectButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CollectButtonMouseEntered

    }//GEN-LAST:event_CollectButtonMouseEntered

    private void CollectButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CollectButtonMouseExited

    }//GEN-LAST:event_CollectButtonMouseExited

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
            java.util.logging.Logger.getLogger(EarnXP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EarnXP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EarnXP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EarnXP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EarnXP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CollectButton;
    private javax.swing.JLabel NI1;
    private javax.swing.JLabel NI2;
    private javax.swing.JLabel NI3;
    // End of variables declaration//GEN-END:variables
}
