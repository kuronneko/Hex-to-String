/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import build.tableController;
import javax.swing.BorderFactory;

/**
 *
 * @author kuro
 */
public class messageChoice extends javax.swing.JFrame {
private int x,y;
public tablaM mainWin;
    /**
     * Creates new form messageBox
     */
    public messageChoice() {
        initComponents();
    }
        public messageChoice(tablaM WW, String message) {
        initComponents();
        mainWin = WW;
        
        aceptBtn.setContentAreaFilled(false);
        aceptBtn.setOpaque(true);
                aceptBtn1.setContentAreaFilled(false);
        aceptBtn1.setOpaque(true);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, (new java.awt.Color(255, 255, 255))));
        messageText.setText(message);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        toolbar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        barText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        messageText = new javax.swing.JLabel();
        aceptBtn = new javax.swing.JButton();
        aceptBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Close");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        toolbar.setBackground(new java.awt.Color(24, 25, 29));
        toolbar.setToolTipText("");
        toolbar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        toolbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                toolbarMouseDragged(evt);
            }
        });
        toolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                toolbarMousePressed(evt);
            }
        });
        toolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_close_1814098(3).png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/closePress.png"))); // NOI18N
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        toolbar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 20));

        barText.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        barText.setForeground(new java.awt.Color(102, 102, 102));
        barText.setText("Message");
        barText.setToolTipText("");
        toolbar.add(barText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/freebsd_start_here_free_bsd-24.png"))); // NOI18N
        toolbar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        messageText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        messageText.setForeground(new java.awt.Color(255, 255, 255));
        messageText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageText.setText("xxxxxxxxxxxxxxxxxxx");
        messageText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        aceptBtn.setBackground(new java.awt.Color(0, 0, 0));
        aceptBtn.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        aceptBtn.setForeground(new java.awt.Color(255, 255, 255));
        aceptBtn.setText("Exit and save");
        aceptBtn.setAutoscrolls(true);
        aceptBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        aceptBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                aceptBtnMouseMoved(evt);
            }
        });
        aceptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptBtnMouseExited(evt);
            }
        });
        aceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptBtnActionPerformed(evt);
            }
        });

        aceptBtn1.setBackground(new java.awt.Color(0, 0, 0));
        aceptBtn1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        aceptBtn1.setForeground(new java.awt.Color(255, 255, 255));
        aceptBtn1.setText("Cancel");
        aceptBtn1.setAutoscrolls(true);
        aceptBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        aceptBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptBtn1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                aceptBtn1MouseMoved(evt);
            }
        });
        aceptBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptBtn1MouseExited(evt);
            }
        });
        aceptBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aceptBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(messageText)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        jLabel4.setEnabled(false);
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setEnabled(true);
    }//GEN-LAST:event_jLabel4MouseExited

    private void toolbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_toolbarMouseDragged

    private void toolbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_toolbarMousePressed

    private void aceptBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptBtnMouseMoved
        aceptBtn.setBackground(new java.awt.Color(70, 70, 70));
    }//GEN-LAST:event_aceptBtnMouseMoved

    private void aceptBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptBtnMouseExited
        aceptBtn.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_aceptBtnMouseExited

    private void aceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptBtnActionPerformed
      
       tableController tableController =  new tableController(mainWin.getTablecontent6());
       tableController.saveAllTable();
        System.exit(0);
   
    }//GEN-LAST:event_aceptBtnActionPerformed

    private void aceptBtn1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptBtn1MouseMoved
        aceptBtn1.setBackground(new java.awt.Color(70, 70, 70));    }//GEN-LAST:event_aceptBtn1MouseMoved

    private void aceptBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptBtn1MouseExited
        aceptBtn1.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_aceptBtn1MouseExited

    private void aceptBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptBtn1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_aceptBtn1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(messageChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(messageChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(messageChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(messageChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new messageChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptBtn;
    private javax.swing.JButton aceptBtn1;
    private javax.swing.JLabel barText;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageText;
    private javax.swing.JPanel toolbar;
    // End of variables declaration//GEN-END:variables
}
