
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Galaxy1
 */
public class Row extends javax.swing.JFrame {

    /**
     * Creates new form Row
     */
    public Row() {
        initComponents();
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        compilerDesign = new javax.swing.JRadioButton();
        computerNetwork = new javax.swing.JRadioButton();
        management = new javax.swing.JRadioButton();
        operationalResearch = new javax.swing.JRadioButton();
        unix = new javax.swing.JRadioButton();
        computerGraphics = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        compilerDesign.setText("Compiler Design");
        compilerDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilerDesignActionPerformed(evt);
            }
        });

        computerNetwork.setText("Computer Network");
        computerNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerNetworkActionPerformed(evt);
            }
        });

        management.setText("Management & Enterpreneurship");
        management.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managementActionPerformed(evt);
            }
        });

        operationalResearch.setText("Operational Research");
        operationalResearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationalResearchActionPerformed(evt);
            }
        });

        unix.setText("Unix");
        unix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unixActionPerformed(evt);
            }
        });

        computerGraphics.setText("Computer Graphics");
        computerGraphics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerGraphicsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(management)
                    .addComponent(computerNetwork)
                    .addComponent(operationalResearch)
                    .addComponent(compilerDesign)
                    .addComponent(unix)
                    .addComponent(computerGraphics))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(computerGraphics)
                .addGap(18, 18, 18)
                .addComponent(unix)
                .addGap(18, 18, 18)
                .addComponent(compilerDesign)
                .addGap(18, 18, 18)
                .addComponent(operationalResearch)
                .addGap(18, 18, 18)
                .addComponent(computerNetwork)
                .addGap(18, 18, 18)
                .addComponent(management)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Choose Subject To View Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void computerGraphicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerGraphicsActionPerformed
        // TODO add your handling code here:
        TableCG t = new TableCG();
        t.setVisible(true);
        close();
    }//GEN-LAST:event_computerGraphicsActionPerformed

    private void unixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unixActionPerformed
        // TODO add your handling code here:
        TableUnix t = new TableUnix();
        t.setVisible(true);
        close();
    }//GEN-LAST:event_unixActionPerformed

    private void compilerDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilerDesignActionPerformed
        // TODO add your handling code here:
        TableCD t = new TableCD();
        t.setVisible(true);
        close();
    }//GEN-LAST:event_compilerDesignActionPerformed

    private void operationalResearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationalResearchActionPerformed
        // TODO add your handling code here:
        TableOR t = new TableOR();
        t.setVisible(true);
        close();
    }//GEN-LAST:event_operationalResearchActionPerformed

    private void computerNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerNetworkActionPerformed
        // TODO add your handling code here:
        TableCN t = new TableCN();
        t.setVisible(true);
        close();
    }//GEN-LAST:event_computerNetworkActionPerformed

    private void managementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managementActionPerformed
        // TODO add your handling code here:
        TableManagement t = new TableManagement();
        t.setVisible(true);
        close();
    }//GEN-LAST:event_managementActionPerformed

    
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
            java.util.logging.Logger.getLogger(Row.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Row.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Row.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Row.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Row().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton compilerDesign;
    private javax.swing.JRadioButton computerGraphics;
    private javax.swing.JRadioButton computerNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton management;
    private javax.swing.JRadioButton operationalResearch;
    private javax.swing.JRadioButton unix;
    // End of variables declaration//GEN-END:variables
}
